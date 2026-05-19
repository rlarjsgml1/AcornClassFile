# Service DAO

Service, DAO, DTO 구조를 사용할 때 적용합니다.

## 1. 역할 분리

```text
Servlet/Controller: 요청과 응답 제어
Service: 업무 흐름 처리, 트랜잭션 판단
DAO: DB 접근, SQL 실행, ResultSet 변환
DTO/VO: 데이터 전달
JSP: 결과 출력
```

## 2. Service 기준

- Service는 화면 이름이나 JSP 경로에 의존하지 않습니다.
- Service는 업무 규칙을 읽기 쉬운 순서로 표현합니다.
- 여러 DAO 호출이 하나의 업무이면 Service에서 조합합니다.
- 데이터 변경이 여러 번 일어나면 트랜잭션 경계를 명확히 합니다.
- DB 접속 정보와 SQL을 직접 들고 있지 않습니다.
- 실패 원인을 호출자가 알 수 있게 결과나 예외를 설계합니다.

## 3. DAO 기준

- DAO는 DB 연결, SQL 실행, 결과 변환을 담당합니다.
- SQL 문자열 조합보다 `PreparedStatement`를 우선합니다.
- connection, statement, result set은 반드시 정리합니다.
- Java 7 이상이면 `try-with-resources`를 우선합니다.
- SQL 예외를 숨기지 않습니다.
- SQL 실행 전 파라미터 순서와 타입을 확인합니다.

## 4. DTO/VO 기준

- DTO는 데이터 전달용입니다.
- DB 연결, SQL, 화면 렌더링 코드를 DTO에 넣지 않습니다.
- 필드명은 화면 name, DB 컬럼, Java 변수명 관계를 확인하고 정합니다.
- 값이 없을 수 있는 필드는 null 가능성을 문서나 코드에서 드러냅니다.
- 출력용 DTO와 입력용 DTO가 너무 달라지면 분리합니다.

## 5. SQL 작성 기준

- 필요한 컬럼만 SELECT합니다.
- 검색 조건은 명확히 분리합니다.
- 정렬 기준이 없는 목록은 결과 순서를 보장하지 않는다고 봅니다.
- 페이징이 필요한 목록은 offset/limit 또는 Oracle rownum 기준을 확인합니다.
- INSERT/UPDATE/DELETE 전 영향 범위를 확인합니다.

## 6. 트랜잭션 기준

트랜잭션이 필요한 경우:

- 주문 생성과 주문 상세 저장
- 게시글 저장과 첨부파일 저장
- 포인트 차감과 결제 기록 저장
- 회원 삭제와 관련 데이터 처리

기준:

- 하나라도 실패하면 전체 rollback이 맞는지 확인합니다.
- commit/rollback 위치는 Service 또는 트랜잭션 관리 계층으로 모읍니다.
- DAO마다 임의로 commit하지 않습니다.

## 7. 실무에서 자주 보는 문제

- DAO에서 connection을 닫지 않음
- PreparedStatement 파라미터 순서가 SQL과 다름
- `ResultSet` 컬럼명이 DB와 다름
- Service 없이 Servlet에서 SQL을 직접 실행함
- null 값이 JSP에서 바로 출력되어 오류가 남
- 목록 조회에서 페이징 없이 전체 데이터를 가져옴

