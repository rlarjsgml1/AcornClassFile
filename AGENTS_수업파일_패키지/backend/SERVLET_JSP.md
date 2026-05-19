# Servlet JSP

Servlet과 JSP 연결 작업에 적용합니다.

## 1. Servlet 확인

- `@WebServlet` mapping을 확인합니다.
- `doGet`, `doPost` 중 실제 요청 방식과 맞는지 확인합니다.
- form의 `action`, `method`, input `name`을 확인합니다.
- request parameter 이름이 Java 코드와 같은지 확인합니다.
- forward와 redirect의 차이를 구분합니다.

## 2. JSP 확인

- JSP 파일 위치가 직접 접근 가능한 위치인지 확인합니다.
- `WEB-INF/views` 아래 JSP는 Servlet forward로 접근합니다.
- request/session/application scope를 구분합니다.
- JSTL, EL 사용 여부를 프로젝트 설정에서 확인합니다.
- JSP에는 복잡한 Java 로직을 넣지 않습니다.

## 3. forward와 redirect

forward:

- 서버 내부에서 JSP로 이동합니다.
- request attribute를 유지합니다.
- 조회 결과 화면 출력에 적합합니다.

redirect:

- 브라우저에게 새 URL 요청을 시킵니다.
- request attribute는 유지되지 않습니다.
- 등록, 수정, 삭제 후 새로고침 중복 실행 방지에 적합합니다.

## 4. 인코딩 기준

- 한글 깨짐이 있으면 request encoding, response content type, JSP page encoding을 확인합니다.
- POST 요청은 파라미터 읽기 전에 encoding을 설정합니다.
- HTML meta charset과 JSP pageEncoding을 함께 확인합니다.

## 5. 세션과 쿠키

- 로그인 상태는 session 기준으로 확인합니다.
- 민감 정보는 쿠키에 직접 저장하지 않습니다.
- 로그아웃은 session invalidate 또는 필요한 attribute 제거 기준을 정합니다.
- 장바구니, 설문, 로그인 실습은 session key 이름을 문서화합니다.

## 6. Ajax / JSON

- 요청 URL, method, request body, response JSON 구조를 명확히 합니다.
- JSON 응답은 content type을 확인합니다.
- 성공/실패 응답 형식을 일관되게 둡니다.
- 브라우저 Network 탭에서 status code와 response를 확인합니다.

## 7. 파일 업로드

- form `enctype="multipart/form-data"`를 확인합니다.
- 저장 경로가 프로젝트 내부인지 외부인지 구분합니다.
- 파일명 충돌, 확장자, 크기 제한을 확인합니다.
- 업로드 파일 경로를 DB에 저장하는 경우 실제 저장 경로와 URL 경로를 구분합니다.

## 8. 자주 나는 문제

- URL 오타
- context path 누락
- servlet mapping 불일치
- JSP 위치 오류
- request attribute 이름 불일치
- POST 인코딩 누락
- forward해야 할 상황에서 redirect 사용
- redirect 후 request 값이 사라짐

