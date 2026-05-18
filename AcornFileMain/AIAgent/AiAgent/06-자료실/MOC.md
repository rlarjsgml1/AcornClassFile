---
title: 자료실 MOC
type: moc
layer: root
status: seed
created: 2026-05-16
updated: 2026-05-16
aliases:
  - 자료실 지도
tags:
  - llm-wiki
  - moc
---

# 자료실 MOC

이 문서는 `06-자료실` LLM wiki의 최상위 네비게이션입니다.

## 운영 원칙

- `raw/`에는 원본 자료와 임시 캡처를 보관합니다.
- `wiki/`에는 LLM이 정제하고 연결한 지속 지식을 보관합니다.
- `schema/`에는 템플릿, 분류 기준, 도메인별 MOC를 보관합니다.
- 새 자료를 추가하면 관련 `wiki` 페이지와 MOC를 함께 갱신합니다.

## Raw Layer

- [[raw/articles/MOC|Articles]]: 웹 글, 블로그, 온라인 문서
- [[raw/notes/MOC|Notes]]: 빠른 메모, 생각, 임시 캡처
- [[raw/books/MOC|Books]]: 책, 챕터, 독서 노트 원본
- [[raw/papers/MOC|Papers]]: 논문, 리포트, 학술 자료

## Wiki Layer

- [[wiki/entities/MOC|Entities]]: 사람, 조직, 제품, 프로젝트, 라이브러리
- [[wiki/concepts/MOC|Concepts]]: 개념, 원리, 패턴, 방법론
- [[wiki/sources/MOC|Sources]]: 정제된 출처 노트
- [[wiki/synthesis/MOC|Synthesis]]: 여러 자료를 엮은 종합 정리

## Schema Layer

- [[schema/MOC|Schema MOC]]: 템플릿과 운영 스키마
- [[schema/_domain-MOC-template|Domain MOC Template]]: `schema/<도메인명>-MOC.md` 작성 템플릿

## Inbox

- 새 자료를 넣은 뒤 아직 정제하지 않았다면 가장 가까운 `raw/*/MOC.md`에 먼저 기록합니다.
- 정제 후에는 `wiki/sources/`에 출처 노트를 만들고, 관련 `wiki/entities`, `wiki/concepts`, `wiki/synthesis` 페이지를 갱신합니다.
