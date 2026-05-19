# CSS Foundation Rules

프론트엔드 화면에서 폰트, 박스 모델, 크기, 여백을 정할 때 사용하는 실무형 기준입니다.

## 1. 기본 CSS 리셋

새 화면을 만들 때 별도 리셋 파일이 없으면 아래 기준을 우선합니다.

```css
*,
*::before,
*::after {
  box-sizing: border-box;
}

html {
  font-size: 16px;
  -webkit-text-size-adjust: 100%;
}

body {
  margin: 0;
  min-width: 320px;
  font-family: var(--font-sans);
  color: var(--color-text, #111827);
  background: var(--color-bg, #ffffff);
}

img,
picture,
video,
canvas,
svg {
  display: block;
  max-width: 100%;
}

button,
input,
textarea,
select {
  font: inherit;
}
```

## 2. 폰트 스택

프로젝트에 이미 폰트가 정해져 있으면 기존 폰트를 우선합니다.
새로 정해야 한다면 한국어 화면은 아래 순서로 둡니다.

```css
:root {
  --font-sans: "Pretendard", "Noto Sans KR", "SUIT", "Apple SD Gothic Neo",
    "Malgun Gothic", system-ui, -apple-system, BlinkMacSystemFont, "Segoe UI",
    sans-serif;

  --font-en: "Inter", "Roboto", system-ui, -apple-system, BlinkMacSystemFont,
    "Segoe UI", sans-serif;

  --font-mono: "JetBrains Mono", "D2Coding", "Consolas", "Menlo",
    "Monaco", monospace;

  --font-serif: "Noto Serif KR", "Georgia", "Times New Roman", serif;
}
```

## 3. 폰트 선택 기준

- 한국어 일반 UI: Pretendard, Noto Sans KR, SUIT
- Windows 기본 호환: Malgun Gothic
- macOS 기본 호환: Apple SD Gothic Neo
- 영문 UI: Inter, Roboto, system-ui
- 코드 표시: JetBrains Mono, D2Coding, Consolas
- 긴 글, 문서형 페이지: Noto Serif KR은 필요한 경우에만 사용

웹폰트를 추가할 때는 로딩 비용을 확인합니다.
보통 Regular, Medium, Semibold, Bold 정도만 사용합니다.

## 4. 폰트 크기 scale

임의의 `13px`, `17px`, `23px`를 계속 만들지 말고 아래 scale 안에서 선택합니다.

```css
:root {
  --text-xs: 12px;
  --text-sm: 14px;
  --text-base: 16px;
  --text-md: 18px;
  --text-lg: 20px;
  --text-xl: 24px;
  --text-2xl: 28px;
  --text-3xl: 32px;
  --text-4xl: 40px;
  --text-5xl: 48px;
}
```

## 5. 폰트 사용 기준

- 본문: `16px`, line-height `1.6`
- 보조 설명: `14px`, line-height `1.5`
- 작은 라벨: `12px`, line-height `1.4`
- 카드 제목: `18px` 또는 `20px`
- 섹션 제목: `24px` 또는 `28px`
- 페이지 제목: `32px` 이상은 진짜 페이지 제목에만 사용
- 버튼: `14px` 또는 `16px`
- letter-spacing은 기본 `0`을 우선하고, 음수 자간은 사용하지 않습니다.

## 6. 굵기 기준

```css
:root {
  --font-regular: 400;
  --font-medium: 500;
  --font-semibold: 600;
  --font-bold: 700;
}
```

- 일반 본문: 400
- 버튼, 탭, 라벨: 500 또는 600
- 카드 제목: 600
- 페이지 제목: 700
- 너무 많은 굵기를 한 화면에 섞지 않습니다.

## 7. 여백 scale

간격은 4px 단위 scale을 사용합니다.

```css
:root {
  --space-1: 4px;
  --space-2: 8px;
  --space-3: 12px;
  --space-4: 16px;
  --space-5: 20px;
  --space-6: 24px;
  --space-8: 32px;
  --space-10: 40px;
  --space-12: 48px;
  --space-16: 64px;
}
```

사용 기준:

- 아이콘과 텍스트 사이: 6px 또는 8px
- 폼 label과 input 사이: 6px 또는 8px
- 같은 그룹 내부 간격: 8px 또는 12px
- 카드 내부 padding: 16px 또는 24px
- 섹션 내부 padding: 32px 이상
- 모바일 좌우 padding: 16px
- 태블릿 좌우 padding: 24px
- 데스크톱 좌우 padding: 32px

## 8. 박스 모델과 크기 기준

모든 컴포넌트는 `border-box` 기준입니다.
고정값만 쓰지 말고 `min-width`, `max-width`, `min-height`, `aspect-ratio`를 함께 고려합니다.

```css
:root {
  --radius-sm: 4px;
  --radius-md: 6px;
  --radius-lg: 8px;

  --control-sm: 32px;
  --control-md: 40px;
  --control-lg: 48px;

  --container-sm: 720px;
  --container-md: 960px;
  --container-lg: 1200px;
  --container-xl: 1280px;
}
```

## 9. 컨테이너 기준

```css
.container {
  width: min(100% - 32px, 1200px);
  margin-inline: auto;
}
```

- 일반 웹 페이지 최대 폭: 1200px
- 대시보드, 관리 화면 최대 폭: 1280px 또는 1440px
- 읽기 중심 문서 최대 폭: 720px 또는 800px
- 모바일에서는 좌우 16px 이상 여백을 유지합니다.

## 10. 컴포넌트 크기 기준

- 기본 버튼 높이: 40px
- 큰 버튼 높이: 48px
- 작은 버튼 높이: 32px
- 모바일 터치 영역: 최소 44px
- input/select 높이: 40px 또는 44px
- textarea 최소 높이: 96px
- icon button: 36px 또는 40px
- 카드 border-radius: 보통 8px 이하
- 모달 width: 480px, 560px, 720px 중 선택
- 사이드바 width: 240px 또는 280px
- 테이블 row height: 44px 이상

## 11. 반응형 기준

breakpoint는 프로젝트 기준이 있으면 기존 값을 따릅니다.
없으면 아래 값을 사용합니다.

```css
:root {
  --bp-sm: 480px;
  --bp-md: 768px;
  --bp-lg: 1024px;
  --bp-xl: 1280px;
}
```

- 480px 이하: 모바일 단일 컬럼
- 768px 이상: 태블릿 레이아웃
- 1024px 이상: 데스크톱 레이아웃
- 1280px 이상: 넓은 데스크톱

## 12. 레이아웃 안정성

- 버튼, 카드, 탭, 입력창은 hover나 글자 변경으로 크기가 흔들리지 않게 합니다.
- 이미지, 카드 썸네일, 영상은 `aspect-ratio`를 지정합니다.
- 긴 텍스트는 `overflow-wrap: anywhere` 또는 적절한 줄바꿈을 적용합니다.
- 한 줄 고정이 필요한 텍스트는 `white-space`, `overflow`, `text-overflow`를 함께 씁니다.
- 화면이 작아질 때 텍스트가 다른 UI를 덮지 않는지 확인합니다.

