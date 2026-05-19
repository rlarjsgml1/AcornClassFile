# Service DAO

Service, DAO, DTO 구조를 사용할 때 적용합니다.

## 역할 분리

```text
Servlet/Controller: 요청과 응답 제어
Service: 업무 흐름 처리
DAO: DB 접근
DTO/VO: 데이터 전달
JSP: 결과 출력
```

## DAO 기준

- DB 연결, SQL 실행, ResultSet 변환을 담당합니다.
- SQL 문자열 조합보다 PreparedStatement를 우선합니다.
- 연결, statement, result set은 정리합니다.
- 예외를 숨기지 않고 원인을 확인할 수 있게 처리합니다.

## Service 기준

- 여러 DAO 호출이 필요한 업무 흐름을 조합합니다.
- 화면 메시지보다 업무 결과를 반환합니다.
- DB 접속 정보나 SQL을 직접 들고 있지 않습니다.

