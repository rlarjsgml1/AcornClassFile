# Android Kotlin Guide

Android Studio, Kotlin, Gradle 작업 기준입니다.

## 확인 순서

- 프로젝트 루트와 `settings.gradle`을 확인합니다.
- `app/build.gradle` 또는 `build.gradle.kts`를 확인합니다.
- 패키지명, Activity, layout, manifest 연결을 확인합니다.
- Gradle Sync 오류와 Logcat 오류를 구분합니다.

## 작업 기준

- 기존 Activity, Fragment, ViewModel 구조를 따릅니다.
- UI는 XML, Compose 중 기존 방식을 따릅니다.
- null 처리와 생명주기 문제를 우선 확인합니다.
- `local.properties`, keystore, API key는 Git에 올리지 않습니다.

## 검증

- Gradle Sync
- Build
- 앱 실행
- Logcat 확인

