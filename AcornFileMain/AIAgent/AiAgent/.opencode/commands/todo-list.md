---
description: List TODO items from today's daily note
agent: build
---
List TODO items from today's daily note as a numbered list.

Context:
- Today's date in Asia/Seoul: !`TZ=Asia/Seoul date +%F`
- Daily note directory: `09-데일리노트`
- Target file pattern: `09-데일리노트/YYYY-MM-DD.md`
- Todo section heading: `## 📋 Todo`

Rules:
1. Resolve the target file as `09-데일리노트/<today>.md` using the injected date above.
2. Read the target file only. This command must not modify files.
3. Find the `## 📋 Todo` section. The section ends at the next `## ` heading or end of file.
4. Extract markdown checkbox items in their existing order:
   - Incomplete: `- [ ] text`
   - Done: `- [x] text` or `- [X] text`
5. Show the items as a numbered list, preserving completion state.
6. If there are no TODO items, say `오늘 TODO가 없습니다.`
7. If the daily note file or Todo section is missing, report what is missing and do not create anything.

Output format:

```text
1. [ ] first todo
2. [x] finished todo
```
