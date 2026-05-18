# Git Workflow

이 문서는 `AcornClassFile` 저장소에서 Git, GitHub, SourceTree 작업을 할 때 참고합니다.

## 커밋 전 확인

```powershell
git status --short
```

확인할 것:

- 실제 수업 코드가 맞는지
- `.metadata`, `bin`, `.class`, `.lock`, `.log`가 포함되지 않았는지
- 새로 만든 파일이 빠지지 않았는지

## 커밋 메시지 기준

혼자 관리하는 저장소이므로 복잡한 규칙보다 알아보기 쉬운 메시지를 우선합니다.

예시:

```text
Add Day2 lambda practice examples
Fix Ex02 password sorting output
Ignore Eclipse workspace files
Add WEB_CLOUD class files
Add SQLD study notes
```

## SourceTree 기준

- File Status에서 변경 파일을 먼저 확인합니다.
- 불필요한 파일이 있으면 stage하지 않습니다.
- 커밋 전 staged files만 다시 확인합니다.
- Push 전 현재 브랜치가 `master`인지 `main`인지 확인합니다.

## 주의할 작업

다음 작업은 실행 전에 사용자 확인이 필요합니다.

- `git push`
- `git reset`
- `git merge`
- `git rebase`
- `git clean`
- 대량 파일 삭제
- force push
