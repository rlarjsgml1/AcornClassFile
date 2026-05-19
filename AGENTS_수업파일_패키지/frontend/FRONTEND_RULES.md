# Frontend Rules

화면과 브라우저 동작을 수정할 때 적용합니다.

## 설명 흐름

```text
화면 -> 이벤트 -> JavaScript 로직 -> 요청/상태 변경 -> 결과 표시
```

## 작업 기준

- 기존 HTML 구조와 CSS 네이밍을 우선 따릅니다.
- CSS 수정은 영향 범위를 확인합니다.
- 폰트, 크기, 여백, 박스 모델은 `CSS_FOUNDATION_RULES.md` 기준을 우선합니다.
- JavaScript 이벤트는 중복 바인딩되지 않게 합니다.
- Ajax/fetch 요청은 URL, method, request body, response를 구분합니다.
- 화면 검증은 브라우저 Console과 실제 클릭 동작을 기준으로 합니다.

## CSS 기본 규칙

- 모든 새 화면은 `box-sizing: border-box` 기준으로 작성합니다.
- 폰트는 프로젝트에 이미 지정된 폰트가 있으면 그 값을 우선합니다.
- 새 프로젝트나 폰트 기준이 없으면 `CSS_FOUNDATION_RULES.md`의 한국어 기본 스택을 사용합니다.
- 폰트 크기, 여백, 카드 크기, 버튼 높이는 임의 숫자보다 정해진 scale을 사용합니다.
- 모바일과 데스크톱에서 텍스트가 버튼, 카드, 입력창 밖으로 넘치지 않는지 확인합니다.

## JSP 화면

- JSP는 화면 출력 역할을 우선합니다.
- 복잡한 계산이나 DB 처리는 Servlet, Service, DAO로 분리합니다.
- 서버에서 넘긴 값과 브라우저에서 만든 값을 구분합니다.
