# Tools And Programs Guide

새 언어, 새 프로그램, 새 수업 도구를 AGENTS 문서에 추가할 때 사용하는 기준입니다.

## 1. 새 항목에 넣어야 할 내용

언어나 프로그램을 추가할 때는 아래 내용을 정리합니다.

- 도구 이름
- 주 사용 목적
- 주로 사용하는 프로젝트 경로
- 실행 방법
- 빌드 또는 컴파일 방법
- 자주 생기는 오류
- Git에 올릴 파일
- Git에 올리지 않을 파일
- 검증 방법

## 2. 예시: Java / Eclipse

```text
도구: Eclipse
목적: Java 수업 코드 작성과 실행
경로: AcornFileMain/Java2/workspace
올릴 파일: src/**/*.java
올리지 않을 파일: .metadata/, bin/, *.class
검증: Java 파일 실행, Problems 뷰 확인
```

## 3. 예시: Android Studio / Kotlin

```text
도구: Android Studio
목적: Kotlin Android 앱 개발
올릴 파일: app/src, build.gradle, settings.gradle, AndroidManifest.xml
올리지 않을 파일: build/, .gradle/, local.properties
검증: Gradle sync, build, emulator 실행, Logcat 확인
```

## 4. 예시: GitHub / SourceTree

```text
도구: SourceTree
목적: Git 변경 파일 확인, 커밋, push
확인: staged files, unstaged files, current branch
주의: commit 전 상태 확인, 변경 파일 검토, 브랜치 확인을 먼저 진행
```

## 5. 문서 분리 기준

- 모든 작업에 공통이면 `AGENTS.md`에 넣습니다.
- 특정 언어와 프로그램에만 해당하면 목적에 맞는 하위 폴더에 넣습니다. 예: 코드 작업은 `code/`, Git 규칙은 `규칙/`, 화면 규칙은 `frontend/` 또는 `디자인/`
- 내용이 길어지면 새 문서로 분리합니다.
- 확인 전까지 단정하지 말라는 규칙은 모든 문서에 유지합니다.
