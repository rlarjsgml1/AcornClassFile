# AGENTS.md

## 0. Vault 메타 정보

- **경로**: `/Users/dangtongbyun/Obsidian/dangtong-lecture`
- **목적**: PKM 강의 (2026-04 시즌) 실습용 vault
- **기획 vault**: `/Users/dangtongbyun/Obsidian/dangtong-note` (별도, 강의 *기획·교재 작성*용)
- **생성**: 2026-05-22

## 1. Vault 한 줄 소개

PARA 방법론으로 운영되는 PKM(Personal Knowledge Management) Obsidian vault.

## 2. 글로벌 규칙과의 관계

베이스 규칙은 `~/.config/opencode/AGENTS.md` (한국어·간결성·파일 안전성·페르소나).
이 파일은 **vault 고유 규칙**만 덧붙입니다. 글로벌 규칙과 충돌 시 글로벌 우선.

## 3. 폴더 구조 (한 줄 요약)

| 폴더 | 역할 | 상세 |
|---|---|---|
| `00_시스템` | Vault 운영 자산 (Templates, Bases, Canvas) | `00_시스템/README.md` |
| `01_수신함` | 분류 전 임시 보관 (Inbox) | `01_수신함/README.md` |
| `02_프로젝트` | 마감·목표 있는 단기 활동 (PARA: P) | `02_프로젝트/README.md` |
| `03_관리영역` | 지속 책임 영역 (PARA: A) | `03_관리영역/README.md` |
| `04_지식창고` | 주제별 참고 자료 (PARA: R) | `04_지식창고/README.md` |
| `05_보관` | 비활성 항목 (PARA: A-rchive) | `05_보관/README.md` |
| `06_첨부파일` | 이미지·PDF·바이너리 | `06_첨부파일/README.md` |

## 4. 핵심 작업 규칙

- **폴더·파일 생성**: 사용자 승인 후 진행
- **첨부파일 배치**: 모든 바이너리(markdown 이외 모든파일)  `06_첨부파일`에 저장, 본문 노트에서는 wikilink로 참조

## 5. Skill 우선순위

사용자 설치 skill을 built-in보다 우선 사용. Obsidian/PKM 작업 시:

- `obsidian-markdown` — 노트 작성·편집 (wikilinks, callouts, frontmatter)
- `obsidian-bases` — `.base` 데이터베이스 뷰
- `json-canvas` — `.canvas` 시각화
- `llm-wiki-ingest` — raw 문서 → wiki/sources 승격
- `llm-wiki-lint` — vault 구조 검증 (broken links, orphans)
- `raw-tag` — raw 문서 frontmatter 태깅
- `graphify` — 입력 → 지식 그래프

