# Servlet JSP

Servlet과 JSP 연결 작업에 적용합니다.

## Servlet 확인

- `@WebServlet` mapping을 확인합니다.
- `doGet`, `doPost` 중 실제 요청 방식과 맞는지 확인합니다.
- request parameter 이름이 form input name과 같은지 확인합니다.
- forward와 redirect의 차이를 구분합니다.

## JSP 확인

- JSP 파일 위치가 직접 접근 가능한 위치인지 확인합니다.
- `WEB-INF/views` 아래 JSP는 Servlet forward로 접근합니다.
- request/session/application scope를 구분합니다.
- JSTL, EL 사용 여부를 프로젝트 설정에서 확인합니다.

## 자주 나는 문제

- URL 오타
- context path 누락
- servlet mapping 불일치
- JSP 위치 오류
- request attribute 이름 불일치

