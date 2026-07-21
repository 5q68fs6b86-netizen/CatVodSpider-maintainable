#!/usr/bin/env python3
from pathlib import Path
import re
root = Path(__file__).resolve().parents[1]
priority = (root / 'docs' / 'PORT_PRIORITY.md').read_text(encoding='utf-8')
status = (root / 'docs' / 'PORT_STATUS.md').read_text(encoding='utf-8')
done = set(re.findall(r'\|\s*`(\w+)`\s*\|\s*OK\s*\|', status))
existing = {p.stem for p in (root / 'app/src/main/java/com/github/catvod/spider').glob('*.java')}
in_a = False
print('Next A_easy still NEED_WRITE:')
for line in priority.splitlines():
    if line.startswith('## A_easy'):
        in_a = True
        continue
    if line.startswith('## ') and in_a:
        break
    m = re.match(r'\|\s*`(\w+)`\s*\|', line)
    if not m or not in_a:
        continue
    name = m.group(1)
    if name in done or name in existing and name in done:
        continue
    if name in existing and name not in done:
        # file exists but maybe skeleton
        pass
    if name in done:
        continue
    mark = 'HAS_FILE' if name in existing else 'NEED_WRITE'
    if mark == 'NEED_WRITE':
        print(f'  - {name}')
print('\nDone clean ports:', ', '.join(sorted(done)))
