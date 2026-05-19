# JavaScript

JavaScript, 브라우저, Node.js, VSCode 작업에 적용합니다.

## 설명 흐름

```text
화면 -> 이벤트 -> 로직 -> 상태 변경 -> 결과 표시
```

서버 연동:

```text
요청 -> 서버 -> 응답 -> 화면 반영
```

## 프로젝트 확인

- 순수 JavaScript, Node.js, React, Vue, Express 중 무엇인지 먼저 확인합니다.
- package manager는 `package-lock.json`, `yarn.lock`, `pnpm-lock.yaml`을 보고 판단합니다.
- CommonJS와 ES Module을 임의로 섞지 않습니다.
- 기존 DOM 조작 방식과 이벤트 바인딩 방식을 따릅니다.

## 실무형 작성 기준

- `const`를 기본으로 쓰고, 재할당이 필요할 때만 `let`을 사용합니다.
- 전역 변수 추가를 최소화합니다.
- DOM 선택자는 한 곳에서 관리하거나 역할이 보이게 작성합니다.
- 이벤트는 중복 바인딩되지 않게 합니다.
- 반복되는 문자열, selector, URL은 상수로 분리합니다.
- 비동기 코드는 기존 방식에 맞춰 `async/await`, Promise, callback 중 하나를 일관되게 사용합니다.

## DOM과 이벤트

- DOM이 로드된 뒤 요소를 선택합니다.
- 동적으로 추가되는 요소는 event delegation을 고려합니다.
- form submit은 기본 동작을 막을지 여부를 명확히 합니다.
- 버튼 중복 클릭으로 중복 요청이 나가지 않게 처리합니다.

## API 연동

- API URL, method, headers, request body, response 형식을 확인합니다.
- 성공과 실패를 모두 처리합니다.
- 응답이 JSON인지 text/html인지 확인합니다.
- API URL, 토큰, 비밀값은 코드에 직접 넣지 않습니다.

## 보안과 안정성

- 사용자 입력값을 `innerHTML`에 바로 넣지 않습니다.
- HTML 삽입이 필요하면 escape 또는 허용 정책을 확인합니다.
- null인 DOM 요소에 이벤트를 걸지 않도록 확인합니다.
- 숫자 변환은 `Number`, `parseInt` 기준을 명확히 합니다.

## 검증

- 브라우저 Console 오류 확인
- Network 요청 상태 확인
- 화면 동작 확인
- form 입력과 빈 값 확인
- Node.js는 터미널 로그와 stack trace 확인

