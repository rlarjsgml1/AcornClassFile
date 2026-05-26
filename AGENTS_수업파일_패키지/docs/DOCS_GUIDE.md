# Docs Guide

`docs` 폴더는 AGENTS 패키지의 보조 문서와 체크리스트를 둡니다.

## 현재 역할

- 에이전트 문서 검토 체크리스트
- 디버깅 기준
- 새 도구와 프로그램을 추가할 때 참고할 형식

## 코드 / 규칙 문서와의 구분

Java, Java Web, JavaScript, Android/Kotlin, SQL처럼 실제 코드 작업을 바로 안내하는 문서는 `code/` 폴더를 우선합니다.

```text
code/JAVA_ECLIPSE.md
code/JAVA_WEB.md
code/JAVASCRIPT.md
code/ANDROID_KOTLIN.md
code/SQL_DATABASE.md
```

Git / SourceTree 작업 기준은 `규칙/GIT_SOURCE_TREE.md`를 우선합니다.

## 보관 기준

이전 구조에서 `docs`와 `code`에 같은 이름으로 있던 문서는 `문서/_archive/2026-05-19/duplicate-docs-2026-05-19`에 보관했습니다.
필요할 때만 비교용으로 확인합니다.
