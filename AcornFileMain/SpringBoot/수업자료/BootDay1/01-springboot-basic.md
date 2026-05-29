# 01. Spring Boot 기본, MVC, Thymeleaf

## 학습 목표

- Spring Initializr로 Spring Boot 프로젝트를 생성한다.
- Gradle 기반 프로젝트 구조를 이해한다.
- Spring MVC에서 View 응답과 데이터 응답을 구분한다.
- Thymeleaf로 HTML View에 `Model` 데이터를 출력한다.
- Controller와 Service의 역할을 분리한다.

## 프로젝트 생성

Spring Initializr에서 기본 프로젝트를 생성한다.

- Project: Gradle
- Language: Java
- Java: 17
- 주요 dependency
  - `spring-boot-starter-web`
  - `spring-boot-starter-thymeleaf`
  - `lombok`
  - `spring-boot-devtools`
  - `spring-boot-starter-test`

IDE 설정에서 annotation processor를 켜야 Lombok 같은 annotation 기반 라이브러리가 정상 동작한다.

## 프로젝트 구조

| 경로 | 역할 |
| --- | --- |
| `src/main/java` | Controller, Service, Domain class 등 Java 코드 작성 |
| `src/main/resources/application.properties` | 서버 포트, DB, MyBatis 등 설정 작성 |
| `src/main/resources/templates` | Thymeleaf HTML View 위치 |
| `src/main/resources/static` | CSS, JS, image 같은 정적 리소스 위치 |

## Controller 응답 방식

### View 응답

`@Controller`에서 문자열을 반환하면 View 이름으로 해석된다.

```java
@Controller
public class HomeController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("data", "spring boot start");
        return "hello";
    }
}
```

이 경우 `templates/hello.html`을 찾아 렌더링한다.

### 데이터 응답

`@ResponseBody`를 사용하면 View 이름이 아니라 response body로 직접 반환한다.

```java
@ResponseBody
@GetMapping("/hello2")
public String hello2() {
    return "hello2";
}
```

객체를 반환하면 JSON으로 변환된다. 데이터 응답만 주로 만드는 Controller는 `@RestController`를 사용할 수 있다.

## `@Controller`와 `@RestController`

| 구분 | 용도 | 반환값 처리 |
| --- | --- | --- |
| `@Controller` | HTML View 제공 | 문자열을 View 이름으로 처리 |
| `@Controller` + `@ResponseBody` | 특정 method만 데이터 응답 | 반환값을 body에 직접 출력 |
| `@RestController` | REST API 데이터 응답 | 모든 method에 `@ResponseBody` 적용 |

## Thymeleaf 기본

Thymeleaf 파일은 `templates` 아래에 둔다.

```html
<html xmlns:th="http://www.thymeleaf.org">
<body>
  <div th:text="${data}">기본 문구</div>
  <input type="text" th:value="${data}">
</body>
</html>
```

핵심 문법은 다음과 같다.

| 문법 | 설명 |
| --- | --- |
| `th:text="${data}"` | Model 값을 text로 출력 |
| `th:value="${data}"` | input value에 Model 값 출력 |
| `th:each="item : ${list}"` | list 반복 출력 |
| `th:href="@{/css/test.css}"` | static CSS 경로 연결 |
| `th:src="@{/js/test.js}"` | static JS 경로 연결 |

## Service 분리

Controller는 요청 처리와 View 연결에 집중하고, 계산이나 업무 로직은 Service로 분리한다.

예시 흐름은 다음과 같다.

1. 사용자가 `/calc2?su1=10&su2=20` 요청을 보낸다.
2. Controller가 `@RequestParam`으로 값을 받는다.
3. Controller가 Service의 method를 호출한다.
4. Service가 계산 결과를 반환한다.
5. Controller가 `Model`에 결과를 담고 View 이름을 반환한다.

```java
@GetMapping("/calc2")
public String calc(
        @RequestParam(name = "su1", required = false, defaultValue = "1") int su1,
        @RequestParam(name = "su2", required = false, defaultValue = "1") int su2,
        Model model) {
    int result = service.add(su1, su2);
    model.addAttribute("result", result);
    return "task1";
}
```

## 1차시 실습 주제

- `/calc`: 두 수를 입력받아 사칙연산 결과 제공
- `/dan3`: 3단 출력
- `/dan?num=3`: 원하는 구구단 출력
- `/movie`: 직접 만든 domain class 정보를 응답
- `/star?cnt=5`: 원하는 개수만큼 별 출력
- `/divisor`: 입력한 수의 약수 출력
- `/message`: 화이팅 메시지 제공
- `/message/random`: random 화이팅 메시지 제공
- `/cute/img`: 이미지 제공
- `/cute/img/random`: random 이미지 제공
- 원하는 서비스를 직접 만들어 제공

## 핵심 정리

- Spring Boot는 내장 Tomcat으로 실행되며 기본 port는 `8080`이다.
- View를 보여줄 때는 `@Controller`와 Thymeleaf를 사용한다.
- 데이터를 직접 응답할 때는 `@ResponseBody`, `@RestController`, `ResponseEntity<T>`를 사용한다.
- 반복 출력, text 출력, input value 출력은 Thymeleaf 기본 문법으로 처리한다.
- 실습 문제는 Controller에 모든 로직을 넣지 말고 Service로 분리하는 것이 핵심이다.
