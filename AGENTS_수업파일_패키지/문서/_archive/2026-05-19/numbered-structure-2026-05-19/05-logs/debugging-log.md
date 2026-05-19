# Debugging Log

오류 원인, 수정 방법, 검증 결과를 기록합니다.

## 2026-05-19 - Java2 Day3 실습학생 컴파일 오류

대상:
- `AcornFileMain/Java2/workspace/java2prjDay3/src/day3/실습학생/day2Test_최정문.java`

증상:
- `class day2Test is public, should be declared in a file named day2Test.java`

확인:
- 파일명은 `day2Test_최정문.java`였습니다.
- 내부 public class 이름은 `day2Test`였습니다.

원인:
- Java는 public class 이름과 파일명이 같아야 합니다.

수정:
- public class 이름을 `day2Test_최정문`으로 변경했습니다.

검증:
- `javac -encoding UTF-8` 컴파일 성공
- `java -cp ... day3.실습학생.day2Test_최정문` 실행 성공

예방:
- 새 Java 파일을 만들 때 파일명과 public class 이름을 먼저 맞춥니다.

