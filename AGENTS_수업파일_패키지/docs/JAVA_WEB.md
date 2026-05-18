# Java Web Guide

Java 웹, JSP, Servlet, Oracle DB, Tomcat, WEB_CLOUD 수업 작업에 적용합니다.

## 1. 기본 흐름

- 설명은 요청 → Servlet/Controller → Service → DAO/DB → 응답 흐름으로 정리합니다.
- 화면 작업은 JSP/HTML → 이벤트 → 요청 → 서버 처리 → 결과 표시 흐름으로 설명합니다.
- 프로젝트가 Maven, Gradle, 순수 Dynamic Web Project 중 무엇인지 먼저 확인합니다.
- 실제 폴더 구조, 패키지명, DB 테이블명은 코드나 설정을 확인하기 전까지 단정하지 않습니다.

## 2. 구현 원칙

- 기존 프로젝트 구조를 우선 따릅니다.
- Servlet, Service, DAO, DTO 구조가 이미 있으면 그 흐름에 맞춥니다.
- JSP에 비즈니스 로직을 과하게 넣지 않습니다.
- DB 접근 코드는 가능하면 DAO 역할로 분리합니다.
- SQL은 문자열 조합보다 PreparedStatement 같은 안전한 방식을 우선합니다.
- DB 접속 정보, 비밀번호, 토큰은 코드에 직접 넣지 않습니다.

## 3. Eclipse / Tomcat 확인

- Eclipse 기준 설명은 Project Explorer, Problems, Servers, Console 뷰 기준으로 안내합니다.
- 404는 URL, context path, servlet mapping, JSP 위치를 확인합니다.
- 500은 서버 로그, 예외 메시지, DB 연결, null 처리, SQL 오류를 확인합니다.
- Tomcat 포트와 context path는 확인 전까지 임의로 단정하지 않습니다.

## 4. 검증 기준

- 컴파일 성공 여부를 확인합니다.
- 서버 실행 여부를 확인합니다.
- 브라우저에서 실제 URL 동작을 확인합니다.
- DB 변경이 있으면 변경 전후 데이터를 확인합니다.
- 검증하지 못한 항목은 미확인으로 보고합니다.
