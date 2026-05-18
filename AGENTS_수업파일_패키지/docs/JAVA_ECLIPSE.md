# Java / Eclipse Guide

Java, Java2 수업 코드, Eclipse workspace 작업에 적용합니다.

## 1. 기본 구조

```text
AcornFileMain/Java2/
  workspace/   Eclipse 프로젝트
  수업자료/     수업 문서와 문제 파일
```

Java 프로젝트에서는 보통 아래 파일을 수정합니다.

```text
src/**/*.java
```

## 2. 작업 원칙

- 패키지명과 폴더 경로가 일치하는지 확인합니다.
- 기존 수업 코드의 스타일을 과하게 바꾸지 않습니다.
- 문제 풀이 요청은 수업 내용에 맞춰 쉽게 읽히는 코드로 작성합니다.
- 한 파일에 몰아넣기보다 문제 성격에 따라 클래스와 인터페이스를 분리합니다.
- Eclipse가 자동 생성한 파일과 직접 작성한 소스 파일을 구분합니다.

## 3. Git에 올릴 파일

- 직접 작성한 `.java` 파일
- 수업 문제 풀이 코드
- README, 정리 문서
- 필요한 설정 파일

## 4. Git에 올리지 않을 파일

- `.metadata/`
- `bin/`
- `*.class`
- `*.lock`
- `*.log`

## 5. 컴파일 확인

기존 Eclipse `bin` 폴더를 건드리지 않으려면 임시 폴더에 컴파일합니다.

```powershell
javac -encoding UTF-8 -d .codex-build path\to\File.java
```

확인 후 `.codex-build`는 삭제합니다.

## 6. 패키지 작업 주의

- 패키지 선언과 폴더 경로가 맞아야 합니다.
- 예: `package day2prac.lamda.Day2문제;`
- 경로: `src/day2prac/lamda/Day2문제/`

## 7. Eclipse 기준 확인

- Problems 뷰에서 컴파일 오류를 확인합니다.
- Run Configuration이 올바른 main 클래스를 가리키는지 확인합니다.
- JRE System Library 버전과 실제 javac 버전 차이가 있으면 버전 충돌 가능성을 설명합니다.
