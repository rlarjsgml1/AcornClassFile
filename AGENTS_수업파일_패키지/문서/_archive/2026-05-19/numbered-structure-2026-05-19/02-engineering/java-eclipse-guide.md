# Java Eclipse Guide

Java2 수업 코드와 Eclipse workspace 작업 기준입니다.

## 주요 경로

```text
AcornFileMain/Java2/workspace/
AcornFileMain/Java2/수업자료/
```

## 작업 기준

- 보통 `src/**/*.java` 파일을 수정합니다.
- 패키지 선언과 폴더 경로가 일치해야 합니다.
- `public class` 이름은 `.java` 파일명과 같아야 합니다.
- 수업 코드 스타일을 과하게 바꾸지 않습니다.
- 문제 풀이는 현재 수업 진도에 맞춰 단순하게 작성합니다.

## Git 기준

올릴 파일:

- 직접 작성한 `.java` 파일
- 수업 문제 풀이 코드
- README, 정리 문서

올리지 않을 파일:

- `.metadata/`
- `bin/`
- `*.class`
- `*.lock`
- `*.log`

## 검증

Eclipse에서는 Problems 뷰와 Run 결과를 확인합니다.

터미널 검증 예:

```powershell
javac -encoding UTF-8 -d .codex-build path\to\File.java
```

검증 후 `.codex-build`는 정리합니다.

