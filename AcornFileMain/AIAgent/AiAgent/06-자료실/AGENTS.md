# 자료실 LLM Wiki 운영 지침

이 폴더는 Obsidian에서 LLM wiki 방식으로 운영하는 지식 저장소다. LLM의 역할은 원본 자료를 반복 검색하는 것이 아니라, 원본을 읽고 `wiki/` 계층에 지속적으로 축적되는 정제 지식을 유지하는 것이다.

## 1. 기본 구조

```text
06-자료실/
├─ MOC.md
├─ raw/
│  ├─ articles/
│  ├─ notes/
│  ├─ books/
│  └─ papers/
├─ wiki/
│  ├─ entities/
│  ├─ concepts/
│  ├─ sources/
│  └─ synthesis/
└─ schema/
```

- `raw/`: 원본 자료, 임시 메모, 링크, PDF, 책/논문 단위 자료를 보관한다.
- `wiki/`: LLM이 정제한 지속 지식 페이지를 보관한다.
- `schema/`: 템플릿, 분류 기준, 도메인별 MOC를 보관한다.
- `MOC.md`: 자료실 전체의 최상위 네비게이션이다.

## 2. Layer별 역할

### raw

- 원본성을 유지한다.
- 요약이나 결론을 과하게 섞지 않는다.
- 원본 위치, 수집일, 맥락을 남긴다.
- 원본을 정제했다면 연결된 `wiki/sources/` 페이지를 MOC에 기록한다.

### wiki

- LLM이 관리하는 정제 지식의 본체다.
- 새 자료가 들어오면 기존 페이지를 갱신한다.
- 같은 내용을 매번 새로 요약하지 말고, 이미 있는 entity/concept/source/synthesis 페이지와 연결한다.
- 출처가 없는 주장은 단정하지 않는다.

### schema

- 도메인별 지식 지도와 템플릿을 관리한다.
- 도메인 MOC는 `schema/<도메인명>-MOC.md` 형식으로 만든다.
- 실제 도메인명은 사용자가 명시한 관심 영역을 기준으로 정한다.
- 도메인이 아직 확정되지 않았으면 `schema/_domain-MOC-template.md`만 사용한다.

## 3. Wiki 페이지 필수 frontmatter

`wiki/` 아래의 모든 Markdown 페이지는 다음 관리용 frontmatter를 포함해야 한다.

```yaml
---
title:
type: wiki
layer: wiki
category:
status: seed
created:
updated:
aliases: []
source_refs: []
confidence: medium
tags:
  - llm-wiki
---
```

필드 기준:

- `title`: 페이지 제목
- `type`: `wiki`, `moc`, `template` 중 하나
- `layer`: `raw`, `wiki`, `schema`, `root` 중 하나
- `category`: `entity`, `concept`, `source`, `synthesis` 또는 하위 분류
- `status`: `seed`, `draft`, `active`, `needs-review`, `archived`, `template`
- `source_refs`: 근거가 되는 source 페이지 링크 목록
- `confidence`: `low`, `medium`, `high`

## 4. 자료 추가 워크플로우

1. 원본 자료를 성격에 맞게 `raw/articles`, `raw/notes`, `raw/books`, `raw/papers` 중 하나에 넣는다.
2. 해당 raw 폴더의 `MOC.md`에 자료를 등록한다.
3. 자료를 읽고 `wiki/sources/`에 출처 노트를 만든다.
4. 자료에서 뽑힌 대상은 `wiki/entities/`에 반영한다.
5. 자료에서 뽑힌 개념은 `wiki/concepts/`에 반영한다.
6. 여러 출처를 엮은 결론, 충돌, 비교는 `wiki/synthesis/`에 반영한다.
7. 루트 `MOC.md`와 관련 `schema/<도메인명>-MOC.md`를 갱신한다.

## 5. 링크 규칙

- 내부 연결은 가능한 한 Obsidian wikilink를 사용한다.
- 외부 URL은 Markdown 링크를 사용한다.
- 같은 대상이 여러 이름으로 등장하면 새 페이지를 만들기 전에 기존 aliases를 확인한다.
- 파일명은 검색하기 쉽고 짧게 만든다.
- 도메인 MOC 파일명은 `<도메인명>-MOC.md` 패턴을 유지한다.

## 6. 품질 기준

- 요약은 짧게, 구조는 명확하게 작성한다.
- 주장과 해석을 구분한다.
- 출처가 확인되지 않은 내용은 `추정`, `미확인`, `needs-review`로 표시한다.
- 기존 wiki 페이지와 충돌하는 정보가 있으면 덮어쓰지 말고 충돌 지점을 기록한다.
- 단일 출처 요약은 `wiki/sources/`, 여러 출처를 종합한 결론은 `wiki/synthesis/`에 작성한다.

## 7. 금지 사항

- 사용자 승인 없이 파일을 삭제하지 않는다.
- 사용자 승인 없이 대량 이름 변경이나 폴더 이동을 하지 않는다.
- 원본 자료를 요약본으로 대체하지 않는다.
- 출처 없는 내용을 확정 사실처럼 쓰지 않는다.
- 요청 범위를 넘어 README나 다른 프로젝트 파일을 임의로 수정하지 않는다.

## 8. 현재 관심 도메인

현재 작업 폴더에서 확인 가능한 별도 관심 도메인 목록은 없다. 사용자가 관심 도메인을 지정하면 `schema/<도메인명>-MOC.md`를 만들고, [[schema/_domain-MOC-template]] 구조를 기준으로 관리한다.
