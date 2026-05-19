# Java Web

WEB_CLOUD, JSP, Servlet, Tomcat, Oracle DB 작업에 적용합니다.

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

## 프로젝트 확인

- Dynamic Web Project인지 Maven/Gradle 프로젝트인지 확인합니다.
- `WEB-INF/lib`에 필요한 jar가 있는지 확인합니다.
- Tomcat 버전과 Servlet API 버전을 확인합니다.
- context path와 servlet mapping을 확인합니다.
- JSP가 직접 접근 가능한 위치인지 `WEB-INF/views` 아래인지 확인합니다.

## 구현 기준

- 기존 Servlet, Service, DAO, DTO 구조를 우선 따릅니다.
- JSP에 비즈니스 로직을 과하게 넣지 않습니다.
- SQL은 가능한 경우 `PreparedStatement`를 사용합니다.
- DB 접속 정보와 비밀번호는 코드에 직접 넣지 않습니다.
- 등록/수정/삭제 후 새로고침 중복 실행이 문제면 redirect를 고려합니다.
- 조회 결과 출력은 forward를 우선 고려합니다.

## 요청과 응답

- form의 `action`, `method`, input `name`을 확인합니다.
- Ajax 요청은 URL, method, request body, response JSON을 확인합니다.
- JSON 응답은 content type과 encoding을 확인합니다.
- session, request attribute 이름을 문서화하거나 코드에서 일관되게 사용합니다.

## 인코딩

- JSP pageEncoding
- HTML meta charset
- request character encoding
- response content type
- DB 컬럼 인코딩

한글 깨짐이 있으면 위 항목을 순서대로 확인합니다.

## 오류 확인

- 404: URL, context path, servlet mapping, JSP 위치
- 400: 파라미터 이름, 숫자/날짜 변환, JSON 형식
- 500: Console 로그, 예외 메시지, null, SQL, DB 연결
- DB 오류: SQL 에러 코드, 테이블명, 컬럼명, 바인딩 값

## 검증

- Tomcat 서버 실행 확인
- 브라우저에서 실제 URL 확인
- Console 로그 확인
- DB 변경 전후 데이터 확인
- Ajax는 Network 탭에서 status code와 response 확인

