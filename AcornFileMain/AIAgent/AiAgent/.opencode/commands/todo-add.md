---
description: Add a TODO item to today's daily note
agent: build
---
Add a TODO item to today's daily note.

Context:
- Todo text from command arguments: `$ARGUMENTS`
- Today's date in Asia/Seoul: !`TZ=Asia/Seoul date +%F`
- Daily note directory: `09-데일리노트`
- Target file pattern: `09-데일리노트/YYYY-MM-DD.md`
- Todo section heading: `## 📋 Todo`

Rules:
1. Resolve the target file as `09-데일리노트/<today>.md` using the injected date above.
2. If `$ARGUMENTS` is empty, ask the user for the exact TODO text and stop until they answer.
3. Read the target file before editing.
4. Find the `## 📋 Todo` section. The section ends at the next `## ` heading or end of file.
5. Append one markdown checkbox item inside that section: `- [ ] <todo text>`.
6. If the daily note file or Todo section is missing, do not create or restructure anything. Report what is missing and ask for approval first.
7. Modify only the resolved daily note file, and only the Todo section. Do not touch unrelated files or sections.
8. Preserve existing ordering and content. Do not reformat the whole note.

After editing, summarize the added TODO item and the target file path.
