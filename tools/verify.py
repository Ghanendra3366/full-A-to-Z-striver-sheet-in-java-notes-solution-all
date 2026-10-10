"""Compile every solution independently against Java 8, then check its example."""
import concurrent.futures
import json
import re
import shutil
import subprocess
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
def normalize(s):
    return '\n'.join(line.rstrip() for line in s.replace('\r\n', '\n').strip().splitlines())

def check(row, release):
    output = ROOT / 'build' / row['id']
    output.mkdir(parents=True, exist_ok=True)
    src = ROOT / row['path'] / 'Solution.java'
    args = ['javac', '-encoding', 'UTF-8', '-d', str(output)]
    args += ['--release', '8'] if release else ['-source', '8', '-target', '8']
    p = subprocess.run(args + [str(src)], capture_output=True, text=True, timeout=60)
    if p.returncode:
        return row['id'] + ' compile: ' + p.stderr
    p = subprocess.run(['java', '-cp', str(output), 'Solution'], capture_output=True, text=True, timeout=15)
    if p.returncode:
        return row['id'] + ' run: ' + p.stderr
    if normalize(p.stdout) != normalize(row['expected']):
        return '%s example: expected %r, got %r' % (row['id'], row['expected'], p.stdout)
    return None

def main():
    if not shutil.which('javac') or not shutil.which('java'):
        raise SystemExit('Install a JDK and put java/javac on PATH.')
    version = subprocess.run(['javac', '-version'], capture_output=True, text=True, check=True)
    release = not re.search(r'javac 1\.8\.', version.stdout + version.stderr)
    rows = json.loads((ROOT / 'curriculum/manifest.json').read_text(encoding='utf-8'))
    runnable = [r for r in rows if r['status'] == 'implemented']
    with concurrent.futures.ThreadPoolExecutor(max_workers=4) as pool:
        results = list(pool.map(lambda row: check(row, release), runnable))
    failures = [x for x in results if x]
    for failure in failures:
        print(failure)
    print('%d independent Java 8 compile/example checks; %d failures.' % (len(runnable), len(failures)))
    raise SystemExit(bool(failures))

if __name__ == '__main__':
    main()
