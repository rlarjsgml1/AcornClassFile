# Motion Interaction Rules

hover, active, 메뉴 열림, 화면 전환 같은 인터랙션 모션을 넣을 때 적용합니다.

## 1. 기본 원칙

- 모션은 상태 변화를 이해시키는 용도로 사용합니다.
- 너무 많은 요소가 동시에 움직이지 않게 합니다.
- transform, opacity, filter를 우선하고 layout을 흔드는 속성은 최소화합니다.
- 움직임은 빠르고 짧게 끝나야 합니다.

## 2. 시간 기준

```text
micro interaction   120ms - 180ms
button hover        150ms - 220ms
menu open/close     180ms - 260ms
large panel         240ms - 360ms
```

- 일반 hover는 200ms 전후를 우선합니다.
- 모바일 메뉴는 너무 느리면 답답하므로 260ms 안쪽으로 둡니다.
- 반복되는 배경 애니메이션은 10초 이상으로 느리게 둡니다.

## 3. easing 기준

권장 easing:

```css
--ease-standard: cubic-bezier(0.2, 0.8, 0.2, 1);
--ease-out: cubic-bezier(0.16, 1, 0.3, 1);
```

- 진입은 부드럽게, 종료는 빠르게 느껴지도록 합니다.
- spring처럼 과한 반동은 브랜드 성격이 맞을 때만 사용합니다.

## 4. 접근성 기준

`prefers-reduced-motion: reduce`가 있으면 아래처럼 줄입니다.

```css
@media (prefers-reduced-motion: reduce) {
  *,
  *::before,
  *::after {
    animation-duration: 0.01ms !important;
    animation-iteration-count: 1 !important;
    scroll-behavior: auto !important;
    transition-duration: 0.01ms !important;
  }
}
```

## 5. 헤더 모션 기준

- 메뉴 링크 hover는 `translateY`, 색상, underline 정도로 제한합니다.
- CTA hover는 shadow, translate, 배경색 변화를 함께 사용할 수 있습니다.
- 모바일 메뉴는 opacity와 translate를 함께 사용합니다.
- active underline은 현재 위치를 알리는 정도로만 사용합니다.
- 스크롤에 따라 헤더 배경을 강화할 수 있지만 내용이 흔들리면 안 됩니다.

## 6. 검증 기준

- hover 후 요소 크기가 바뀌지 않는지 확인합니다.
- 모바일 메뉴 열림과 닫힘이 같은 규칙으로 움직이는지 확인합니다.
- 키보드 focus-visible 상태가 hover와 충돌하지 않는지 확인합니다.
- 모션을 꺼도 화면을 사용할 수 있는지 확인합니다.
