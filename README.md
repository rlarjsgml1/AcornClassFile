# AcornClassFile

에이콘 수업 자료와 실습 코드를 정리하는 개인 학습 저장소입니다.

## 폴더 구조

```text
AcornFileMain/
  Java2/          Java 수업 자료와 Eclipse workspace
  WEB_CLOUD/     웹/클라우드 수업 자료
  SQLD/          SQLD 학습 자료
  front_수업파일/ 프론트엔드 수업 자료
  AIAgent/       AI Agent 관련 자료
```

## Git 관리 기준

- 수업 코드, 실습 문제, 정리 문서는 커밋합니다.
- Eclipse 작업공간 캐시인 `.metadata/`는 커밋하지 않습니다.
- Java 컴파일 결과인 `bin/`, `*.class`는 커밋하지 않습니다.
- `*.lock`, `*.log` 같은 로컬 실행 파일도 커밋하지 않습니다.
- SourceTree에서 `Stage All`을 누르기 전 변경 파일 목록을 확인합니다.

## 커밋 메시지 예시

```text
Add Day2 lambda practice examples
Fix Ex02 password sorting output
Ignore Eclipse workspace files
Add SQLD study files
Add WEB_CLOUD class files
```

혼자 관리하는 저장소이므로 메시지는 짧아도 괜찮습니다. 다만 나중에 봤을 때 무엇을 했는지 알 수 있게 작성합니다.

## Agent 지침

AI 코딩 도구에 적용할 작업 지침은 아래 폴더에 정리되어 있습니다.

```text
AGENTS_수업파일_패키지/
  AGENTS.md
  README_사용방법.md
  docs/
```

포함된 세부 문서:

```text
docs/JAVA_ECLIPSE.md
docs/JAVA_WEB.md
docs/ANDROID.md
docs/JAVASCRIPT.md
docs/GIT_WORKFLOW.md
docs/DEBUGGING.md
docs/TOOLS_AND_PROGRAMS.md
docs/AGENTS_REVIEW_CHECKLIST.md
```

필요하면 해당 폴더의 `AGENTS.md` 내용을 프로젝트 루트의 작업 지침으로 사용할 수 있습니다.
