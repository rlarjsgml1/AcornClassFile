# AGENTS.md

이 문서는 `AcornClassFile` 저장소에서 AI 코딩 에이전트가 작업할 때 따르는 공통 지침입니다.
세부 기술 규칙은 기능별 폴더의 `.md` 파일에서 확인합니다.

## 0. 기능별 문서 구조

새 작업은 아래 폴더 기준으로 먼저 확인합니다. 기존 `docs/` 폴더는 이전 문서와 호환용으로 유지합니다.

```text
문서/       README, 수업자료, 문서 작성 기준
code/       Java, Java Web, Android, JavaScript, SQL 코드 기준
규칙/       공통 규칙, 안전 규칙, Git/SourceTree 기준
디자인/     UI 디자인과 UX 점검 기준
모델/       DTO, VO, DB, JSON, 도메인 모델 기준
frontend/   HTML, CSS, JavaScript, JSP 화면 기준
backend/    Servlet, Service, DAO, DB 연동 기준
logs/       개발로그, 디버깅로그
docs/       기존 세부 문서 보관
```

작업별 우선 확인 문서:

- 문서 수정: `문서/README.md`
- Java2, Eclipse: `code/JAVA_ECLIPSE.md`
- WEB_CLOUD, JSP, Servlet: `code/JAVA_WEB.md`, `backend/README.md`
- 프론트엔드 화면: `frontend/README.md`, `디자인/README.md`
- DTO, DB, JSON 구조: `모델/README.md`
- Git, SourceTree: `규칙/GIT_SOURCE_TREE.md`
- 에러 해결: `logs/디버깅로그.md`, `규칙/검토체크리스트.md`

## 1. 사용자 기준

- 사용자는 한국어 설명을 선호합니다.
- 사용자는 Java, Java2 수업 코드, Eclipse, Kotlin, Android Studio, GitHub, SourceTree를 사용합니다.
- 사용자는 단순 복사보다 코드의 의도, 흐름, Git 관리 이유를 이해하려고 합니다.
- 설명은 초보자도 따라갈 수 있게 단계적으로 제공합니다.
- 추측, 단정, 실행하지 않은 검증 보고를 하지 않습니다.
- 큰 변경보다 작고 되돌리기 쉬운 변경을 우선합니다.

## 2. 저장소 성격

- 이 저장소는 수업 자료, 실습 코드, 학습 정리 파일을 모아두는 개인 학습 저장소입니다.
- Java2, WEB_CLOUD, SQLD, front 수업 자료가 함께 들어 있습니다.
- Eclipse workspace가 포함될 수 있으므로 실제 소스 파일과 IDE 자동 생성 파일을 구분해야 합니다.
- GitHub와 SourceTree로 관리하는 상황을 우선 고려합니다.

## 3. 공통 작업 원칙

- 사용자의 요청을 먼저 한 문장으로 요약합니다.
- 확인된 사실과 추정 원인을 구분합니다.
- 요청받은 범위 안에서만 수정합니다.
- 기존 파일을 삭제하거나 대량 변경하기 전에는 먼저 이유를 설명합니다.
- 사용자가 만든 변경을 임의로 되돌리지 않습니다.
- 코드 수정 후에는 변경 파일, 변경 이유, 검증 여부를 짧게 보고합니다.
- 실행하지 않은 검증은 실행했다고 말하지 않습니다.

## 4. 세부 문서 사용 기준

- Java, Java2, Eclipse workspace 작업은 `code/JAVA_ECLIPSE.md`를 확인합니다.
- Java 웹, JSP, Servlet, Tomcat, WEB_CLOUD 작업은 `code/JAVA_WEB.md`와 `backend/README.md`를 확인합니다.
- Kotlin, Android Studio, Gradle, Android 앱 작업은 `code/ANDROID_KOTLIN.md`를 확인합니다.
- JavaScript, 프론트엔드, Node.js, VSCode 작업은 `code/JAVASCRIPT.md`와 `frontend/README.md`를 확인합니다.
- SQL, DB, DAO 매핑 작업은 `code/SQL_DATABASE.md`와 `모델/DATA_MODEL.md`를 확인합니다.
- GitHub, SourceTree, 커밋, push 작업은 `규칙/GIT_SOURCE_TREE.md`를 확인합니다.
- 에러 분석, 로그 해석, 디버깅 작업은 `logs/디버깅로그.md`와 `규칙/검토체크리스트.md`를 확인합니다.
- 디자인과 화면 흐름 작업은 `디자인/README.md`를 확인합니다.
- 새 언어, 새 프로그램, 새 도구를 추가할 때는 `문서/문서_작성규칙.md` 형식을 따릅니다.
- AGENTS 문서 자체를 점검할 때는 `규칙/검토체크리스트.md`를 확인합니다.

## 5. Git 공통 원칙

- Git 작업 전에는 현재 브랜치와 변경 파일 목록을 확인합니다.
- `.metadata/`, `bin/`, `*.class`, `*.lock`, `*.log`는 커밋 대상에서 제외합니다.
- SourceTree에서 `Stage All`을 누르기 전 변경 파일 목록을 확인합니다.
- `push`, `reset`, `force push`, `merge`, `rebase`는 사용자 승인 없이 실행하지 않습니다.
- 커밋 메시지는 짧아도 되지만 변경 목적이 드러나야 합니다.

## 6. 사용자 확인이 필요한 작업

다음 작업은 실행 전에 사용자에게 확인합니다.

- 파일 삭제
- 대량 파일 수정
- 패키지 설치 또는 삭제
- DB 데이터 변경
- Git push, merge, rebase, reset, force push
- 보안 설정 변경
- IDE, SDK, Gradle 버전 변경
- 되돌리기 어려운 작업

## 7. 완료 보고

작업이 끝나면 다음을 짧게 보고합니다.

- 무엇을 변경했는지
- 왜 변경했는지
- 어떤 파일을 수정했는지
- 검증을 했는지
- 사용자가 다음에 하면 좋은 일
