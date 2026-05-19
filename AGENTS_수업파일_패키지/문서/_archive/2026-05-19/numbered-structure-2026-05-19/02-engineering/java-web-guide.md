# Java Web Guide

WEB_CLOUD, JSP, Servlet, Tomcat 작업 기준입니다.

## 주요 경로

```text
AcornFileMain/WEB_CLOUD/수업소스/Web_ws/
```

## 설명 흐름

서버 작업:

```text
요청 -> Servlet/Controller -> Service -> DAO/DB -> 응답
```

화면 작업:

```text
JSP/HTML -> 이벤트 -> 요청 -> 서버 처리 -> 결과 표시
```

## 작업 기준

- Dynamic Web Project, Maven, Gradle 중 무엇인지 먼저 확인합니다.
- Servlet, Service, DAO, DTO 구조가 있으면 그 흐름을 따릅니다.
- JSP에 비즈니스 로직을 과하게 넣지 않습니다.
- SQL은 가능한 경우 `PreparedStatement`를 사용합니다.
- DB 접속 정보와 비밀번호는 코드에 직접 넣지 않습니다.

## 오류 확인

- 404: URL, context path, servlet mapping, JSP 위치
- 500: Console 로그, 예외 메시지, DB 연결, null, SQL
- DB 오류: SQL 에러 코드, 테이블명, 컬럼명, 바인딩 값

