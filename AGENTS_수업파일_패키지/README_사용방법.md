# AGENTS 수업파일 패키지 사용방법

이 폴더는 `C:\AcornFile` 저장소를 AI 코딩 도구와 함께 관리할 때 참고하는 지침 모음입니다.
기존 폴더명을 유지하면서, 실무에서 쓰기 편하게 역할별 문서를 분리했습니다.

## 들어가는 경로

```text
C:\AcornFile\AGENTS_수업파일_패키지
```

## 현재 구조

```text
AGENTS.md
README_사용방법.md
docs/
code/
backend/
frontend/
문서/
규칙/
디자인/
모델/
logs/
```

## 각 폴더 역할

```text
docs
```

보조 문서, 리뷰 체크리스트, 도구 추가 기준입니다. 코드 작업 기준은 `code` 폴더를 먼저 보고, Git 기준은 `규칙` 폴더를 먼저 봅니다.

```text
code
```

언어와 실행 환경 기준입니다. Java2, Java Web, Android/Kotlin, JavaScript, SQL 기준을 둡니다.

```text
backend
```

Servlet, Service, DAO, DTO, DB 연동처럼 서버 흐름과 관련된 기준입니다.

```text
frontend
```

HTML, CSS, JavaScript, JSP 화면, 정적 파일 관리 기준입니다.

```text
문서
```

README, 수업자료, 사용방법 문서, 정리 문서 작성 기준입니다.

```text
규칙
```

공통 작업 규칙, 안전 규칙, Git/SourceTree 규칙, 검토 체크리스트입니다.

```text
디자인
```

UI 디자인, UX 흐름, 화면 점검 기준입니다.

```text
모델
```

DTO, VO, DB 테이블, JSON, 도메인 모델 정리 기준입니다.

```text
logs
```

개발로그와 디버깅로그를 기록합니다.

이전 정리본은 `문서/_archive/2026-05-19`에 보관했습니다. 현재 작업 기준으로는 먼저 보지 않아도 됩니다.

## 작업별로 볼 문서

```text
처음 확인                 AGENTS.md
전체 사용법               README_사용방법.md
문서 묶음 안내            docs/DOCS_GUIDE.md
Java2 / Eclipse          code/JAVA_ECLIPSE.md
WEB_CLOUD / JSP/Servlet  code/JAVA_WEB.md, backend/BACKEND_GUIDE.md
프론트 화면              frontend/FRONTEND_GUIDE.md, 디자인/DESIGN_GUIDE.md
헤더 / 네비게이션        frontend/HEADER_COMPONENT_RULES.md, frontend/STATIC_HEADER_REDESIGN_WORKFLOW.md, 디자인/MOTION_INTERACTION_RULES.md
브랜드 참고 리디자인      디자인/REFERENCE_BRAND_TRANSFORM_RULES.md
색상 / 버튼 테마         디자인/COLOR_SYSTEM_RULES.md
폴더명 정리              규칙/FOLDER_NAMING_RULES.md
서버 / DB 흐름           backend/BACKEND_RULES.md, backend/SERVICE_DAO.md
백엔드 보안              backend/API_SECURITY.md
DTO / JSON / DB 모델      모델/MODEL_GUIDE.md, 모델/DATA_MODEL.md
Git / SourceTree         규칙/GIT_SOURCE_TREE.md
문서 정리                문서/DOCUMENT_GUIDE.md, 문서/문서_작성규칙.md
에러 해결                docs/DEBUGGING.md, logs/디버깅로그.md
코드 최종 점검           code/CODE_REVIEW_99_CHECKLIST.md
백엔드 최종 점검         backend/BACKEND_REVIEW_99_CHECKLIST.md
```

## 이 저장소에서 특히 중요한 점

- `.metadata/`, `bin/`, `*.class`, `*.lock`, `*.log`, `.codex-build/`는 커밋하지 않습니다.
- 수업 소스, 과제 풀이, README, 정리 문서는 커밋합니다.
- SourceTree에서 전체 선택하기 전에 불필요한 파일이 포함되어 있는지 확인합니다.
- GitHub에 push하기 전 커밋 메시지와 변경 파일 목록을 확인합니다.
- 정적 UI 결과물은 `First`, `second` 같은 임시 이름보다 실제 콘셉트명으로 정리합니다.
- 특정 브랜드 느낌을 참고한 화면은 원본을 그대로 가져오지 않고 새 브랜드와 새 문구로 변형합니다.

## 승인 기준

사용자가 명확히 요청한 소규모 수정, 문서 정리, 불필요한 파일 제거는 바로 진행합니다.
사소한 확인 질문 때문에 작업을 멈추지 않고, 아래처럼 되돌리기 어렵거나 사용자 환경에 큰 영향을 주는 작업만 먼저 확인합니다.

- 사용자가 명확히 요청하지 않은 파일 삭제
- 대량 파일 삭제, 이동, 수정
- 패키지 설치 또는 삭제
- DB 데이터 추가, 수정, 삭제
- Git push, merge, rebase, reset, clean, force push
- 보안 설정 변경
- IDE, SDK, Gradle 버전 변경
- 테스트 약화 또는 삭제
- 되돌리기 어려운 작업

## 로그 작성 기준

- 새 기능이나 문서 구조 변경은 `logs/개발로그.md`에 기록합니다.
- 오류 해결 과정은 `logs/디버깅로그.md`에 기록합니다.
- 로그에는 확인한 사실, 수정한 파일, 검증 여부를 남깁니다.
