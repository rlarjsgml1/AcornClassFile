# Header Component Rules

웹 사이트와 웹앱의 헤더, 네비게이션, CTA 영역을 만들거나 수정할 때 적용합니다.

## 1. 기본 역할

- 헤더는 브랜드, 주요 이동 경로, 핵심 행동 버튼을 빠르게 보여줍니다.
- 메뉴 이름은 실제 사용자가 이해하는 업무 단어를 사용합니다.
- 장식보다 이동, 로그인, 문의, 시작하기 같은 행동이 먼저 보여야 합니다.
- 데스크톱, 태블릿, 모바일에서 같은 정보 구조가 유지되어야 합니다.

## 2. 구조 기준

권장 순서:

```text
header 또는 nav
  brand/logo
  primary navigation
  utility 또는 auth actions
  mobile menu button
```

- `nav`에는 `aria-label`을 둡니다.
- 현재 위치는 `aria-current="page"` 또는 active 클래스로 표시합니다.
- 모바일 메뉴 버튼은 `aria-controls`, `aria-expanded`, `aria-label`을 함께 관리합니다.
- 링크와 버튼은 용도를 구분합니다. 페이지 이동은 `a`, 상태 변경은 `button`을 우선합니다.

## 3. 메뉴 텍스트 기준

수업용 임시 텍스트:

```text
Home, About, Services, Portfolio, Contact
```

실무형 텍스트 예시:

```text
Platform, Solutions, Work, Resources, Pricing
```

한국어 실무형 예시:

```text
서비스, 솔루션, 사례, 요금, 문의
```

- `LOGO`, `Button`, `Menu1` 같은 임시 텍스트는 최종 화면에 남기지 않습니다.
- CTA는 `Start project`, `Book a demo`, `Get started`, `문의하기`처럼 행동이 드러나게 씁니다.

## 4. 레이아웃 기준

- 헤더 높이는 데스크톱 64px 이상, 모바일 56px 이상을 우선합니다.
- 터치 영역은 모바일에서 최소 44px를 유지합니다.
- 메뉴가 많으면 모든 항목을 억지로 넣지 말고 우선순위를 정합니다.
- hover, active, focus 상태에서 레이아웃 크기가 흔들리지 않아야 합니다.
- 모바일 메뉴는 화면 밖으로 넘치지 않고 닫기 동작이 명확해야 합니다.

## 5. 상태 기준

필수 상태:

- 기본 상태
- hover 상태
- active 상태
- focus-visible 상태
- 모바일 메뉴 열림 상태
- 줄어든 화면 상태

권장 상태:

- 스크롤 후 헤더 상태
- CTA hover 상태
- theme 또는 color variant 상태

## 6. 애니메이션 기준

- 메뉴 열림, hover, active underline은 150ms에서 260ms 사이를 우선합니다.
- transform과 opacity 중심으로 움직이고, width/height 애니메이션은 필요한 경우에만 씁니다.
- `prefers-reduced-motion: reduce` 사용자를 위해 애니메이션을 줄입니다.
- 움직임은 기능을 이해시키는 용도여야 하며 시선을 빼앗지 않아야 합니다.

## 7. 검증 기준

- 데스크톱과 모바일에서 텍스트가 겹치지 않는지 확인합니다.
- 키보드 Tab 이동과 Escape 닫기를 확인합니다.
- 모바일 메뉴를 열고 링크를 눌렀을 때 메뉴가 닫히는지 확인합니다.
- 색상 대비가 약하지 않은지 확인합니다.
- 임시 텍스트와 임시 로그가 남아 있지 않은지 확인합니다.
