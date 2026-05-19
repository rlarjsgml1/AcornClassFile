# Frontend Rules

화면과 브라우저 동작을 수정할 때 적용합니다.

## 설명 흐름

```text
화면 -> 이벤트 -> JavaScript 로직 -> 요청/상태 변경 -> 결과 표시
```

## 작업 기준

- 기존 HTML 구조와 CSS 네이밍을 우선 따릅니다.
- CSS 수정은 영향 범위를 확인합니다.
- JavaScript 이벤트는 중복 바인딩되지 않게 합니다.
- Ajax/fetch 요청은 URL, method, request body, response를 구분합니다.
- 화면 검증은 브라우저 Console과 실제 클릭 동작을 기준으로 합니다.

## JSP 화면

- JSP는 화면 출력 역할을 우선합니다.
- 복잡한 계산이나 DB 처리는 Servlet, Service, DAO로 분리합니다.
- 서버에서 넘긴 값과 브라우저에서 만든 값을 구분합니다.

