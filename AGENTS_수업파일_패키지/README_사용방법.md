# AGENTS 수업파일 패키지 사용방법

이 폴더는 `C:\AcornFile` 저장소를 AI 코딩 도구와 함께 관리할 때 참고할 지침 모음입니다.
구조는 `AGENTS_98점_패키지`의 원칙처럼 공통 규칙과 세부 규칙을 분리합니다.

## 구성

```text
AGENTS.md
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

`docs/`는 기존 문서 보관용입니다. 새 작업은 기능별 폴더를 먼저 봅니다.

## 사용 기준

- 모든 작업은 먼저 `AGENTS.md`를 봅니다.
- 문서, README, 수업자료 정리는 `문서/README.md`를 봅니다.
- Java2, Eclipse 수업 코드는 `code/JAVA_ECLIPSE.md`를 봅니다.
- WEB_CLOUD, JSP, Servlet, Tomcat 작업은 `code/JAVA_WEB.md`와 `backend/README.md`를 봅니다.
- Kotlin, Android Studio 작업은 `code/ANDROID_KOTLIN.md`를 봅니다.
- JavaScript, 프론트엔드, Node.js 작업은 `code/JAVASCRIPT.md`와 `frontend/README.md`를 봅니다.
- GitHub, SourceTree 작업은 `규칙/GIT_SOURCE_TREE.md`를 봅니다.
- 에러 해결은 `logs/디버깅로그.md`를 봅니다.
- 디자인 작업은 `디자인/README.md`를 봅니다.
- DTO, DB, JSON 구조는 `모델/README.md`를 봅니다.
- 새 언어와 프로그램을 추가할 때는 `문서/문서_작성규칙.md` 형식을 따릅니다.

## 이 저장소에서 특히 중요한 점

- `.metadata/`, `bin/`, `*.class`, `*.lock`, `*.log`는 커밋하지 않습니다.
- 수업 소스, 과제 풀이, README, 정리 문서는 커밋합니다.
- SourceTree에서 전체 선택하기 전에 불필요한 파일이 포함되어 있는지 확인합니다.
- GitHub에 push하기 전 커밋 메시지와 변경 파일 목록을 확인합니다.

## 로그 작성 기준

- 새 기능이나 문서 구조 변경은 `logs/개발로그.md`에 기록합니다.
- 오류 해결 과정은 `logs/디버깅로그.md`에 기록합니다.
- 로그에는 확인한 사실, 수정한 파일, 검증 여부를 남깁니다.
