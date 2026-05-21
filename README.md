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

## 커밋 메시지 규칙

커밋 메시지는 실무에서 많이 쓰는 Conventional Commits 형식을 우선합니다.

기본 형식:

```text
type: 변경 목적
```

자주 쓰는 type:

| type | 사용 상황 | 예시 |
| --- | --- | --- |
| `docs` | 문서, 학습자료, PDF, README 수정 | `docs: Java2 Day1 핵심정리 PDF 추가` |
| `feat` | 새 기능 또는 새 실습 코드 추가 | `feat: Day2 람다 실습 예제 추가` |
| `fix` | 오류 수정 | `fix: 정렬 예제 출력 오류 수정` |
| `refactor` | 동작 변경 없는 구조 개선 | `refactor: 계산기 예제 의존성 주입 구조 정리` |
| `test` | 테스트 코드 또는 검증 코드 추가 | `test: 회원 DAO 조회 테스트 추가` |
| `chore` | 설정, 정리, 빌드 보조 작업 | `chore: Eclipse 캐시 파일 제외 설정 추가` |

변경 내용이 많으면 제목 아래 본문을 bullet로 적습니다.

```text
docs: 학습자료 제작 규칙 추가 및 Java2 핵심정리 PDF 재생성

- 학습자료 제작 전용 에이전트 지침 추가
- PDF 생성 후 임시 Chrome 프로필 삭제 규칙 추가
- Java2 Day1~Day5 핵심정리 PDF 재생성
- 각 PDF에 목차, 학습 로드맵, 확인 불가 항목, 연습 문제 추가
```

혼자 관리하는 저장소라도 나중에 봤을 때 무엇을 왜 바꿨는지 알 수 있게 작성합니다.

## Agent 지침

AI 코딩 도구에 적용할 작업 지침은 아래 폴더에 정리되어 있습니다.

```text
AGENTS_수업파일_패키지/
  AGENTS.md
  README_사용방법.md
  문서/
  code/
  규칙/
  디자인/
  모델/
  frontend/
  backend/
  logs/
  docs/
```

주요 세부 문서:

```text
code/JAVA_ECLIPSE.md
code/JAVA_WEB.md
code/JAVASCRIPT.md
code/CODE_REVIEW_99_CHECKLIST.md
backend/BACKEND_GUIDE.md
backend/API_SECURITY.md
backend/BACKEND_REVIEW_99_CHECKLIST.md
frontend/FRONTEND_GUIDE.md
디자인/DESIGN_GUIDE.md
모델/MODEL_GUIDE.md
규칙/GIT_SOURCE_TREE.md
logs/개발로그.md
logs/디버깅로그.md
```

필요하면 해당 폴더의 `AGENTS.md` 내용을 프로젝트 루트의 작업 지침으로 사용할 수 있습니다.
