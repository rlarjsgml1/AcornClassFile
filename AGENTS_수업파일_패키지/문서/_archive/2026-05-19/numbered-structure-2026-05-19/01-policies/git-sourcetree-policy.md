# Git SourceTree Policy

GitHub와 SourceTree 작업 기준입니다.

## 커밋 전 확인

SourceTree의 File Status에서 아래를 확인합니다.

- stage할 파일이 실제 작업 범위에 포함되는지
- `.metadata/`, `bin/`, `*.class`, `*.lock`, `*.log`가 빠졌는지
- 새로 만든 `.java`, `.md`, 정리 파일이 빠지지 않았는지
- 의도하지 않은 대량 변경이 없는지

## 커밋 메시지 기준

혼자 관리하는 저장소라도 변경 목적이 드러나야 합니다.

좋은 예:

```text
Java2 Day3 실습 파일 추가
Java2 Day3 컴파일 오류 수정
AGENTS 문서 구조 실무형으로 정리
WEB_CLOUD ajax 실습 파일 추가
```

피할 예:

```text
수정
작업
테스트
아무거나
```

## 승인 후 진행할 Git 작업

- push
- reset
- merge
- rebase
- clean
- force push

## 확인 명령

```powershell
git status --short
git diff --stat
```

