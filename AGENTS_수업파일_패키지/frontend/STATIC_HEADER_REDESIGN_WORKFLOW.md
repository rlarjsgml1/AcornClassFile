# Static Header Redesign Workflow

정적 HTML/CSS/JavaScript로 만든 헤더와 여러 하위 페이지를 리디자인할 때 적용합니다.
예: `C:\VsHtml\UI파일모음집\Header파일\...`

## 1. 먼저 확인할 문서

작업 시작 전 아래 문서를 순서대로 확인합니다.

```text
AGENTS.md
README_사용방법.md
frontend/FRONTEND_RULES.md
frontend/CSS_FOUNDATION_RULES.md
frontend/HEADER_COMPONENT_RULES.md
디자인/UI_DESIGN_RULES.md
디자인/COLOR_SYSTEM_RULES.md
디자인/MOTION_INTERACTION_RULES.md
디자인/REFERENCE_BRAND_TRANSFORM_RULES.md
규칙/FOLDER_NAMING_RULES.md
```

## 2. 대상 폴더 파악

- 대상 폴더의 파일 목록을 먼저 확인합니다.
- `index.html`, `css/`, `js/`, `html/` 같은 구조인지 확인합니다.
- 하위 HTML이 같은 헤더를 반복해서 가지고 있는지 확인합니다.
- CSS와 JS 경로가 루트 페이지와 하위 페이지에서 상대 경로로 다르게 쓰이는지 확인합니다.

## 3. 기존 콘셉트 제거 범위

콘셉트를 바꾸는 작업이면 아래 항목을 함께 바꿉니다.

- `title`
- `meta description`
- 브랜드명과 `aria-label`
- 헤더 메뉴 텍스트
- CTA 버튼 텍스트
- 메인 히어로 문구
- 카드, 리스트, 폼의 문구
- `body data-page` 같은 페이지 식별 값
- JS에서 사용자에게 보여주는 완료 문구

기존 콘셉트 단어가 남지 않도록 마지막에 `rg`로 검색합니다.

## 4. 헤더 구조 기준

헤더는 아래 구조를 우선합니다.

```text
nav.site-header
  .header-shell
    a.brand
    .nav-panel
      ul.nav-links
      .mobile-actions
    .header-actions
    button.menu-toggle
```

- `nav`에는 `aria-label`을 둡니다.
- 모바일 버튼에는 `aria-controls`, `aria-expanded`, `aria-label`을 둡니다.
- 현재 페이지 링크에는 `aria-current="page"`와 active 클래스를 함께 둡니다.
- 페이지 이동은 `a`, 상태 변경은 `button`을 사용합니다.

## 5. CSS 리디자인 기준

- 색상은 `:root` CSS 변수로 역할별 선언을 먼저 합니다.
- 폰트는 기존 지정이 없으면 `Pretendard`, `Apple SD Gothic Neo`, `Malgun Gothic`, system UI 순서를 우선합니다.
- 버튼, 카드, 입력창, 헤더 높이는 `CSS_FOUNDATION_RULES.md`의 scale을 기준으로 잡습니다.
- hover 때문에 크기나 위치가 흔들리지 않게 합니다.
- 모바일에서 긴 한국어 문장이 버튼, 카드, 화면 밖으로 넘치지 않게 `overflow-wrap`, `word-break`, `max-width`를 확인합니다.
- `prefers-reduced-motion: reduce` 대응을 유지합니다.

## 6. JS 유지 기준

정적 헤더 JS는 아래 기능을 우선 유지합니다.

- 메뉴 열림/닫힘 상태 관리
- `aria-expanded` 동기화
- Escape로 메뉴 닫기
- 헤더 밖 클릭 시 메뉴 닫기
- 링크 클릭 시 모바일 메뉴 닫기
- 폼 submit 시 화면 문구 변경과 reset

콘셉트 문구를 바꾸면 JS의 완료 문구도 함께 바꿉니다.

## 7. 검증 순서

수정 후 아래를 확인합니다.

```text
1. 이전 콘셉트 단어 검색
2. JavaScript 문법 검사
3. 데스크톱 폭 스크린샷 확인
4. 모바일 폭 스크린샷 확인
5. 모바일 메뉴 열림/닫힘 상태 확인
6. 하위 페이지 링크 경로 확인
7. 폴더명이 실제 콘셉트와 맞는지 확인
```

예시 명령:

```powershell
rg -n "이전브랜드|이전메뉴|이전CTA" "대상경로"
node --check "대상경로\js\script.js"
```

## 8. 완료 보고 기준

완료 보고에는 아래를 짧게 포함합니다.

- 바꾼 콘셉트
- 수정한 파일
- 폴더명을 바꿨다면 이전 경로와 새 경로
- 실행한 검증
- 확인하지 못한 항목
