# Android Guide

Android Studio, Kotlin, Gradle, Android 앱 작업에 적용합니다.

## 1. 기본 흐름

- 설명은 화면 → 이벤트 → 상태 변경 → UI 반영 흐름으로 정리합니다.
- 네트워크 작업은 요청 → 서버 → 응답 → 파싱 → 화면 반영 흐름으로 설명합니다.
- 프로젝트가 XML View 기반인지 Jetpack Compose 기반인지 먼저 확인합니다.
- Activity, Fragment, ViewModel, Repository 구조가 있으면 기존 흐름을 우선 따릅니다.

## 2. Kotlin 원칙

- null 가능성은 안전하게 처리합니다.
- 불필요한 `!!` 사용을 피합니다.
- 코루틴, Flow, LiveData 사용 여부는 기존 프로젝트 기준을 따릅니다.
- data class, sealed class, extension function은 실제로 단순해질 때만 사용합니다.
- API URL, 토큰, 키, 서버 주소는 코드에 직접 넣지 않습니다.

## 3. Android Studio / Gradle

- Gradle 버전, Android Gradle Plugin 버전, Kotlin 버전은 확인 전까지 단정하지 않습니다.
- dependency 추가, 버전 변경은 사용자 승인 후 진행합니다.
- 빌드 오류는 에러 메시지, 모듈명, Gradle task, dependency 충돌 여부를 기준으로 분석합니다.
- 권한이 필요한 기능은 AndroidManifest, 런타임 권한, 사용자 경험을 함께 확인합니다.

## 4. 검증 기준

- Gradle sync 성공 여부를 확인합니다.
- 빌드 성공 여부를 확인합니다.
- 에뮬레이터나 실제 기기 실행 여부를 확인합니다.
- Logcat 오류 여부를 확인합니다.
- 검증하지 못한 항목은 미확인으로 보고합니다.
