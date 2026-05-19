# Backend Rules

서버 로직을 작성하거나 수정할 때 적용합니다.

## 기본 흐름

```text
요청 -> Controller/Servlet -> Service -> DAO -> DB -> 응답
```

## 작업 기준

- 요청 파라미터 이름을 실제 화면 코드에서 확인합니다.
- Service는 업무 흐름을 담당합니다.
- DAO는 DB 접근을 담당합니다.
- DTO는 데이터 전달을 담당합니다.
- JSP에는 결과 출력에 필요한 값만 넘깁니다.

## 오류 확인

- 404는 URL, mapping, context path를 확인합니다.
- 500은 예외 stack trace를 확인합니다.
- DB 오류는 SQL, 컬럼명, 연결 정보, 바인딩 값을 확인합니다.

