# Backend Guide

Servlet, Controller, Service, DAO, DB 연동 작업 기준입니다.

## 기본 흐름

```text
요청 -> Controller/Servlet -> Service -> DAO -> DB -> 응답
```

## 역할 분리

```text
Servlet/Controller: 요청과 응답 제어
Service: 업무 흐름 처리
DAO: DB 접근
DTO/VO: 데이터 전달
JSP: 결과 출력
```

## 작업 기준

- 요청 파라미터 이름을 실제 화면 코드에서 확인합니다.
- Service는 업무 흐름을 담당합니다.
- DAO는 DB 접근을 담당합니다.
- DTO는 데이터 전달을 담당합니다.
- JSP에는 결과 출력에 필요한 값만 넘깁니다.

## DAO 기준

- DB 연결, SQL 실행, ResultSet 변환을 담당합니다.
- SQL 문자열 조합보다 `PreparedStatement`를 우선합니다.
- connection, statement, result set은 정리합니다.
- 예외를 숨기지 않고 원인을 확인할 수 있게 처리합니다.

