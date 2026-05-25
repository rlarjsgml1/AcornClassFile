---
description: Mark a TODO item done in today's daily note
agent: build
---
Mark a TODO item as done in today's daily note.

Context:
- Selector from command arguments: `$ARGUMENTS`
- Today's date in Asia/Seoul: !`TZ=Asia/Seoul date +%F`
- Daily note directory: `09-데일리노트`
- Target file pattern: `09-데일리노트/YYYY-MM-DD.md`
- Todo section heading: `## 📋 Todo`

Rules:
1. Resolve the target file as `09-데일리노트/<today>.md` using the injected date above.
2. Read the target file before editing.
3. Find the `## 📋 Todo` section. The section ends at the next `## ` heading or end of file.
4. Build a numbered list from incomplete TODO items only: lines matching `- [ ] text`.
5. If `$ARGUMENTS` is empty, show the numbered incomplete TODO list and ask the user to choose one number. Do not edit until the user chooses.
6. If `$ARGUMENTS` is a number, mark the matching numbered incomplete TODO item as done.
7. If `$ARGUMENTS` is text, mark the incomplete TODO item whose text exactly matches it. If multiple items match, ask the user to choose a number.
8. Mark done by changing only the checkbox marker from `- [ ]` to `- [x]`.
9. If there are no incomplete TODO items, say `완료할 TODO가 없습니다.` and do not edit.
10. If the daily note file or Todo section is missing, report what is missing and do not create anything.
11. Modify only the resolved daily note file, and only the selected TODO checkbox marker. Do not reorder or reformat TODO items.

After editing, summarize the completed TODO item and the target file path.
