# Backend Guide

서버, DB 연동, Servlet, Service, DAO 작업 기준을 모아둔 폴더입니다.
백엔드 작업은 항상 요청 흐름, 데이터 흐름, 예외 흐름을 함께 확인합니다.

## 대상

- Servlet / Controller
- Service
- DAO / Repository
- DTO / VO
- DB 연결과 트랜잭션
- JSP로 전달하는 request/session 데이터
- Ajax, JSON 응답
- 인증, 세션, 쿠키, 파일 업로드

## 문서 목록

```text
BACKEND_RULES.md              백엔드 공통 원칙
SERVLET_JSP.md                Servlet, JSP 연결 기준
SERVICE_DAO.md                Service, DAO, DTO 역할 분리
API_SECURITY.md               API, 인증, 보안, 입력 검증 기준
BACKEND_REVIEW_99_CHECKLIST.md 백엔드 최종 점검표
```

## 작업 시작 순서

1. 화면 또는 API 요청 경로를 확인합니다.
2. Servlet/Controller mapping을 확인합니다.
3. Service가 업무 흐름을 담당하는지 확인합니다.
4. DAO가 DB 접근만 담당하는지 확인합니다.
5. DTO, request attribute, session key 이름을 확인합니다.
6. 예외 처리, 로그, 검증 방법을 정리합니다.

## 기본 흐름

```text
Client
  -> Servlet/Controller
  -> Service
  -> DAO
  -> DB
  -> Service
  -> Servlet/Controller
  -> JSP/JSON/Redirect
```

## 완료 기준

- 요청 URL과 HTTP method가 명확합니다.
- 입력값 검증 위치가 명확합니다.
- DB 변경 작업은 트랜잭션 기준이 명확합니다.
- 예외가 숨겨지지 않고 원인 확인이 가능합니다.
- 검증 방법이 기록되어 있습니다.

