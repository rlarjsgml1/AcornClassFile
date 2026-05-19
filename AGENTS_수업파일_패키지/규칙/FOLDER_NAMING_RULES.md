# Folder Naming Rules

작업 결과물 폴더명을 정하거나 임시 폴더명을 실제 이름으로 바꿀 때 적용합니다.

## 1. 기본 원칙

- `First`, `second`, `test`, `new`처럼 의미가 약한 이름은 최종 결과물에 남기지 않습니다.
- 폴더명은 안에 들어 있는 실제 콘셉트, 브랜드, 기능을 기준으로 정합니다.
- 참고 브랜드명을 그대로 쓰지 않습니다. 변형한 결과물의 새 이름을 사용합니다.
- 같은 부모 폴더 안의 기존 이름 규칙을 먼저 확인합니다.

## 2. 이름 형식

영문 콘셉트명은 공백 없이 PascalCase를 우선합니다.

```text
FrameSeoul
ProductRankingHeader
BrandDropHeader
```

한국어 폴더명을 이미 쓰는 위치라면 한국어 이름도 사용할 수 있습니다.
다만 특수문자, 지나치게 긴 이름, 날짜만 있는 이름은 피합니다.

## 3. 이름 변경 전 확인

폴더명을 바꾸기 전 아래를 확인합니다.

- 원본 폴더가 존재하는가?
- 새 폴더명이 이미 존재하지 않는가?
- 원본 경로와 새 경로가 같은 부모 폴더 안에 있는가?
- 파일 안에 절대 경로로 기존 폴더명이 박혀 있지 않은가?
- 사용자가 만든 다른 폴더를 덮어쓰지 않는가?

## 4. 안전한 PowerShell 패턴

이름 변경은 같은 부모 폴더 안에서 `Move-Item`을 사용합니다.

```powershell
$parent = (Resolve-Path -LiteralPath "부모폴더").Path
$source = (Resolve-Path -LiteralPath (Join-Path $parent "기존폴더")).Path
$target = Join-Path $parent "새폴더"
$targetFull = [System.IO.Path]::GetFullPath($target)

if (-not $source.StartsWith($parent, [System.StringComparison]::OrdinalIgnoreCase)) {
    throw "Source path is outside parent: $source"
}

if (-not $targetFull.StartsWith($parent, [System.StringComparison]::OrdinalIgnoreCase)) {
    throw "Target path is outside parent: $targetFull"
}

if (Test-Path -LiteralPath $targetFull) {
    throw "Target already exists: $targetFull"
}

Move-Item -LiteralPath $source -Destination $targetFull
```

작업 위치가 현재 쓰기 허용 범위 밖이면 승인을 요청합니다.
승인 없이 복사, 삭제, 우회 이동을 하지 않습니다.

## 5. 이름 변경 후 확인

- 부모 폴더 목록에서 새 이름이 보이는지 확인합니다.
- 새 폴더 안의 파일 목록을 확인합니다.
- 이전 폴더 경로가 더 이상 존재하지 않는지 확인합니다.
- 완료 보고에 이전 경로와 새 경로를 함께 적습니다.

## 6. 예시

```text
변경 전:
C:\VsHtml\UI파일모음집\Header파일\First

변경 후:
C:\VsHtml\UI파일모음집\Header파일\FrameSeoul
```

이 경우 결과물의 실제 브랜드가 `FRAME SEOUL`이므로 `FrameSeoul`이 `First`보다 적절합니다.
