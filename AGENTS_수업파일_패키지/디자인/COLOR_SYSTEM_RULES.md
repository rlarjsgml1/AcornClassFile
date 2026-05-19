# Color System Rules

화면의 기본 색상, 버튼 색상, 상태 색상, 테마 변형을 정할 때 적용합니다.

## 1. 색상 역할

색상은 이름보다 역할로 관리합니다.

```text
background       화면 배경
surface          카드, 헤더, 패널
surface-strong   강조 패널
text             기본 글자
muted            보조 글자
line             경계선
primary          주요 행동
primary-hover    주요 행동 hover
accent           보조 강조
danger           삭제, 위험
success          성공
warning          주의
```

## 2. 버튼 색상 기준

- 주요 CTA는 화면에서 가장 먼저 보여야 하지만 배경과 충돌하지 않아야 합니다.
- 보조 버튼은 투명, outline, 낮은 채도 배경을 우선합니다.
- 위험 버튼은 삭제, 되돌리기 어려운 작업에만 씁니다.
- hover 색상은 단순히 어둡게 하는 것보다 명도와 그림자를 함께 확인합니다.
- disabled 상태는 클릭 가능해 보이지 않아야 합니다.

## 3. 테마 팔레트 예시

석양과 어두운 헤더에 어울리는 팔레트:

```text
ember
  primary: #ff7a3d
  accent:  #ffd166
  surface: rgba(38, 20, 19, 0.78)

rose
  primary: #ff4f86
  accent:  #ffd1dc
  surface: rgba(45, 18, 36, 0.78)

gold
  primary: #f6b84b
  accent:  #ffe7a3
  surface: rgba(37, 28, 16, 0.78)

teal
  primary: #2dd4bf
  accent:  #b6fff4
  surface: rgba(12, 37, 42, 0.78)

violet
  primary: #a78bfa
  accent:  #eadcff
  surface: rgba(31, 24, 52, 0.78)
```

## 4. 대비 기준

- 본문 텍스트와 배경의 대비는 충분히 확보합니다.
- 작은 글자와 흐린 배경 위의 텍스트는 `muted`를 너무 낮은 불투명도로 두지 않습니다.
- 이미지나 그라디언트 위 텍스트는 overlay 또는 surface를 둡니다.
- 활성 메뉴, CTA, focus ring은 배경과 구분되어야 합니다.

## 5. 구현 기준

- CSS 변수로 색상 역할을 먼저 선언합니다.
- 테마 전환은 `data-theme` 또는 루트 클래스로 관리합니다.
- 같은 색상 값을 여러 곳에 직접 반복하지 않습니다.
- 새 색상을 추가할 때는 hover, active, focus 상태도 함께 정합니다.

## 6. 검증 기준

- 데스크톱과 모바일에서 배경과 버튼이 충돌하지 않는지 확인합니다.
- CTA와 보조 버튼의 우선순위가 분명한지 확인합니다.
- 한 화면이 한 색상 계열로만 읽히지 않는지 확인합니다.
- 색상을 바꿔도 텍스트가 넘치거나 레이아웃이 흔들리지 않는지 확인합니다.
