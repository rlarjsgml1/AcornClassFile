# 한국 대학생·취준생용 PARA Obsidian Vault 구축

## TL;DR
> **Summary**: 새 Obsidian Vault에 PARA 기반 최상위 폴더 8개를 번호+한글 형식으로 만들고, 각 폴더에 한국 대학생·취준생 관점의 `README.md`를 작성한다.
> **Deliverables**:
> - `01-수신함` ~ `08-보관소` 최상위 폴더 8개
> - 각 폴더별 `README.md` 8개
> - 모든 README에 `## 목적`, `## 용도`, `## 사용법` 순서 포함
> **Effort**: Short
> **Parallel**: YES - 2 waves
> **Critical Path**: Task 1 → Tasks 2-8 → Final Verification Wave

## Context
### Original Request
- 새 Obsidian Vault를 만들었고, 한국 대학생/취준생을 위한 개인 지식관리 시스템을 구축하려고 한다.
- PARA 방법론(Tiago Forte) + 한국 사용자용 확장에 기반한다.
- 폴더명은 `01-수신함`처럼 번호 + 한글 형식으로 추천한다.
- 각 폴더 안에 `README.md`를 만들고 `목적`, `용도`, `사용법`을 포함한다.
- README는 한국어 마크다운으로 작성하며, 한국 대학생·취준생 본인 관점에서 “내 일에 어떻게 적용할지” 구체 예시를 포함한다.

### Interview Summary
- 사용자는 최상위 폴더를 10~12개로 세분화하기보다 **8개 안팎의 간결한 구조**를 선택했다.
- 사용자는 `취업준비`를 프로젝트나 영역 내부가 아니라 **독립 최상위 폴더**로 두는 안을 선택했다.
- 테스트 프레임워크는 필요 없으며, 검증은 파일/내용 확인 중심의 agent-executed QA로 수행한다.

### Metis Review (gaps addressed)
- 기존 `환영합니다!.md`는 건드리지 않는다.
- `.obsidian/`, `.sisyphus/`, `Excalidraw/`는 기존 시스템/플러그인 폴더이므로 8개 최상위 폴더 개수에 포함하지 않는다.
- README heading은 정확히 `## 목적`, `## 용도`, `## 사용법` 순서로 작성한다.
- `05-학습자료`는 강의/자격증/스터디 학습물, `06-자료실`은 장기 참고자료/도구/산업·회사 리서치로 구분한다.
- Windows 한국어 환경을 고려해 UTF-8 Markdown으로 저장한다.

## Work Objectives
### Core Objective
Obsidian Vault 루트 `C:\minjeong-brain`에 한국 대학생·취준생이 바로 사용할 수 있는 PARA 기반 폴더 체계와 README 가이드를 만든다.

### Deliverables
- `C:\minjeong-brain\01-수신함\README.md`
- `C:\minjeong-brain\02-프로젝트\README.md`
- `C:\minjeong-brain\03-영역\README.md`
- `C:\minjeong-brain\04-취업준비\README.md`
- `C:\minjeong-brain\05-학습자료\README.md`
- `C:\minjeong-brain\06-자료실\README.md`
- `C:\minjeong-brain\07-회고와성장\README.md`
- `C:\minjeong-brain\08-보관소\README.md`

### Definition of Done (verifiable conditions with commands)
- `Test-Path -LiteralPath "C:\minjeong-brain\01-수신함\README.md"` through `08-보관소` all return `True`.
- Each README contains exactly these headings in this order: `## 목적`, `## 용도`, `## 사용법`.
- Each README contains at least 3 concrete examples under `용도`.
- Each README is written in Korean and includes first-person application language such as `나는`, `내`, or `나의`.
- Existing `.obsidian/`, `.sisyphus/`, `Excalidraw/`, and `환영합니다!.md` remain present and unmodified unless pre-existing metadata changes are outside the executor's actions.

### Must Have
- Folder names must be exactly the 8 names listed above.
- README files must be named exactly `README.md`.
- README content must be Markdown in Korean.
- Each README must explain how the folder applies to a Korean university student/job seeker.
- `01-수신함` must be treated as temporary capture, not permanent storage.
- `08-보관소` must explain inactive/finished material from any other folder.

### Must NOT Have
- Do not rename, move, or delete `.obsidian/`, `.sisyphus/`, `Excalidraw/`, or `환영합니다!.md`.
- Do not create root-level `README.md`; the user asked for README files inside each folder.
- Do not add Obsidian plugin configuration, templates, Dataview, daily notes automation, or Canvas setup.
- Do not create deep subfolder trees unless needed by the OS to create the requested README path.
- Do not use English folder names or mixed English/Korean top-level names.
- Do not repurpose `Excalidraw/`; it is already owned by the Excalidraw plugin.

## Verification Strategy
> ZERO HUMAN INTERVENTION - all verification is agent-executed.
- Test decision: none; filesystem/content verification only.
- QA policy: Every task has agent-executed scenarios.
- Evidence: `.sisyphus/evidence/task-{N}-{slug}.txt`

## Execution Strategy
### Parallel Execution Waves
> Target: 5-8 tasks per wave. <3 per wave (except final) = under-splitting.
> Extract shared dependencies as Wave-1 tasks for max parallelism.

Wave 1: Task 1 creates the capture/inbox folder and establishes README style.
Wave 2: Tasks 2-8 create the remaining independent top-level folders and README files in parallel.
Final Verification Wave: F1-F4 run in parallel after all tasks complete.

### Dependency Matrix (full, all tasks)
- Task 1: no dependencies; blocks no task but establishes content style.
- Tasks 2-8: no filesystem dependency on each other; can run after Task 1 style is visible.
- F1-F4: blocked by Tasks 1-8.

### Agent Dispatch Summary (wave → task count → categories)
- Wave 1 → 1 task → `writing`
- Wave 2 → 7 tasks → `writing`
- Final Verification → 4 tasks → `oracle`, `unspecified-high`, `unspecified-high`, `deep`

## TODOs
> Implementation + Test = ONE task. Never separate.
> EVERY task MUST have: Agent Profile + Parallelization + QA Scenarios.

- [x] 1. Create `01-수신함` README

  **What to do**: Create folder `C:\minjeong-brain\01-수신함` and file `README.md` with exactly this content:

  ```markdown
  # 01-수신함

  ## 목적
  수신함은 아직 분류하지 않은 생각, 자료, 할 일, 링크를 빠르게 임시 저장하기 위한 공간이다. 나는 강의 중 떠오른 과제 아이디어, 채용 공고 링크, 교수님이 언급한 참고자료처럼 당장 정리할 시간이 없는 정보를 먼저 이곳에 넣고, 나중에 프로젝트·영역·취업준비·학습자료·자료실·보관소 중 맞는 위치로 옮긴다.

  ## 용도
  - 수업 중 급하게 적은 과제 아이디어나 팀플 논의 메모
  - 지하철에서 발견한 인턴 공고, 대외활동 링크, 기업 채용 페이지
  - 갑자기 떠오른 자기소개서 문장, 면접 답변 소재, 포트폴리오 개선 아이디어
  - 아직 어느 폴더에 넣을지 애매한 논문, 블로그 글, 유튜브 강의 링크

  ## 사용법
  나는 새 정보가 들어오면 완벽하게 정리하려고 멈추지 않고 먼저 수신함에 넣는다. 하루 끝이나 주 2회 정리 시간에 수신함을 열어 실행이 필요한 것은 `02-프로젝트`나 `04-취업준비`로, 꾸준히 관리할 책임은 `03-영역`으로, 공부 자료는 `05-학습자료`로, 오래 참고할 자료는 `06-자료실`로 옮긴다. 더 이상 필요 없거나 끝난 것은 `08-보관소`로 보내고, 수신함은 항상 가볍게 유지한다.
  ```

  **Must NOT do**: Do not leave unrelated permanent notes in this folder. Do not move existing root files into it.

  **Recommended Agent Profile**:
  - Category: `writing` - Reason: Korean README prose quality matters more than code changes.
  - Skills: `[]` - No additional skill needed.
  - Omitted: [`frontend-ui-ux`, `git-master`] - No UI or git operation needed.

  **Parallelization**: Can Parallel: NO | Wave 1 | Blocks: style reference for Tasks 2-8 | Blocked By: none

  **References**:
  - Pattern: `C:\minjeong-brain\.sisyphus\drafts\korean-para-vault.md` - confirmed requirements and decisions.
  - Existing vault: `C:\minjeong-brain\.obsidian\` - confirms Obsidian Vault exists.
  - Guardrail: `C:\minjeong-brain\Excalidraw\` - existing plugin folder to preserve.

  **Acceptance Criteria**:
  - [ ] `Test-Path -LiteralPath "C:\minjeong-brain\01-수신함\README.md"` returns `True`.
  - [ ] README includes `## 목적`, `## 용도`, `## 사용법` in that order.
  - [ ] README includes at least four bullet examples under `용도`.
  - [ ] README states that 수신함 is temporary and should be triaged.

  **QA Scenarios**:
  ```
  Scenario: Happy path
    Tool: Bash
    Steps: Run PowerShell checks for path existence and headings in C:\minjeong-brain\01-수신함\README.md.
    Expected: File exists and headings are found in order.
    Evidence: .sisyphus/evidence/task-1-inbox.txt

  Scenario: Failure/edge case
    Tool: Bash
    Steps: Check that C:\minjeong-brain\환영합니다!.md still exists and was not moved into 01-수신함.
    Expected: Root welcome file remains at C:\minjeong-brain\환영합니다!.md.
    Evidence: .sisyphus/evidence/task-1-inbox-error.txt
  ```

  **Commit**: NO | Message: `n/a` | Files: [`01-수신함/README.md`]

- [x] 2. Create `02-프로젝트` README

  **What to do**: Create folder `C:\minjeong-brain\02-프로젝트` and file `README.md` with exactly this content:

  ```markdown
  # 02-프로젝트

  ## 목적
  프로젝트는 마감일과 완료 기준이 분명한 일을 관리하는 공간이다. 나는 이번 학기 팀플, 공모전 제출, 포트폴리오 웹사이트 개선, 특정 회사 지원처럼 “끝나는 순간”이 있는 일을 이곳에 모아 진행 상황과 산출물을 한눈에 본다.

  ## 용도
  - `데이터분석 팀플 최종발표 준비`처럼 제출일이 있는 과제나 팀 프로젝트
  - `네이버 인턴 지원 완료`처럼 특정 회사 지원을 끝내기 위한 작업 묶음
  - `포트폴리오 PDF 2차 개편`처럼 결과물이 명확한 개인 프로젝트
  - `SQL 자격증 원서접수부터 시험일까지`처럼 일정이 정해진 준비 작업

  ## 사용법
  나는 새 프로젝트를 시작할 때 목표, 마감일, 다음 행동, 참고 링크를 한 노트에 적고 관련 자료를 이 폴더에 모은다. 매주 확인하면서 끝난 프로젝트는 결과와 배운 점을 짧게 정리한 뒤 `08-보관소`로 옮기고, 반복적으로 관리해야 하는 책임이나 습관은 `03-영역`에 남긴다.
  ```

  **Must NOT do**: Do not put long-term responsibilities here unless they have a clear end date.

  **Recommended Agent Profile**:
  - Category: `writing` - Reason: Needs Korean explanatory README.
  - Skills: `[]` - No additional skill needed.
  - Omitted: [`git-master`] - No git operation needed.

  **Parallelization**: Can Parallel: YES | Wave 2 | Blocks: none | Blocked By: Task 1 style reference

  **References**:
  - PARA concept: Projects are short-term outcomes with deadlines.
  - Pattern: `01-수신함/README.md` after Task 1 - heading and tone pattern.

  **Acceptance Criteria**:
  - [ ] `Test-Path -LiteralPath "C:\minjeong-brain\02-프로젝트\README.md"` returns `True`.
  - [ ] README includes at least four examples with deadlines or completion criteria.
  - [ ] README explains moving completed projects to `08-보관소`.

  **QA Scenarios**:
  ```
  Scenario: Happy path
    Tool: Bash
    Steps: Verify file exists and contains `팀플`, `인턴 지원`, `포트폴리오`, and `08-보관소`.
    Expected: All required Korean examples and archive workflow are present.
    Evidence: .sisyphus/evidence/task-2-projects.txt

  Scenario: Failure/edge case
    Tool: Bash
    Steps: Check that the README does not describe projects as permanent responsibilities.
    Expected: Content emphasizes 마감일, 완료 기준, and 끝나는 일.
    Evidence: .sisyphus/evidence/task-2-projects-error.txt
  ```

  **Commit**: NO | Message: `n/a` | Files: [`02-프로젝트/README.md`]

- [x] 3. Create `03-영역` README

  **What to do**: Create folder `C:\minjeong-brain\03-영역` and file `README.md` with exactly this content:

  ```markdown
  # 03-영역

  ## 목적
  영역은 끝나는 프로젝트가 아니라 꾸준히 유지해야 하는 책임과 기준을 관리하는 공간이다. 나는 학점 관리, 건강, 돈 관리, 인간관계, 취업 준비 습관처럼 계속 신경 써야 하는 삶의 운영 항목을 이곳에 두고 장기적으로 점검한다.

  ## 용도
  - 학점 관리 기준, 졸업 요건, 전공 필수 이수 현황
  - 운동 루틴, 수면 기록, 번아웃 방지 원칙 같은 건강 관리
  - 생활비 예산, 장학금 조건, 아르바이트 일정 같은 재정 관리
  - 취업 루틴, 네트워킹 기록, 멘토링 약속처럼 꾸준히 유지할 습관

  ## 사용법
  나는 영역 노트마다 “유지하고 싶은 기준”과 “점검 주기”를 적는다. 예를 들어 학점 관리는 매주 과제와 시험 일정을 확인하고, 건강 관리는 수면과 운동이 무너지지 않았는지 본다. 특정 마감이 생기면 그 일은 `02-프로젝트`로 분리하고, 참고 자료는 `06-자료실`에 연결한다.
  ```

  **Must NOT do**: Do not convert this into a deep school-subject folder tree.

  **Recommended Agent Profile**:
  - Category: `writing` - Reason: Needs precise distinction between Areas and Projects.
  - Skills: `[]` - No additional skill needed.
  - Omitted: [`frontend-ui-ux`] - No UI work.

  **Parallelization**: Can Parallel: YES | Wave 2 | Blocks: none | Blocked By: Task 1 style reference

  **References**:
  - PARA concept: Areas are ongoing responsibilities.
  - Guardrail: avoid rigid subject taxonomy; use links/tags inside notes.

  **Acceptance Criteria**:
  - [ ] `Test-Path -LiteralPath "C:\minjeong-brain\03-영역\README.md"` returns `True`.
  - [ ] README distinguishes ongoing responsibilities from deadline-based projects.
  - [ ] README includes examples for 학점, 건강, 재정, and 취업 루틴.

  **QA Scenarios**:
  ```
  Scenario: Happy path
    Tool: Bash
    Steps: Verify README includes `학점`, `건강`, `생활비`, and `취업 루틴`.
    Expected: All four ongoing responsibility examples are present.
    Evidence: .sisyphus/evidence/task-3-areas.txt

  Scenario: Failure/edge case
    Tool: Bash
    Steps: Confirm no extra top-level subject folders like `전공`, `교양`, or `자격증` were created by this task.
    Expected: Only `03-영역` is created for this task.
    Evidence: .sisyphus/evidence/task-3-areas-error.txt
  ```

  **Commit**: NO | Message: `n/a` | Files: [`03-영역/README.md`]

- [x] 4. Create `04-취업준비` README

  **What to do**: Create folder `C:\minjeong-brain\04-취업준비` and file `README.md` with exactly this content:

  ```markdown
  # 04-취업준비

  ## 목적
  취업준비는 공고 탐색부터 지원서, 면접, 포트폴리오, 기업 분석까지 취업과 직접 연결되는 자료를 집중 관리하는 공간이다. 나는 한국 채용 시즌처럼 일정이 빠르게 변하는 환경에서 회사별 지원 현황과 자기소개서 소재를 흩어지지 않게 모으기 위해 이 폴더를 사용한다.

  ## 용도
  - 회사별 채용 공고, 지원 마감일, 전형 단계 기록
  - 자기소개서 문항별 초안, STAR 경험 정리, 첨삭 메모
  - 면접 예상 질문, 직무/산업 분석, 면접 후 복기
  - 포트폴리오 링크, 이력서 버전, 경력기술서 초안

  ## 사용법
  나는 관심 공고를 발견하면 먼저 회사명과 마감일을 적은 지원 노트를 만들고, 공고 링크와 필요한 서류를 붙인다. 자기소개서 문항은 경험 소재와 연결하고, 면접이 끝난 뒤에는 질문과 답변을 복기해 다음 지원에 재사용한다. 회사별 지원이 끝나면 결과와 배운 점을 남긴 뒤 필요에 따라 `08-보관소`로 옮긴다.
  ```

  **Must NOT do**: Do not bury 취업준비 inside `02-프로젝트`; user selected independent top-level folder.

  **Recommended Agent Profile**:
  - Category: `writing` - Reason: Korean job-seeker examples must be concrete.
  - Skills: `[]` - No additional skill needed.
  - Omitted: [`git-master`] - No git operation needed.

  **Parallelization**: Can Parallel: YES | Wave 2 | Blocks: none | Blocked By: Task 1 style reference

  **References**:
  - User decision: 취업준비 is independent top-level folder.
  - Pattern: README structure from Task 1.

  **Acceptance Criteria**:
  - [ ] `Test-Path -LiteralPath "C:\minjeong-brain\04-취업준비\README.md"` returns `True`.
  - [ ] README includes examples for 공고, 자기소개서, 면접, 포트폴리오.
  - [ ] README uses first-person job-seeker workflow.

  **QA Scenarios**:
  ```
  Scenario: Happy path
    Tool: Bash
    Steps: Verify README includes `채용 공고`, `자기소개서`, `면접`, and `포트폴리오`.
    Expected: All four job-prep categories are present.
    Evidence: .sisyphus/evidence/task-4-jobprep.txt

  Scenario: Failure/edge case
    Tool: Bash
    Steps: Verify there is no nested path `02-프로젝트\취업준비` created by this task.
    Expected: `04-취업준비` exists as top-level folder only.
    Evidence: .sisyphus/evidence/task-4-jobprep-error.txt
  ```

  **Commit**: NO | Message: `n/a` | Files: [`04-취업준비/README.md`]

- [x] 5. Create `05-학습자료` README

  **What to do**: Create folder `C:\minjeong-brain\05-학습자료` and file `README.md` with exactly this content:

  ```markdown
  # 05-학습자료

  ## 목적
  학습자료는 강의, 시험, 자격증, 스터디처럼 내가 실제로 공부하고 있는 자료를 관리하는 공간이다. 나는 전공 수업 필기, 시험 대비 요약, 코딩테스트 문제 풀이처럼 학습 진행과 성과에 직접 연결되는 내용을 이곳에 모은다.

  ## 용도
  - 전공·교양 강의 필기, 과제 참고 메모, 시험 범위 정리
  - 정보처리기사, SQLD, 한국사 같은 자격증 공부 노트
  - 코딩테스트 문제 풀이, 알고리즘 개념 정리, 오답 노트
  - 스터디 발표 자료, 질문 목록, 복습 체크리스트

  ## 사용법
  나는 공부할 때 과목명이나 시험명을 기준으로 노트를 만들고, 이해한 내용을 내 말로 요약한다. 시험이나 자격증처럼 마감이 있으면 관련 실행 계획은 `02-프로젝트`에 두고, 오래 참고할 개념이나 도구 설명은 정리 후 `06-자료실`로 옮기거나 연결한다.
  ```

  **Must NOT do**: Do not duplicate `06-자료실`; this folder is for active learning, not general reference.

  **Recommended Agent Profile**:
  - Category: `writing` - Reason: Needs clear Korean student study examples.
  - Skills: `[]` - No additional skill needed.
  - Omitted: [`frontend-ui-ux`] - No UI work.

  **Parallelization**: Can Parallel: YES | Wave 2 | Blocks: none | Blocked By: Task 1 style reference

  **References**:
  - Metis guardrail: distinguish active learning from reference library.
  - PARA adaptation: active learning can be Korean-student extension while linked to Projects/Resources.

  **Acceptance Criteria**:
  - [ ] `Test-Path -LiteralPath "C:\minjeong-brain\05-학습자료\README.md"` returns `True`.
  - [ ] README includes 강의, 자격증, 코딩테스트, 스터디 examples.
  - [ ] README explains when to link/move material to `02-프로젝트` and `06-자료실`.

  **QA Scenarios**:
  ```
  Scenario: Happy path
    Tool: Bash
    Steps: Verify README includes `강의 필기`, `자격증`, `코딩테스트`, and `스터디`.
    Expected: Active learning examples are present.
    Evidence: .sisyphus/evidence/task-5-learning.txt

  Scenario: Failure/edge case
    Tool: Bash
    Steps: Confirm README does not describe this folder as a permanent archive for all references.
    Expected: README frames it as active study material and routes long-term references to `06-자료실`.
    Evidence: .sisyphus/evidence/task-5-learning-error.txt
  ```

  **Commit**: NO | Message: `n/a` | Files: [`05-학습자료/README.md`]

- [x] 6. Create `06-자료실` README

  **What to do**: Create folder `C:\minjeong-brain\06-자료실` and file `README.md` with exactly this content:

  ```markdown
  # 06-자료실

  ## 목적
  자료실은 당장 실행할 프로젝트는 아니지만 계속 참고할 가치가 있는 지식, 링크, 예시, 도구 설명을 보관하는 공간이다. 나는 산업 분석, 직무 정보, 글쓰기 참고자료, 생산성 도구 사용법처럼 여러 프로젝트와 취업 준비에서 반복적으로 꺼내 볼 자료를 이곳에 둔다.

  ## 용도
  - IT 산업 동향, 직무별 역량 정리, 기업 분석 참고자료
  - 자기소개서 문장 예시, 면접 답변 구조, 포트폴리오 레퍼런스
  - Obsidian 사용법, Git/GitHub 명령어, 엑셀·노션·Figma 팁
  - 좋은 글, 논문, 강연, 블로그 링크와 나의 요약 메모

  ## 사용법
  나는 자료를 단순히 저장만 하지 않고 “나중에 어디에 쓸 수 있는지”를 한 줄로 적는다. 예를 들어 산업 분석 글은 `04-취업준비`의 회사 분석 노트와 연결하고, Git 명령어 정리는 포트폴리오 프로젝트를 진행할 때 다시 연결한다. 더 이상 유효하지 않은 자료는 주기적으로 `08-보관소`로 옮긴다.
  ```

  **Must NOT do**: Do not put active course notes here; active study belongs in `05-학습자료`.

  **Recommended Agent Profile**:
  - Category: `writing` - Reason: Needs precise Resources-style description.
  - Skills: `[]` - No additional skill needed.
  - Omitted: [`git-master`] - No git operation needed.

  **Parallelization**: Can Parallel: YES | Wave 2 | Blocks: none | Blocked By: Task 1 style reference

  **References**:
  - PARA concept: Resources are reference/interests not tied to immediate completion.
  - Metis guardrail: separate `05-학습자료` and `06-자료실`.

  **Acceptance Criteria**:
  - [ ] `Test-Path -LiteralPath "C:\minjeong-brain\06-자료실\README.md"` returns `True`.
  - [ ] README includes examples for industry/job info, writing/interview references, tools, and articles.
  - [ ] README includes linking workflow to `04-취업준비`.

  **QA Scenarios**:
  ```
  Scenario: Happy path
    Tool: Bash
    Steps: Verify README includes `산업 동향`, `면접 답변`, `Git/GitHub`, and `블로그 링크`.
    Expected: Long-term reference examples are present.
    Evidence: .sisyphus/evidence/task-6-resources.txt

  Scenario: Failure/edge case
    Tool: Bash
    Steps: Confirm README routes active course notes to `05-학습자료` rather than storing them here.
    Expected: Distinction between active learning and reference storage is explicit.
    Evidence: .sisyphus/evidence/task-6-resources-error.txt
  ```

  **Commit**: NO | Message: `n/a` | Files: [`06-자료실/README.md`]

- [x] 7. Create `07-회고와성장` README

  **What to do**: Create folder `C:\minjeong-brain\07-회고와성장` and file `README.md` with exactly this content:

  ```markdown
  # 07-회고와성장

  ## 목적
  회고와성장은 공부, 프로젝트, 취업 준비를 하며 얻은 경험과 감정을 돌아보고 다음 행동으로 연결하기 위한 공간이다. 나는 단순한 일기장이 아니라 실패 원인, 잘한 점, 개선할 습관을 기록해 다음 학기와 다음 지원에서 같은 실수를 줄이기 위해 이 폴더를 사용한다.

  ## 용도
  - 시험 후 회고, 과제 제출 후 느낀 점, 팀플 협업 복기
  - 면접 후 질문 복기, 자기소개서 탈락 원인 추정, 지원 결과 회고
  - 월간 목표 점검, 학기 말 회고, 방학 계획 리뷰
  - 자신감이 떨어졌을 때 다시 볼 성취 기록과 배운 점 목록

  ## 사용법
  나는 큰 일정이 끝날 때마다 “무슨 일이 있었나, 왜 그렇게 됐나, 다음에는 무엇을 바꿀까” 순서로 짧게 회고한다. 면접에서 막힌 질문은 `04-취업준비`의 면접 노트와 연결하고, 공부 방식 개선은 `03-영역`의 학습 습관 기준에 반영한다. 시간이 지난 회고도 성장 흐름을 보기 위해 남겨 두되, 더 이상 자주 보지 않는 묶음은 `08-보관소`로 옮긴다.
  ```

  **Must NOT do**: Do not create daily journal automation; this task is README/folder setup only.

  **Recommended Agent Profile**:
  - Category: `writing` - Reason: Reflective Korean prose with practical workflow.
  - Skills: `[]` - No additional skill needed.
  - Omitted: [`frontend-ui-ux`] - No UI work.

  **Parallelization**: Can Parallel: YES | Wave 2 | Blocks: none | Blocked By: Task 1 style reference

  **References**:
  - Korean-user extension: reflection/growth folder supports student/job-seeker feedback loops.
  - Guardrail: no plugin automation or daily note setup.

  **Acceptance Criteria**:
  - [ ] `Test-Path -LiteralPath "C:\minjeong-brain\07-회고와성장\README.md"` returns `True`.
  - [ ] README includes 회고 examples for 시험, 팀플, 면접, 월간/학기 목표.
  - [ ] README connects reflections back to `03-영역` and `04-취업준비`.

  **QA Scenarios**:
  ```
  Scenario: Happy path
    Tool: Bash
    Steps: Verify README includes `시험 후 회고`, `팀플`, `면접 후`, and `학기 말 회고`.
    Expected: Reflection examples cover study, collaboration, and job seeking.
    Evidence: .sisyphus/evidence/task-7-reflection.txt

  Scenario: Failure/edge case
    Tool: Bash
    Steps: Check that no Obsidian Daily Notes or plugin configuration files were modified for this task.
    Expected: `.obsidian` plugin configuration is not intentionally changed.
    Evidence: .sisyphus/evidence/task-7-reflection-error.txt
  ```

  **Commit**: NO | Message: `n/a` | Files: [`07-회고와성장/README.md`]

- [x] 8. Create `08-보관소` README

  **What to do**: Create folder `C:\minjeong-brain\08-보관소` and file `README.md` with exactly this content:

  ```markdown
  # 08-보관소

  ## 목적
  보관소는 완료되었거나 더 이상 자주 사용하지 않지만 기록으로 남길 가치가 있는 자료를 옮겨 두는 공간이다. 나는 끝난 과제, 마감 지난 공고, 완료한 프로젝트, 오래된 공부 자료를 이곳에 보관해 현재 집중해야 할 폴더들이 복잡해지지 않게 한다.

  ## 용도
  - 제출이 끝난 과제, 종료된 팀플, 발표가 끝난 공모전 자료
  - 마감이 지난 채용 공고, 불합격한 지원 기록, 오래된 자기소개서 버전
  - 더 이상 공부하지 않는 자격증 자료나 지난 학기 시험 대비 노트
  - 예전 목표, 완료한 회고 묶음, 참고 가치가 낮아진 링크 모음

  ## 사용법
  나는 매주 또는 매달 한 번 현재 폴더들을 훑어보고 더 이상 실행하지 않는 자료를 보관소로 옮긴다. 옮길 때는 삭제하지 않고 결과, 날짜, 배운 점을 한 줄로 남겨 나중에 포트폴리오나 면접 경험 정리에 활용할 수 있게 한다. 다시 필요해진 자료는 새 프로젝트나 취업준비 노트에 연결하거나 복사해서 사용한다.
  ```

  **Must NOT do**: Do not delete inactive material; archive means preserve, not remove.

  **Recommended Agent Profile**:
  - Category: `writing` - Reason: Needs clear archival workflow in Korean.
  - Skills: `[]` - No additional skill needed.
  - Omitted: [`git-master`] - No git operation needed.

  **Parallelization**: Can Parallel: YES | Wave 2 | Blocks: none | Blocked By: Task 1 style reference

  **References**:
  - PARA concept: Archives contain inactive items from Projects, Areas, and Resources.
  - Pattern: README structure from Task 1.

  **Acceptance Criteria**:
  - [ ] `Test-Path -LiteralPath "C:\minjeong-brain\08-보관소\README.md"` returns `True`.
  - [ ] README includes archive examples from projects, job applications, learning, and reflections.
  - [ ] README says archiving preserves material rather than deleting it.

  **QA Scenarios**:
  ```
  Scenario: Happy path
    Tool: Bash
    Steps: Verify README includes `완료`, `마감이 지난 채용 공고`, `지난 학기`, and `삭제하지 않고`.
    Expected: Archive purpose and preserve-not-delete policy are present.
    Evidence: .sisyphus/evidence/task-8-archive.txt

  Scenario: Failure/edge case
    Tool: Bash
    Steps: Confirm no existing file such as `환영합니다!.md` was deleted while creating the archive folder.
    Expected: Existing root welcome note still exists.
    Evidence: .sisyphus/evidence/task-8-archive-error.txt
  ```

  **Commit**: NO | Message: `n/a` | Files: [`08-보관소/README.md`]

## Final Verification Wave (MANDATORY — after ALL implementation tasks)
> 4 review agents run in PARALLEL. ALL must APPROVE. Present consolidated results to user and get explicit "okay" before completing.
> **Do NOT auto-proceed after verification. Wait for user's explicit approval before marking work complete.**
> **Never mark F1-F4 as checked before getting user's okay.** Rejection or user feedback -> fix -> re-run -> present again -> wait for okay.
- [x] F1. Plan Compliance Audit — oracle
- [x] F2. Code Quality Review — unspecified-high
- [x] F3. Real Manual QA — unspecified-high
- [x] F4. Scope Fidelity Check — deep

## Commit Strategy
- This workspace is not currently a git repository. Do not run git commit.
- If a future executor finds the workspace has become a git repo, ask before committing because the user did not request a commit.

## Success Criteria
- Exactly eight new numbered Korean top-level PARA folders exist: `01-수신함`, `02-프로젝트`, `03-영역`, `04-취업준비`, `05-학습자료`, `06-자료실`, `07-회고와성장`, `08-보관소`.
- Each new folder contains a `README.md` with Korean Markdown sections `목적`, `용도`, `사용법`.
- README content is concrete for a Korean university student/job seeker and includes first-person application workflows.
- Existing Obsidian/system/plugin files remain in place, especially `.obsidian/`, `.sisyphus/`, `Excalidraw/`, and `환영합니다!.md`.
