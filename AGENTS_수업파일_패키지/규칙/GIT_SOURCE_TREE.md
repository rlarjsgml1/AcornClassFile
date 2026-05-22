# GitHub / SourceTree 혼자 작업 관리 기준

혼자 사용하는 공부용 GitHub 저장소를 깔끔하게 관리하기 위한 브랜치, 커밋, `.gitignore`, SourceTree 작업 기준입니다.
수업자료, PDF, 실습 코드, 정리 문서, 오류 수정 내용을 브랜치와 커밋 메시지로 구분해서 관리합니다.

## 1. 기본 관리 방향

현재 저장소는 포트폴리오 완성 프로젝트라기보다 공부 기록 저장소에 가깝습니다.

- 공부 자료, PDF, 실습 코드, 수업 정리 자료는 공부용 저장소에 관리합니다.
- 완성 프로젝트는 별도 포트폴리오 저장소로 분리합니다.
- 지금 저장소는 `acorncampus_studyLog` 같은 공부 기록 저장소로 유지해도 괜찮습니다.

추천 저장소 구분:

```text
acorncampus_studyLog     수업자료, PDF, 실습 코드, 공부 기록
servlet-jsp-mvc-board    포트폴리오용 MVC 프로젝트
curapet-backend          포트폴리오용 백엔드 프로젝트
curapet-flutter-app      포트폴리오용 Flutter 프로젝트
```

## 2. 브랜치 이름 규칙

브랜치 이름은 아래 형식을 사용합니다.

```text
종류/작업이름
```

예시:

```text
docs/java-study-materials
archive/java-practice
study/java2-summary
fix/jsp-404-error
chore/gitignore-cleanup
```

### 2-1. 브랜치 앞부분 의미

| 종류 | 사용 상황 | 예시 |
| --- | --- | --- |
| `docs` | 문서, PDF, README, 학습자료 정리 | `docs/java-study-materials`, `docs/spring-study-materials`, `docs/readme-update` |
| `archive` | 예전 실습 코드나 수업 파일 보관 | `archive/java-practice`, `archive/servlet-practice`, `archive/old-class-files` |
| `study` | 특정 과목이나 단원 공부 내용 정리 | `study/java2-summary`, `study/oracle-sql`, `study/servlet-jsp-mvc` |
| `feature` | 실제 기능 추가 | `feature/login`, `feature/user-list`, `feature/product-register` |
| `fix` | 오류 수정 | `fix/jsp-404-error`, `fix/oracle-connection-error`, `fix/tomcat-start-error` |
| `chore` | 설정 파일, `.gitignore`, 폴더 정리 | `chore/gitignore-cleanup`, `chore/remove-eclipse-metadata`, `chore/project-structure-cleanup` |

## 3. 자주 쓰는 추천 브랜치

### 3-1. Java 수업자료 PDF, README, 정리 문서 작업

추천 브랜치:

```text
docs/java-study-materials
```

사용 상황:

- PDF 정리
- 수업자료 요약
- README 수정
- `AGENTS.md` 정리
- 학습자료 제작

커밋 예시:

```text
docs: Java 수업자료 PDF 정리
docs: Java2 핵심정리 문서 추가
docs: 학습자료 제작 규칙 추가
```

### 3-2. Java 실습 코드 보관

추천 브랜치:

```text
archive/java-practice
```

사용 상황:

- Day1 실습 코드 추가
- Day2 실습 코드 추가
- 예전 수업 코드 보관
- 단순 백업성 코드 정리

커밋 예시:

```text
archive: Java Day01 실습 코드 추가
archive: Java 컬렉션 실습 코드 보관
archive: 수업 예제 코드 정리
```

### 3-3. Java2 핵심 요약

추천 브랜치:

```text
study/java2-summary
```

사용 상황:

- 인터페이스 정리
- 제네릭 정리
- `Comparable` / `Comparator` 정리
- 람다, 스트림 정리
- 시험 대비 요약 정리

커밋 예시:

```text
study: Java2 인터페이스 개념 정리
study: 제네릭과 와일드카드 요약 추가
study: 람다와 스트림 핵심 개념 정리
```

### 3-4. 오류 수정

추천 브랜치:

```text
fix/오류이름
```

예시:

```text
fix/jsp-404-error
fix/tomcat-start-error
fix/oracle-connection-error
```

커밋 예시:

```text
fix: JSP 직접 접근으로 발생한 404 오류 수정
fix: Tomcat 실행 설정 오류 수정
fix: Oracle DB 연결 정보 수정
```

### 3-5. Git 설정 정리

추천 브랜치:

```text
chore/gitignore-cleanup
```

사용 상황:

- `.gitignore` 추가
- Eclipse `.metadata` 제거
- 불필요한 IDE 설정 파일 제거
- 폴더 구조 정리

커밋 예시:

```text
chore: Eclipse metadata 파일 추적 제외
chore: Java 프로젝트 gitignore 정리
chore: 불필요한 IDE 설정 파일 제거
```

## 4. 현재 수업자료 정리 작업의 추천 브랜치

현재 작업이 "수업자료 PDF 파일 정리 및 Spring 코드 수업자료"라면 가장 자연스러운 브랜치 이름은 아래입니다.

```text
docs/java-study-materials
```

이유:

- PDF는 문서 작업입니다.
- 수업자료 정리도 문서 작업입니다.
- Spring 코드 수업자료도 학습자료 정리에 가깝습니다.
- `feature`는 기능 개발 느낌이 강해서 현재 작업과는 조금 다릅니다.

현재 브랜치 이름이 `feature/java-practice-archive`여도 틀린 것은 아닙니다.
하지만 더 깔끔하게 보이게 하려면 `docs/java-study-materials`를 추천합니다.

## 5. 커밋 메시지 규칙

커밋 메시지는 아래 형식을 사용합니다.

```text
종류: 작업 내용
```

예시:

```text
docs: Java 수업자료 PDF 정리
archive: Java Day01 실습 코드 추가
study: Java2 제네릭 개념 정리
fix: JSP 404 오류 수정
chore: Eclipse metadata 추적 제외
```

### 5-1. 커밋 타입 의미

| 타입 | 의미 |
| --- | --- |
| `docs` | 문서, PDF, README, 학습자료 수정 |
| `archive` | 실습 코드나 예전 자료 보관 |
| `study` | 공부 내용 정리 |
| `feat` | 새 기능 추가 |
| `fix` | 오류 수정 |
| `refactor` | 코드 구조 개선 |
| `chore` | 설정, 정리, Git 관련 작업 |

### 5-2. 좋은 커밋 메시지 예시

좋은 예시:

```text
docs: Java2 핵심정리 PDF 추가
docs: Spring 수업자료 정리
archive: Java Day03 실습 코드 추가
study: Comparable과 Comparator 개념 정리
fix: JSP forward 경로 오류 수정
chore: Eclipse metadata 파일 추적 제외
```

아쉬운 예시:

```text
수업자료 올림
수정
다시 수정
파일 추가
커밋
java2 자료
```

아쉬운 이유:

- 무엇을 수정했는지 바로 알기 어렵습니다.
- 나중에 커밋 기록을 볼 때 찾기 어렵습니다.
- 포트폴리오로 봤을 때 정리되지 않은 느낌이 납니다.

## 6. `.gitignore` 추천 내용

Eclipse, IntelliJ, VSCode, Java 빌드 파일은 보통 GitHub에 올리지 않습니다.

```gitignore
# Eclipse workspace metadata
.metadata/
**/.metadata/

# Eclipse project settings
.classpath
.project
.settings/

# Java build files
bin/
target/
build/
out/
*.class

# IntelliJ IDEA
.idea/
*.iml

# VSCode
.vscode/

# OS files
.DS_Store
Thumbs.db

# Logs
*.log

# Environment files
.env
.env.local

# Temporary files
*.tmp
*.bak
```

## 7. 이미 올라간 `.metadata` 제거 방법

아래 명령어는 내 컴퓨터 파일을 삭제하는 것이 아니라 Git 추적만 끊는 명령어입니다.

```bash
git rm -r --cached AcornFileMain/java/java1/.metadata
git add .gitignore
git commit -m "chore: Eclipse metadata 파일 추적 제외"
```

다른 위치에도 `.metadata`가 있다면 경로를 확인하고 같은 방식으로 처리합니다.

## 8. 브랜치 이름 변경 방법

현재 브랜치 이름을 바꾸고 싶을 때:

```bash
git branch -m docs/java-study-materials
```

GitHub 원격 저장소에 새 브랜치로 올릴 때:

```bash
git push -u origin docs/java-study-materials
```

기존 원격 브랜치 삭제는 바로 하지 않아도 됩니다.
정리가 끝난 뒤 필요할 때 삭제해도 됩니다.

## 9. SourceTree 작업 흐름

1. 새 브랜치를 만듭니다.
   - 브랜치 버튼 클릭
   - 브랜치 이름 입력
   - 예: `docs/java-study-materials`
2. 파일을 수정합니다.
   - PDF, TXT, README, 코드 자료 정리
3. 파일 상태를 확인합니다.
   - SourceTree 왼쪽의 파일 상태 클릭
   - 수정된 파일 확인
4. 스테이지에 올립니다.
   - 커밋할 파일만 체크
   - `.metadata`, `.class`, `bin`, `target` 같은 불필요한 파일은 제외
5. 커밋 메시지를 작성합니다.
   - 예: `docs: Java 수업자료 PDF 정리`
6. 커밋합니다.
7. 필요한 경우 Push 합니다.

## 10. 혼자 작업할 때 추천 흐름

공부 자료 정리 작업:

```text
main 또는 master
  ↓
docs/java-study-materials 브랜치 생성
  ↓
PDF, TXT, README, 코드 자료 정리
  ↓
커밋
  ↓
Push
  ↓
문제 없으면 main/master에 병합
```

실습 코드 보관 작업:

```text
main 또는 master
  ↓
archive/java-practice 브랜치 생성
  ↓
Day별 실습 코드 정리
  ↓
커밋
  ↓
Push
  ↓
필요하면 main/master에 병합
```

오류 수정 작업:

```text
main 또는 master
  ↓
fix/jsp-404-error 브랜치 생성
  ↓
오류 수정
  ↓
커밋
  ↓
Push
  ↓
main/master에 병합
```

## 11. 최종 규칙

| 작업 | 브랜치 |
| --- | --- |
| 공부 자료, PDF, README 정리 | `docs/작업이름` |
| 실습 코드 보관 | `archive/작업이름` |
| 공부 요약 | `study/작업이름` |
| 오류 수정 | `fix/오류이름` |
| Git 설정 정리 | `chore/작업이름` |
| 기능 개발 | `feature/기능이름` |

가장 자주 쓸 브랜치:

```text
docs/java-study-materials
archive/java-practice
study/java2-summary
chore/gitignore-cleanup
fix/jsp-404-error
```

## 12. 지금 바로 추천하는 작업

1. 현재 작업 브랜치 이름을 `docs/java-study-materials`로 정리합니다.
2. `.gitignore`에 Eclipse 관련 파일을 추가합니다.
3. 이미 올라간 `.metadata` 파일은 Git 추적에서 제거합니다.
4. 커밋 메시지는 아래처럼 작성합니다.

```text
chore: Eclipse metadata 파일 추적 제외
docs: Java 수업자료 PDF 정리
docs: Spring 코드 수업자료 정리
```

5. 앞으로 공부용 저장소와 포트폴리오용 저장소를 분리해서 관리합니다.

## 13. 주의할 작업

아래 작업은 사용자 확인 후 진행합니다.

- push
- reset
- merge
- rebase
- clean
- force push
