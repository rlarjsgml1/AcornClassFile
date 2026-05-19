# Usage Guide

AGENTS 패키지를 프로젝트에 적용하는 방법입니다.

## 기본 적용

프로젝트 루트에 아래 구조를 둡니다.

```text
AGENTS.md
00-overview/
01-policies/
02-engineering/
03-projects/
04-templates/
05-logs/
```

## 작업 시작 순서

1. `AGENTS.md`에서 전체 원칙을 확인합니다.
2. 작업 분야에 맞는 `02-engineering/*.md`를 확인합니다.
3. 프로젝트 전용 규칙이 있으면 `03-projects/*.md`를 확인합니다.
4. 작업 후 `05-logs/`에 필요한 기록을 남깁니다.

## 문서 추가 기준

- 모든 프로젝트에 공통이면 `01-policies`에 둡니다.
- 특정 기술에만 적용되면 `02-engineering`에 둡니다.
- 특정 저장소에만 적용되면 `03-projects`에 둡니다.
- 반복 형식이면 `04-templates`에 둡니다.

## 금지 기준

- 같은 파일명을 여러 폴더에 반복해서 만들지 않습니다.
- `README.md`를 폴더마다 만들지 않습니다.
- 루트 `AGENTS.md`에 모든 내용을 몰아넣지 않습니다.
- 이전 문서는 바로 삭제하지 않고 `99-archive`에 보관합니다.

