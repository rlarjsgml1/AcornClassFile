---
title: "AGENTS.md 완전 가이드"
source: "https://www.aihero.dev/a-complete-guide-to-agents-md"
author: "Matt Pocock"
created: 2026-05-16
tags:
  - agents-md
  - ai-agent
  - documentation
---

# AGENTS.md 완전 가이드

원문: [A Complete Guide To AGENTS.md](https://www.aihero.dev/a-complete-guide-to-agents-md)

작성자: Matt Pocock

## 들어가며

`AGENTS.md` 파일의 크기가 너무 커지고 있지는 않은지 걱정해 본 적이 있는가?

그 걱정은 타당할 수 있다. 잘못 작성된 `AGENTS.md`는 에이전트를 혼란스럽게 만들고, 유지보수하기 어려운 악몽이 되며, 매 요청마다 토큰 비용을 낭비하게 만든다.

그러니 어떻게 고쳐야 하는지 알아둘 필요가 있다.

## AGENTS.md란 무엇인가?

`AGENTS.md`는 저장소에 함께 커밋하는 Markdown 파일로, AI 코딩 에이전트가 해당 저장소에서 어떻게 동작해야 하는지 조정하는 역할을 한다. 이 파일은 대화 기록의 맨 위, 시스템 프롬프트 바로 아래에 위치한다.

기본 시스템 지침과 실제 코드베이스 사이에 놓이는 설정 계층이라고 생각하면 된다. 이 파일에는 크게 두 종류의 안내가 들어갈 수 있다.

- **개인 범위**: 선호하는 커밋 스타일, 선호하는 코딩 패턴
- **프로젝트 범위**: 프로젝트가 무엇을 하는지, 어떤 패키지 매니저를 쓰는지, 어떤 아키텍처 결정을 따르는지

`AGENTS.md`는 여러 도구가 지원하는 공개 표준이다. 단, 모든 도구가 지원하는 것은 아니다.

### CLAUDE.md

Claude Code는 `AGENTS.md`를 사용하지 않고 `CLAUDE.md`를 사용한다. 여러 도구에서 같은 지침을 쓰고 싶다면 심볼릭 링크를 만들 수 있다.

```bash
# AGENTS.md에서 CLAUDE.md로 심볼릭 링크 생성
ln -s AGENTS.md CLAUDE.md
```

## 거대한 AGENTS.md 파일이 문제가 되는 이유

`AGENTS.md`가 위험할 정도로 커지는 자연스러운 피드백 루프가 있다.

1. 에이전트가 마음에 들지 않는 행동을 한다.
2. 그 행동을 막기 위해 규칙을 추가한다.
3. 몇 달 동안 이 과정을 수백 번 반복한다.
4. 파일이 진흙덩어리처럼 엉망이 된다.

서로 다른 개발자들이 상충하는 의견을 추가한다. 전체적인 스타일 정리는 아무도 하지 않는다. 결과적으로 유지보수할 수 없는 혼란스러운 파일이 만들어지고, 실제로 에이전트 성능을 떨어뜨린다.

또 다른 원인은 자동 생성된 `AGENTS.md` 파일이다. 초기화 스크립트로 `AGENTS.md`를 자동 생성하지 않는 것이 좋다. 이런 파일은 "대부분의 상황에서 유용할 수 있는" 내용으로 가득 차지만, 그런 내용은 점진적으로 공개하는 편이 낫다. 자동 생성 파일은 절제보다 포괄성을 우선한다.

### 지침 예산

Humanlayer의 Kyle은 [좋은 CLAUDE.md 작성법](https://www.humanlayer.dev/blog/writing-a-good-claude-md) 글에서 "지침 예산"이라는 개념을 언급한다.

> 최첨단 추론 LLM은 약 150~200개의 지침을 합리적으로 일관되게 따를 수 있다. 작은 모델은 큰 모델보다 처리할 수 있는 지침 수가 적고, 비추론 모델은 추론 모델보다 처리할 수 있는 지침 수가 적다.

`AGENTS.md`에 있는 모든 토큰은 관련성이 있든 없든 **모든 요청마다** 로드된다. 이것은 명확한 예산 문제를 만든다.

| 상황 | 영향 |
| --- | --- |
| 작고 집중된 `AGENTS.md` | 작업별 지침에 더 많은 토큰을 사용할 수 있음 |
| 크고 비대한 `AGENTS.md` | 실제 작업에 쓸 토큰이 줄고 에이전트가 혼란스러워짐 |
| 관련 없는 지침 | 토큰 낭비와 에이전트 주의 분산으로 성능 저하 |

결론적으로 **이상적인 `AGENTS.md` 파일은 가능한 한 작아야 한다.**

### 오래된 문서는 컨텍스트를 오염시킨다

큰 `AGENTS.md` 파일의 또 다른 문제는 낡은 정보다.

문서는 빠르게 오래된다. 사람 개발자에게 오래된 문서는 성가신 정도지만, 사람은 대체로 잘못된 문서를 의심할 만큼의 맥락과 기억을 갖고 있다. 반면 AI 에이전트는 매 요청마다 문서를 읽기 때문에, 오래된 정보가 컨텍스트를 적극적으로 오염시킨다.

특히 파일 시스템 구조를 문서화할 때 위험하다. 파일 경로는 자주 바뀐다. `AGENTS.md`에 "인증 로직은 `src/auth/handlers.ts`에 있다"고 적혀 있는데 그 파일이 이름이 바뀌거나 이동했다면, 에이전트는 자신 있게 잘못된 위치를 찾게 된다.

구조를 문서화하기보다 기능을 설명하라. 특정 파일이 어디에 있을 수 있는지와 프로젝트의 전체적인 형태에 대한 힌트만 제공하라. 에이전트가 계획 단계에서 필요한 시점에 직접 문서를 생성하게 하라.

"organization", "group", "workspace" 같은 도메인 개념은 파일 경로보다 안정적이므로 문서화하기 더 안전하다. 하지만 AI 지원 개발 속도가 빠른 코드베이스에서는 이런 개념도 변할 수 있다. 가볍게 다루는 편이 좋다.

## 큰 AGENTS.md 줄이기

여기에 무엇을 넣을지 매우 엄격하게 판단하라. 절대 최소한으로는 다음 정도만 고려하면 된다.

- **한 문장짜리 프로젝트 설명**: 역할 기반 프롬프트처럼 작동한다.
- **패키지 매니저**: npm이 아닐 경우, 또는 `corepack`으로 경고를 처리할 경우.
- **빌드/타입체크 명령어**: 표준적이지 않을 경우.

솔직히 말해 이 정도면 충분하다. 나머지는 다른 곳에 있어야 한다.

### 한 줄 프로젝트 설명

이 한 문장은 에이전트에게 이 저장소에서 왜 작업하는지에 대한 맥락을 준다. 에이전트가 내리는 모든 결정을 고정하는 기준점이 된다.

예시:

```markdown
This is a React component library for accessible data visualization.
```

이것이 기반이다. 이제 에이전트는 자신의 작업 범위를 이해한다.

### 패키지 매니저 명시

JavaScript 프로젝트에서 npm이 아닌 다른 도구를 사용한다면 에이전트에게 명확히 알려야 한다.

```markdown
This project uses pnpm workspaces.
```

그렇지 않으면 에이전트가 기본적으로 `npm`을 사용해 잘못된 명령어를 만들 수 있다.

`corepack`도 좋은 선택이다. [`corepack`](https://github.com/nodejs/corepack)을 사용하면 시스템이 경고를 자동으로 처리하게 할 수 있어 소중한 지침 예산을 아낄 수 있다.

### 점진적 공개를 사용하라

모든 내용을 `AGENTS.md`에 밀어 넣는 대신 **점진적 공개**를 사용하라. 에이전트에게 지금 필요한 것만 주고, 필요할 때 참고할 다른 자료를 가리키는 방식이다.

에이전트는 문서 계층을 빠르게 탐색할 수 있다. 필요한 것을 찾을 만큼 컨텍스트를 잘 이해한다.

#### 언어별 규칙은 별도 파일로 옮기기

현재 `AGENTS.md`에 다음과 같은 내용이 있다면:

```markdown
Always use const instead of let.
Never use var.
Use interface instead of type when possible.
Use strict null checks.
...
```

이를 별도 파일로 옮겨라. 루트 `AGENTS.md`에는 다음처럼 적으면 된다.

```markdown
For TypeScript conventions, see docs/TYPESCRIPT.md
```

여기서 중요한 점은 가벼운 표현이다. "항상", 대문자 강제 같은 표현을 쓰지 않는다. 대화하듯 참고 경로만 제시한다.

장점은 다음과 같다.

- TypeScript 규칙은 에이전트가 TypeScript를 작성할 때만 로드된다.
- CSS 디버깅이나 의존성 관리 같은 다른 작업에서는 토큰을 낭비하지 않는다.
- 파일이 집중된 상태를 유지하고, 모델 변화에도 더 잘 견딘다.

#### 점진적 공개를 중첩하기

더 깊게 구성할 수도 있다. `docs/TYPESCRIPT.md`가 `docs/TESTING.md`를 참조하게 만들 수 있다. 탐색 가능한 리소스 트리를 만드는 것이다.

```txt
docs/
├── TYPESCRIPT.md
│   └── TESTING.md 참조
├── TESTING.md
│   └── 특정 테스트 러너 참조
└── BUILD.md
    └── esbuild 설정 참조
```

Prisma 문서, Next.js 문서 같은 외부 자료로 연결해도 된다. 에이전트는 이런 계층을 효율적으로 탐색한다.

#### 에이전트 스킬 사용하기

많은 도구는 "에이전트 스킬"을 지원한다. 에이전트가 특정 작업 방법을 배우기 위해 호출할 수 있는 명령이나 워크플로다. 이것 역시 점진적 공개의 한 형태다. 에이전트는 필요할 때만 지식을 가져온다.

이 주제는 별도 글에서 더 자세히 다룬다.

## 모노레포에서의 AGENTS.md

루트에 하나의 `AGENTS.md`만 둘 수 있는 것은 아니다. 하위 디렉터리에도 `AGENTS.md` 파일을 둘 수 있으며, 이 파일들은 **루트 수준 파일과 병합된다**.

모노레포에서는 이 방식이 강력하다.

### 무엇을 어디에 둘 것인가

| 수준 | 내용 |
| --- | --- |
| **루트** | 모노레포의 목적, 패키지 탐색 방법, 공유 도구(pnpm workspaces 등) |
| **패키지** | 패키지의 목적, 특정 기술 스택, 패키지별 관례 |

루트 `AGENTS.md` 예시:

```markdown
This is a monorepo containing web services and CLI tools.
Use pnpm workspaces to manage dependencies.
See each package's AGENTS.md for specific guidelines.
```

패키지 수준 `AGENTS.md` 예시(`packages/api/AGENTS.md`):

```markdown
This package is a Node.js GraphQL API using Prisma.
Follow docs/API_CONVENTIONS.md for API design patterns.
```

**어떤 수준도 과부하시키지 말라.** 에이전트는 병합된 모든 `AGENTS.md` 파일을 컨텍스트에서 보게 된다. 각 수준은 해당 범위와 관련된 내용에 집중해야 한다.

## 망가진 AGENTS.md를 고치는 프롬프트

저장소의 `AGENTS.md`가 걱정되기 시작했고, 이를 점진적 공개 원칙에 맞게 리팩터링하고 싶다면 다음 프롬프트를 코딩 에이전트에 붙여 넣어 볼 수 있다.

```txt
I want you to refactor my AGENTS.md file to follow progressive disclosure principles.

Follow these steps:

1. **Find contradictions**: Identify any instructions that conflict with each other. For each contradiction, ask me which version I want to keep.

2. **Identify the essentials**: Extract only what belongs in the root AGENTS.md:
   - One-sentence project description
   - Package manager (if not npm)
   - Non-standard build/typecheck commands
   - Anything truly relevant to every single task

3. **Group the rest**: Organize remaining instructions into logical categories (e.g., TypeScript conventions, testing patterns, API design, Git workflow). For each group, create a separate markdown file.

4. **Create the file structure**: Output:
   - A minimal root AGENTS.md with markdown links to the separate files
   - Each separate file with its relevant instructions
   - A suggested docs/ folder structure

5. **Flag for deletion**: Identify any instructions that are:
   - Redundant (the agent already knows this)
   - Too vague to be actionable
   - Overly obvious (like "write clean code")
```

## 진흙덩어리를 만들지 말라

`AGENTS.md`에 무언가를 추가하려고 할 때마다 그것이 어디에 속하는지 스스로 물어보라.

| 위치 | 사용할 때 |
| --- | --- |
| 루트 `AGENTS.md` | 저장소의 모든 작업과 관련될 때 |
| 별도 파일 | TypeScript, 테스트 등 특정 도메인 하나와 관련될 때 |
| 중첩 문서 트리 | 계층적으로 조직할 수 있을 때 |

이상적인 `AGENTS.md`는 작고 집중되어 있으며, 필요한 내용은 다른 곳을 가리킨다. 에이전트가 작업을 시작할 만큼의 컨텍스트와 더 자세한 안내로 이어지는 단서만 제공한다.

그 외의 모든 것은 점진적 공개에 둔다. 별도 파일, 중첩된 `AGENTS.md`, 또는 스킬이 그 역할을 한다.

이렇게 하면 지침 예산을 효율적으로 쓰고, 에이전트가 집중하게 만들며, 도구와 모범 사례가 변화해도 설정을 오래 유지할 수 있다.

## 핵심 요약

- `AGENTS.md`는 에이전트의 저장소별 행동을 조정하는 설정 계층이다.
- 큰 `AGENTS.md`는 토큰을 낭비하고, 오래된 정보로 에이전트 컨텍스트를 오염시킬 수 있다.
- 루트 `AGENTS.md`에는 프로젝트 설명, 패키지 매니저, 비표준 빌드/타입체크 명령처럼 모든 작업에 필요한 최소 정보만 둔다.
- 언어별 규칙, 테스트 관례, API 설계 원칙 등은 별도 문서로 분리하고 루트 파일에서는 링크만 제공한다.
- 모노레포에서는 루트와 패키지별 `AGENTS.md`를 함께 사용하되, 각 수준에 맞는 내용만 담아야 한다.
- 좋은 `AGENTS.md`의 목표는 모든 지식을 담는 것이 아니라, 에이전트가 필요한 정보를 스스로 찾을 수 있게 길을 열어 주는 것이다.
