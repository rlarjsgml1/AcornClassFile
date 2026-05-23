# AGENTS.md

## 0. Vault 메타 정보

- **경로**: `/mnt/c/AcornFile/AcornFileMain/AIAgent/AiAgent`
- **목적**: AI Agent, Agentic 개발환경, PKM, 학습·취업 준비 자료를 관리하는 Obsidian vault
- **참조 양식**: `AGENTS-refer.md`
- **생성**: 2026-05-23

## 1. Vault 한 줄 소개

AI Agent 개발환경과 개인 지식 관리를 함께 운영하는 Obsidian vault.

## 2. 글로벌 규칙과의 관계

베이스 규칙은 `~/.config/opencode/AGENTS.md` 및 상위 `AGENTS.md`를 따릅니다.
이 파일은 **vault 고유 규칙**만 덧붙입니다. 글로벌 규칙과 충돌 시 글로벌 우선.

## 3. 폴더 구조 (한 줄 요약)

| 폴더 | 역할 | 상세 |
|---|---|---|
| `01-수신함` | 분류 전 임시 보관 (Inbox) | 새 메모, 캡처, 미정리 아이디어 |
| `02-프로젝트` | 마감·목표 있는 단기 활동 | 진행 중인 작업, 산출물, 실행 계획 |
| `03-영역` | 지속 책임 영역 | 장기적으로 관리할 역할·책임·운영 기준 |
| `04-취업준비` | 취업·커리어 준비 자료 | 이력서, 포트폴리오, 면접, 기업 분석 |
| `05-학습자료` | 학습 노트와 강의 자료 | 기술 학습, 강의 정리, 실습 기록 |
| `06-자료실` | 참고 자료 저장소 | 재사용 가능한 문서, 링크, 리서치 자료 |
| `07-회고와성장` | 회고·성장 기록 | 주간/월간 회고, 자기 평가, 개선 기록 |
| `08-보관소` | 비활성 항목 보관 | 완료·중단·참조용 아카이브 |
| `99-Attachments` | 이미지·PDF·바이너리 | 본문 노트에서는 wikilink로 참조 |

## 4. 핵심 작업 규칙

- **폴더·파일 생성**: 사용자 승인 후 진행
- **수정 범위**: 사용자가 지정한 파일과 직접 관련된 파일만 수정
- **첨부파일 배치**: 모든 바이너리(markdown 이외 모든 파일)는 `99-Attachments`에 저장, 본문 노트에서는 wikilink로 참조
- **노트 작성**: markdown 문법과 Obsidian wikilink를 우선 사용
- **불확실한 분류**: 임의 판단하지 말고 `01-수신함`에 임시 배치하거나 사용자에게 확인

## 5. Skill 우선순위

사용자 설치 skill을 built-in보다 우선 사용. Obsidian/PKM 작업 시:

- `obsidian-markdown` — 노트 작성·편집 (wikilinks, callouts, frontmatter)
- `obsidian-bases` — `.base` 데이터베이스 뷰
- `json-canvas` — `.canvas` 시각화
- `llm-wiki-ingest` — raw 문서 → wiki/sources 승격
- `llm-wiki-lint` — vault 구조 검증 (broken links, orphans)
- `raw-tag` — raw 문서 frontmatter 태깅
- `graphify` — 입력 → 지식 그래프
