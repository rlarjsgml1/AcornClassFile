# Android Kotlin

Android Studio, Kotlin, Gradle 작업에 적용합니다.

## 확인 순서

- 프로젝트 루트와 `settings.gradle`을 확인합니다.
- `app/build.gradle` 또는 `build.gradle.kts`를 확인합니다.
- 패키지명, Activity, Fragment, layout, manifest 연결을 확인합니다.
- Gradle Sync 오류와 Logcat 오류를 구분합니다.

## 구조 기준

- 기존 Activity, Fragment, ViewModel 구조를 따릅니다.
- UI는 XML, Compose 중 기존 방식을 따릅니다.
- 화면 상태와 비즈니스 로직을 한 Activity에 몰아넣지 않습니다.
- RecyclerView, Adapter, ViewHolder 구조는 기존 패턴을 따릅니다.
- 네트워크, DB, 파일 접근은 UI 코드와 분리합니다.

## Kotlin 기준

- null 가능성은 타입으로 드러냅니다.
- `!!` 사용은 피하고, 필요한 경우 이유를 명확히 합니다.
- data class는 값 전달 목적에 사용합니다.
- sealed class 또는 enum은 상태 표현에 사용합니다.
- coroutine 사용 시 lifecycle scope와 cancellation을 고려합니다.

## Android 기준

- manifest의 permission, activity 등록을 확인합니다.
- 화면 회전과 생명주기 문제를 확인합니다.
- 긴 작업은 main thread에서 실행하지 않습니다.
- 문자열은 필요한 경우 resources로 분리합니다.
- `local.properties`, keystore, API key는 Git에 올리지 않습니다.

## 검증

- Gradle Sync
- Build
- 앱 실행
- Logcat 확인
- 화면 이동과 back 동작 확인
- 권한 요청 흐름 확인

