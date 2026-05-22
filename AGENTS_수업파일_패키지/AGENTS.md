
# AGENTS.md

이 문서는 `C:\AcornFile` 저장소에서 AI 코딩 에이전트가 작업할 때 따르는 공통 지침입니다.
이 패키지는 기존 폴더 구조를 유지하면서, 작업 종류별로 필요한 문서를 바로 찾을 수 있게 정리합니다.

## 1. 폴더 구조

```text
AGENTS_수업파일_패키지/
  AGENTS.md
  README_사용방법.md
  docs/       보조 문서, 리뷰 체크리스트, 도구 추가 기준
  code/       Java, Java Web, Android, JavaScript, SQL 코드 기준
  backend/    Servlet, Service, DAO, DB 연동 기준
  frontend/   HTML, CSS, JavaScript, JSP 화면 기준
  문서/       README, 수업자료, 문서 작성 기준
  규칙/       공통 규칙, 안전 규칙, Git/SourceTree 기준
  디자인/     UI/UX, 화면 구성 기준
  모델/       DTO, VO, DB, JSON, 도메인 모델 기준
  logs/       개발로그와 디버깅로그
```

## 2. 작업별 우선 확인 문서

```text
공통 규칙                규칙/공통규칙.md
안전 승인 기준           규칙/안전규칙.md
Git / SourceTree         규칙/GIT_SOURCE_TREE.md
Java2 / Eclipse          code/JAVA_ECLIPSE.md
WEB_CLOUD / JSP/Servlet  code/JAVA_WEB.md, backend/BACKEND_GUIDE.md
Frontend 화면            frontend/FRONTEND_GUIDE.md, 디자인/DESIGN_GUIDE.md
Header / Navigation      frontend/HEADER_COMPONENT_RULES.md, frontend/STATIC_HEADER_REDESIGN_WORKFLOW.md, 디자인/MOTION_INTERACTION_RULES.md
Reference Style Redesign 디자인/REFERENCE_BRAND_TRANSFORM_RULES.md
Color / Button Theme     디자인/COLOR_SYSTEM_RULES.md
Folder Naming            규칙/FOLDER_NAMING_RULES.md
Backend / DAO / DB       backend/BACKEND_RULES.md, backend/SERVICE_DAO.md
DTO / DB / JSON 모델      모델/MODEL_GUIDE.md, 모델/DATA_MODEL.md
문서 / README            문서/DOCUMENT_GUIDE.md, 문서/문서_작성규칙.md
학습자료 / PDF 제작       문서/학습자료_제작_AGENT.md, 문서/수업자료_관리.md
디버깅                   logs/디버깅로그.md, docs/DEBUGGING.md
최종 코드 점검           code/CODE_REVIEW_99_CHECKLIST.md
최종 백엔드 점검         backend/BACKEND_REVIEW_99_CHECKLIST.md
```

`docs/`는 보조 문서와 체크리스트를 둡니다. Java, Java Web, JavaScript 같은 실제 코드 작업 기준은 `code/`를 먼저 봅니다.
이전 정리본은 `문서/_archive/2026-05-19`에 보관합니다.

## 3. 사용자 기준

- 사용자는 한국어 설명을 선호합니다.
- 사용자는 Java, Java2 수업 코드, Eclipse, Kotlin, Android Studio, GitHub, SourceTree를 사용합니다.
- 설명은 초보자도 따라갈 수 있게 단계적으로 제공합니다.
- 단순 복사보다 코드의 의도, 흐름, Git 관리 이유를 이해할 수 있게 설명합니다.
- 확인한 사실과 추정한 내용을 구분합니다.
- 실행하지 않은 검증은 실행했다고 말하지 않습니다.

## 4. 작업 원칙

- 요청받은 범위 안에서만 수정합니다.
- 기존 파일을 삭제하거나 대량 변경하기 전에는 이유를 설명하고 확인합니다.
- 기존 구조와 코드 스타일을 우선합니다.
- 큰 변경보다 작고 되돌리기 쉬운 변경을 우선합니다.
- 사용자가 만든 변경을 임의로 되돌리지 않습니다.
- 특정 브랜드 느낌을 참고할 때는 원본 로고, 이미지, 코드, 고유 문구를 그대로 복사하지 않고 새 콘셉트로 변형합니다.
- `First`, `second`, `test` 같은 임시 폴더명은 결과물 콘셉트가 정해지면 실제 이름으로 바꿉니다.
- HTML을 PDF로 변환할 때 Chrome 임시 프로필 폴더(`C:\AcornFile\.chrome-pdf-profile`)가 생길 수 있습니다. PDF 생성이 끝나면 결과 PDF를 확인한 뒤 해당 임시 폴더를 삭제합니다.
- 코드 수정 후에는 변경 파일, 변경 이유, 검증 여부를 짧게 보고합니다.

## 5. Git 기준

- Git 작업 전에는 변경 파일 목록을 확인합니다.
- 혼자 쓰는 공부용 GitHub 저장소의 브랜치, 커밋, `.gitignore`, SourceTree 작업 기준은 `규칙/GIT_SOURCE_TREE.md`를 우선 확인합니다.
- 공부 자료/PDF/README는 `docs/작업이름`, 실습 코드 보관은 `archive/작업이름`, 공부 요약은 `study/작업이름`, 오류 수정은 `fix/오류이름`, Git 설정 정리는 `chore/작업이름` 브랜치를 사용합니다.
- `.metadata/`, `bin/`, `*.class`, `*.lock`, `*.log`, `.codex-build/`, `.chrome-pdf-profile/`는 커밋 대상에서 제외합니다.
- SourceTree에서 `Stage All`을 누르기 전 변경 파일 목록을 확인합니다.
- `push`, `reset`, `force push`, `merge`, `rebase`는 사용자 승인 없이 실행하지 않습니다.
- 커밋 메시지는 실무에서 많이 쓰는 Conventional Commits 형식을 우선합니다.
- 기본 형식은 `type: 변경 목적`입니다. 예: `docs: 학습자료 제작 규칙 추가`
- 자주 쓰는 type은 `docs`, `archive`, `study`, `feat`, `fix`, `refactor`, `test`, `chore`입니다.
- 제목은 한 줄로 짧게 쓰되, 무엇을 왜 바꿨는지 드러나야 합니다.
- 변경 내용이 여러 개면 커밋 본문에 bullet로 요약합니다.
- 커밋 본문에는 변경 파일 나열보다 변경 의도와 영향, 검증 여부를 우선 적습니다.
- 예시:

```text
docs: 학습자료 제작 규칙 추가 및 Java2 핵심정리 PDF 재생성

- 학습자료 제작 전용 에이전트 지침 추가
- PDF 생성 후 임시 Chrome 프로필 삭제 규칙 추가
- Java2 Day1~Day5 핵심정리 PDF 재생성
- 각 PDF에 목차, 학습 로드맵, 확인 불가 항목, 연습 문제 추가
```

## 6. 사용자 확인이 필요한 작업

- 파일 삭제
- 대량 파일 수정 또는 이동
- 패키지 설치 또는 삭제
- DB 데이터 변경
- Git push, merge, rebase, reset, force push
- 보안 설정 변경
- IDE, SDK, Gradle 버전 변경
- 되돌리기 어려운 작업

## 7. 완료 보고

작업이 끝나면 아래 내용을 짧게 보고합니다.

- 무엇을 변경했는지
- 왜 변경했는지
- 어떤 파일을 수정했는지
- 어떤 검증을 했는지
- 검증하지 못했다면 이유가 무엇인지
