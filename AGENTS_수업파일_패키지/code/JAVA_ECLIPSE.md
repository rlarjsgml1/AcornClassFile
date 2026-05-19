# Java Eclipse

Java2 수업 코드와 Eclipse workspace 작업에 적용합니다.

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
- Eclipse 자동 생성 파일과 직접 작성한 소스 파일을 구분합니다.

## Java 기본 품질 기준

- 클래스 이름은 PascalCase를 사용합니다.
- 변수와 메서드 이름은 camelCase를 사용합니다.
- 상수는 `static final`과 UPPER_SNAKE_CASE를 사용합니다.
- `main` 메서드 실습 코드는 한 파일 안에 두되, 재사용이 필요하면 클래스를 분리합니다.
- 컬렉션은 raw type을 피하고 generic을 사용합니다.
- null 가능성이 있는 값은 사용 전에 확인합니다.
- 문자열 비교는 `==`가 아니라 `.equals()`를 사용합니다.

## 패키지와 파일명

확인할 것:

- 폴더 경로와 `package` 선언이 같은가?
- 파일명과 `public class` 이름이 같은가?
- 한 파일에 public class가 여러 개 있지 않은가?
- 한글 파일명과 한글 패키지는 Eclipse 인코딩을 확인했는가?

## Eclipse 기준 확인

- Project Explorer에서 실제 파일 위치 확인
- Problems 뷰에서 컴파일 오류 확인
- Run Configuration의 main class 확인
- JRE System Library 버전 확인
- Build Path에 필요한 jar가 있는지 확인

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
- `.codex-build/`

## 터미널 검증

Eclipse `bin` 폴더를 건드리지 않으려면 임시 폴더에 컴파일합니다.

```powershell
javac -encoding UTF-8 -d .codex-build path\to\File.java
```

패키지가 있는 클래스 실행 예:

```powershell
java -cp .codex-build package.name.MainClass
```

검증 후 `.codex-build`는 정리합니다.

## 자주 나는 오류

- public class 이름과 파일명이 다름
- package 선언과 폴더 경로가 다름
- import 누락
- JDK 버전 차이
- 한글 인코딩 문제
- 클래스패스에 jar가 없음

