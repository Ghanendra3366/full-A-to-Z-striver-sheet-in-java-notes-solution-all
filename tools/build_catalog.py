"""Build the readable topic tree from the explicitly supplied curriculum.

Run with Python 3.8+. Solutions are authored in tools/content/*.json.
No PDF text or third-party code is redistributed by this script.
"""
import json
import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
MODULES = ['Beginner Problems', 'Sorting', 'Arrays', 'Hashing', 'Binary Search',
           'Strings (Basic and Medium)', 'Recursion', 'Linked-List', 'Bit Manipulation',
           'Greedy Algorithms', 'Sliding Window / 2 Pointer', 'Stack / Queues',
           'Binary Trees', 'Binary Search Trees', 'Heaps', 'Graphs',
           'Dynamic Programming', 'Tries', 'Strings (Advanced Algo)', 'Maths']

def slug(s):
    return re.sub(r'[^a-z0-9]+', '-', s.lower()).strip('-')

def inventory(text):
    lines = [x.strip() for x in text.splitlines() if x.strip()]
    rows, topic, section = [], None, None
    for i, line in enumerate(lines):
        if line in MODULES:
            topic, section = line, None
        elif re.fullmatch(r'0/\d+', line):
            continue
        elif i + 1 < len(lines) and re.fullmatch(r'0/\d+', lines[i + 1]):
            section = line
        elif line in ['Contest', 'Start contest'] or line.startswith('•'):
            continue
        elif topic and section:
            title = re.sub(r'(Basic|Core|Pro)$', '', line).strip()
            rows.append(dict(topic=topic, section=section, title=title))
    missing = {
        'Fundamentals': ['Binary Search', 'Lower Bound', 'Upper Bound'],
        'Logic Building': ['Search Insert Position', 'Floor and Ceil in Sorted Array',
            'First and Last Occurrence', 'Count Occurrences in Sorted Array',
            'Search in Rotated Sorted Array I', 'Search in Rotated Sorted Array II',
            'Minimum in Rotated Sorted Array', 'Rotation Count', 'Single Element in Sorted Array'],
        'On answers': ['Square Root of a Number', 'Nth Root of a Number', 'Koko Eating Bananas',
            'Minimum Days to Make Bouquets', 'Smallest Divisor Given a Threshold',
            'Capacity to Ship Packages Within D Days', 'Kth Missing Positive Number', 'Aggressive Cows'],
        'FAQs': ['Find Peak Element', 'Allocate Books', 'Split Array Largest Sum',
            "Painter's Partition", 'Minimize Maximum Distance Between Gas Stations',
            'Median of Two Sorted Arrays', 'Kth Element of Two Sorted Arrays'],
        '2D Arrays': ['Row with Maximum Ones', 'Search a 2D Matrix I', 'Search a 2D Matrix II',
            'Find Peak Element in a 2D Matrix', 'Median of a Row Wise Sorted Matrix']}
    at = next(i for i, row in enumerate(rows) if MODULES.index(row['topic']) > 4)
    rows[at:at] = [dict(topic='Binary Search', section=sec, title=t,
                         provenance='Supplement: collapsed Binary Search section; editorial ordering')
                   for sec, titles in missing.items() for t in titles]
    for i, row in enumerate(rows, 1):
        row['id'] = 'A2Z-%03d' % i
        row['path'] = 'topics/%02d-%s/%s/%s' % (MODULES.index(row['topic']) + 1,
            slug(row['topic']), slug(row['section']), slug(row['title']))
    return rows

CONTENT = {}
SUPPLEMENTS = []
def supplement(title, topic):
    SUPPLEMENTS.append(dict(topic=topic, section='Reference supplements', title=title,
        provenance='Supplement: additional reference-PDF topic or explicitly separated variant'))

def add(title, code, example, expected, problem, approach, complexity, trace, pitfalls,
        alternatives='', brute=''):
    CONTENT[title] = dict(code=code, example=example, expected=expected, problem=problem,
        approach=approach, complexity=complexity, trace=trace, pitfalls=pitfalls,
        alternatives=alternatives, brute=brute)

def theory(title, body):
    CONTENT[title] = dict(theory=body)

def build():
    rows = inventory((ROOT / 'curriculum/source-list.txt').read_text(encoding='utf-8'))
    CONTENT.clear()
    for path in sorted((ROOT / 'tools/content').glob('*.json')):
        CONTENT.update(json.loads(path.read_text(encoding='utf-8')))
    SUPPLEMENTS[:] = json.loads((ROOT / 'curriculum/supplements.json').read_text(encoding='utf-8'))
    for i, extra in enumerate(SUPPLEMENTS, 1):
        extra['id'] = 'SUP-%03d' % i
        extra['path'] = 'topics/%02d-%s/reference-supplements/%s' % (
            MODULES.index(extra['topic']) + 1, slug(extra['topic']), slug(extra['title']))
        rows.append(extra)
    index = ['# Curriculum coverage', '',
        'Inventory: 495 supplied curriculum items, plus explicitly marked SUP reference supplements. Binary Search titles were collapsed in the source and are explicitly supplemented.', '',
        'Implemented means runnable Java 8 code plus authored notes. Theory means an authored concept lesson. Pending means work remains; a directory or checklist is not a solution.', '',
        '| ID | Topic / subsection | Problem | Status |', '|---|---|---|---|']
    manifest = []
    for row in rows:
        c = CONTENT.get(row['title'])
        folder = ROOT / row['path']
        if c:
            folder.mkdir(parents=True, exist_ok=True)
            if 'theory' in c:
                status = 'theory'
                note = '# %s\n\n%s\n' % (row['title'], c['theory'])
            else:
                status = 'implemented'
                source = c['source']
                (folder / 'Solution.java').write_text(source, encoding='utf-8')
                note = ('# %s\n\n## Problem and contract\n\n%s\n\n'
                    '## Approach\n\n%s\n\n## Other approaches\n\n%s\n\n'
                    '## Dry run\n\n%s\n\n## Complexity\n\n%s\n\n'
                    '## Edge cases and Java 8 mistakes\n\n%s\n\n'
                    '## Run\n\nFrom this folder:\n\n```sh\njavac Solution.java\njava Solution\n```\n\n'
                    'Expected output:\n\n```text\n%s\n```\n\n'
                    'Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.\n') % (
                        row['title'], c['problem'], c['approach'],
                        c['alternatives'] or 'The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.',
                        c['trace'], c['complexity'], c['pitfalls'], c['expected'])
            note += '\n[Curriculum index](../../../../curriculum/COVERAGE.md)\n'
            (folder / 'README.md').write_text(note, encoding='utf-8')
        else:
            status = 'pending'
        row['status'] = status
        if c and 'expected' in c:
            row['expected'] = c['expected']
        target = '../' + row['path'] + '/README.md'
        title = '[%s](%s)' % (row['title'], target) if c else row['title']
        index.append('| %s | %s / %s | %s | %s |' % (row['id'], row['topic'], row['section'], title, status))
        manifest.append(row)
    counts = {s: sum(r['status'] == s for r in rows) for s in ['implemented', 'theory', 'pending']}
    index[2:2] = ['**%s**' % ', '.join('%s: %d' % (k, v) for k, v in counts.items()), '']
    (ROOT / 'curriculum/manifest.json').write_text(json.dumps(manifest, indent=2, ensure_ascii=False) + '\n', encoding='utf-8')
    (ROOT / 'curriculum/COVERAGE.md').write_text('\n'.join(index) + '\n', encoding='utf-8')
    for module in MODULES:
        folder = ROOT / ('topics/%02d-%s' % (MODULES.index(module) + 1, slug(module)))
        folder.mkdir(parents=True, exist_ok=True)
        lines = ['# ' + module, '', 'Follow the section order below. Pending items are listed in the [full coverage index](../../curriculum/COVERAGE.md).', '']
        subset = [r for r in rows if r['topic'] == module]
        sec = None
        for row in subset:
            if row['section'] != sec:
                sec = row['section']
                lines += ['## ' + sec, '']
            link = '[%s](%s/README.md)' % (row['title'], row['path'].split('/', 2)[2]) if row['status'] != 'pending' else row['title']
            lines += ['- %s — %s' % (link, row['status'])]
        (folder / 'README.md').write_text('\n'.join(lines) + '\n', encoding='utf-8')
    print(json.dumps(counts))

if __name__ == '__main__':
    build()
