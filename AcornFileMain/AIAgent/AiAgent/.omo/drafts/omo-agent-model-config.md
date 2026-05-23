# Draft: OMO Agent Model Config

## Requirements (confirmed)
- 목표: `C:\Users\01021\.config\opencode\oh-my-openagent.json`의 에이전트별 모델 및 `reasoningEffort` 설정 계획 수립
- 우선순위: 가성비보다 품질 우선
- 조사 기준: OH MY OPENCODE 가이드 확인
- 품질 기준 외 요구: JSON 들여쓰기/가독성 유지

## Technical Decisions
- 품질 우선 방향 유지
- OMO 공식 가이드/스키마를 근거로 계획 수립
- 설정 필드 검토 대상: `model`, `reasoningEffort`, `variant`, `fallback_models`

## Research Findings
- 현재 설정 파일 구조:
  - 최상위 키: `$schema`, `agents`, `categories`
  - `agents`: 10개 항목
  - `categories`: 8개 항목
  - 모든 주 엔트리가 `model`, `reasoningEffort`, `variant`를 가짐
  - `categories`는 전부 `fallback_models`를 가짐
  - `agents`는 10개 중 7개가 `fallback_models`를 가짐
- OMO 공식 문서/스키마 기준:
  - `reasoningEffort` 허용값: `none`, `minimal`, `low`, `medium`, `high`, `xhigh`, `max`
  - `variant`와 `reasoningEffort`는 별도 필드로 지원됨
  - 에이전트/카테고리별 override 가능
  - JSONC 친화적이나 현재 대상 파일은 JSON 형식 유지 중
- 품질 우선 모델 조사 메모:
  - 상위 조정/비평 역할은 더 높은 추론 강도가 적합
  - 탐색/대량 병렬 역할은 상대적으로 낮은 강도도 실용적일 수 있음
  - 다만 이번 요청은 가성비보다 품질 우선이므로, 역할 차등은 두되 품질 중심으로 배치 필요

## Open Questions
- 이번 계획 범위를 `agents`만으로 한정할지, `categories`와 `fallback_models`까지 포함할지 미확정
- 모델 공급자를 OpenAI 전용으로 고정할지 미확정
- `variant`를 `reasoningEffort`와 동일값으로 강제할지 미확정

## Scope Boundaries
- INCLUDE: OMO 설정 구조 조사, 역할별 모델 적합성 조사, 품질 우선 설정 전략
- EXCLUDE: 실제 설정 파일 적용은 아직 범위 미확정
