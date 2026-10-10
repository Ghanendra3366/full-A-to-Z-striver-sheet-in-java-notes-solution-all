"""Check curriculum completeness, authoring parity and local Markdown links."""
import json
import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
rows = json.loads((ROOT / 'curriculum/manifest.json').read_text(encoding='utf-8'))
assert len([r for r in rows if r['id'].startswith('A2Z-')]) == 495
assert len({r['id'] for r in rows}) == len(rows)
assert len({r['path'] for r in rows}) == len(rows)
content = {}
for p in (ROOT / 'tools/content').glob('*.json'):
    content.update(json.loads(p.read_text(encoding='utf-8')))
for r in rows:
    assert r['status'] in ('implemented', 'theory'), r['id']
    folder = ROOT / r['path']
    assert (folder / 'README.md').is_file(), r['id']
    if r['status'] == 'implemented':
        assert (folder / 'Solution.java').read_text(encoding='utf-8') == content[r['title']]['source'], r['id']
        assert 'expected' in r, r['id']
errors = []
files = [ROOT / 'README.md', ROOT / 'CONTRIBUTING.md', ROOT / 'VALIDATION.md', ROOT / 'curriculum/COVERAGE.md']
files += list((ROOT / 'topics').rglob('*.md'))
for p in files:
    if not p.exists(): continue
    for target in re.findall(r'\[[^\]]*\]\(([^)]+)\)', p.read_text(encoding='utf-8')):
        if re.match(r'\w+://', target) or target.startswith('#'): continue
        local = target.split('#', 1)[0]
        if not (p.parent / local).exists(): errors.append('%s: %s' % (p.relative_to(ROOT), target))
assert not errors, '\n'.join(errors)
print('%d curriculum entries and %d Markdown files audited; no missing local links.' % (len(rows), len(files)))
