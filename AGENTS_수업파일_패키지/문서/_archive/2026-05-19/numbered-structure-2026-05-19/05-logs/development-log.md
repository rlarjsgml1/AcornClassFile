# Development Log

실제 개발, 정리, 문서화 작업 기록입니다.

## 2026-05-19 - AGENTS 패키지 실무형 구조 정리

대상:
- `C:\AcornFile\AGENTS_수업파일_패키지`
- `C:\Users\qhdud\OneDrive\바탕 화면\AGENTS_98점_패키지`

변경:
- 기존 `docs`, `code`, `backend`, `frontend`, `문서`, `규칙`, `디자인`, `모델`, `logs` 구조를 archive로 보관했습니다.
- 새 표준 구조를 `00-overview`, `01-policies`, `02-engineering`, `03-projects`, `04-templates`, `05-logs`, `99-archive`로 정리했습니다.
- 중복 파일명처럼 보이던 여러 `README.md` 구조를 제거하고 역할별 고유 파일명으로 바꿨습니다.

이유:
- 문서가 기능별로 섞여 있어 찾기 어렵고, 실무형 운영 기준으로 사용하기 불편했기 때문입니다.

검증:
- 두 패키지의 활성 폴더 구조가 같은지 확인했습니다.
- `99-archive`를 제외한 활성 `.md` 파일의 경로와 SHA256 해시가 같은지 확인했습니다.
- `99-archive`를 제외한 활성 문서에 중복 파일명이 없는지 확인했습니다.
