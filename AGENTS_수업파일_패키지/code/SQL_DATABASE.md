# SQL Database

SQL, DB, DAO와 연결되는 작업에 적용합니다.

## 작업 기준

- DB 종류와 접속 방식은 확인 전까지 단정하지 않습니다.
- 테이블명, 컬럼명, 제약조건은 실제 SQL 또는 코드에서 확인합니다.
- 사용자 데이터 변경 작업은 실행 전에 확인을 받습니다.
- SELECT로 먼저 확인하고 INSERT, UPDATE, DELETE는 영향 범위를 설명합니다.
- Java 코드에서는 문자열 조합보다 바인딩 방식을 우선합니다.

## 스키마 확인

확인할 것:

- 테이블 존재 여부
- 컬럼명과 타입
- PK, FK
- NOT NULL
- unique 제약조건
- default 값
- sequence 사용 여부

## SQL 작성 기준

- 필요한 컬럼만 SELECT합니다.
- WHERE 조건 없이 UPDATE/DELETE 하지 않습니다.
- 정렬 기준 없는 목록은 순서를 보장하지 않는다고 봅니다.
- 검색 조건은 인덱스 가능성을 고려합니다.
- LIKE 검색은 앞쪽 wildcard가 성능에 미치는 영향을 고려합니다.
- 페이징이 필요한 목록은 DB별 문법을 확인합니다.

## 트랜잭션

- 여러 변경이 하나의 업무이면 transaction으로 묶습니다.
- 실패 시 rollback 기준을 명확히 합니다.
- 자동 commit 여부를 확인합니다.
- 수업 코드라도 commit/rollback 위치를 설명합니다.

## DDL 변경 기준

- CREATE, ALTER, DROP은 데이터와 기존 코드에 미치는 영향을 먼저 설명합니다.
- 컬럼 추가는 null 가능 여부, default 값, 기존 데이터 영향을 확인합니다.
- 컬럼 삭제와 테이블 삭제는 사용자 확인 없이 실행하지 않습니다.
- 인덱스 추가는 조회 성능과 쓰기 비용을 함께 고려합니다.

## DAO 연동 기준

- DTO 필드와 DB 컬럼 매핑을 확인합니다.
- PreparedStatement 파라미터 순서와 타입을 확인합니다.
- ResultSet 컬럼명 오타를 확인합니다.
- connection, statement, result set 정리를 확인합니다.

## 보안

- SQL injection을 막기 위해 바인딩 방식을 사용합니다.
- DB 계정, 비밀번호, 접속 문자열을 로그에 남기지 않습니다.
- 사용자 입력값을 SQL에 직접 붙이지 않습니다.

## 검증

- SELECT로 변경 전 데이터 확인
- INSERT/UPDATE/DELETE 후 결과 확인
- rollback이 필요한 경우 복구 가능성 확인
- Java DAO에서 같은 SQL이 정상 실행되는지 확인
- 실행한 SQL과 결과를 디버깅로그 또는 완료 보고에 남김
