# Testing Verification Guide

작업 후 검증 기준입니다.

## 공통 검증

- 변경 파일 목록 확인
- 변경 범위 확인
- 실행 가능한 최소 검증 수행
- 실패한 검증은 에러 메시지와 함께 기록
- 검증하지 못한 항목은 미확인으로 표시

## Java

```powershell
javac -encoding UTF-8 -d .codex-build path\to\File.java
```

## Java Web

- Tomcat 서버 실행 여부
- 브라우저 URL 확인
- Console 로그 확인
- DB 연동 시 SQL 결과 확인

## Frontend

- 브라우저 Console 오류 확인
- 버튼, 입력, 화면 전환 확인
- Network 요청 상태 확인

## Git

```powershell
git status --short
git diff --stat
```

