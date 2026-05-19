# Domain Model

수업 프로젝트의 업무 개념과 관계를 정리할 때 적용합니다.

## 작성 기준

- 개념 이름을 먼저 정합니다.
- 개념 사이의 관계를 적습니다.
- 화면, 서버, DB에서 같은 개념을 다른 이름으로 부르면 매핑합니다.
- 규칙과 예외를 따로 적습니다.

## 예시

```text
회원
- 화면: member.jsp
- Java 객체: MemberDTO
- DB 테이블: MEMBER
- 규칙: id는 중복될 수 없음
```

## 사용 위치

- Java Web의 Service 설계
- DAO와 DTO 분리
- 프론트엔드 JSON 응답 구조
- README나 발표용 설명 문서

