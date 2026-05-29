# 00. Spring Boot 시작 정리

## 1. Spring Boot란?

Spring Boot는 Spring Framework 기반 application을 빠르게 만들고 실행할 수 있게 해주는 도구이다.

Spring 자체는 강력하지만 설정할 것이 많다. Spring Boot는 자주 쓰는 설정을 미리 준비해 두고, dependency와 classpath, 설정값을 보고 필요한 Bean을 자동으로 등록한다.

한 문장으로 정리하면 다음과 같다.

> Spring Boot는 Spring application을 더 적은 설정으로 만들고, 내장 web server로 바로 실행할 수 있게 해주는 Spring 기반 framework이다.

## 2. Spring과 Spring Boot의 차이

| 구분 | Spring Framework | Spring Boot |
| --- | --- | --- |
| 목적 | DI, AOP, MVC, Transaction 등 핵심 framework 제공 | Spring application을 빠르게 구성하고 실행 |
| 설정 | 직접 설정할 것이 많음 | 자동설정으로 기본값 제공 |
| 서버 | 외부 Tomcat에 배포하는 방식이 많았음 | 내장 Tomcat으로 바로 실행 가능 |
| dependency | 필요한 library를 직접 조합 | starter dependency로 묶어서 사용 |
| 실행 | WAR 배포 또는 별도 서버 필요 | `main()` 실행 또는 `java -jar` 실행 |

Spring Boot는 Spring을 대체하는 것이 아니다. Spring Boot는 Spring을 더 쉽게 사용하게 해주는 실행/설정 도구에 가깝다.

## 3. Spring Boot가 필요한 이유

Spring Boot가 해결하려는 문제는 다음과 같다.

- 프로젝트 생성과 dependency 구성이 번거롭다.
- Spring MVC를 쓰려면 DispatcherServlet, ViewResolver 등 설정이 필요하다.
- DB를 쓰려면 DataSource, TransactionManager 같은 설정이 필요하다.
- Tomcat 같은 web server를 따로 설치하고 배포해야 한다.
- 환경별 설정을 관리하기 어렵다.

Spring Boot는 다음 방식으로 이 문제를 줄인다.

- `starter` dependency로 관련 library를 한 번에 가져온다.
- `auto-configuration`으로 필요한 Bean을 자동 등록한다.
- `application.properties` 또는 `application.yml`로 설정을 단순화한다.
- 내장 Tomcat을 포함해 application 자체를 실행 가능한 program으로 만든다.
- 운영 환경에서는 executable jar로 배포할 수 있다.

## 4. 기본 프로젝트 구조

수업에서 사용하는 기본 구조는 다음과 같다.

```text
src
└── main
    ├── java
    │   └── com.acorn.day01Hello
    │       ├── Day01HelloApplication.java
    │       ├── HomeController.java
    │       └── Task1Service.java
    └── resources
        ├── application.properties
        ├── templates
        │   └── hello.html
        └── static
            ├── css
            ├── js
            └── imgs
```

| 위치 | 역할 |
| --- | --- |
| `src/main/java` | Java source code 작성 |
| `src/main/resources/application.properties` | application 설정 |
| `src/main/resources/templates` | Thymeleaf View 파일 위치 |
| `src/main/resources/static` | CSS, JS, image 같은 정적 파일 위치 |
| `build.gradle` | dependency, plugin, build 설정 |

## 5. Spring Boot 실행 방식

Spring Boot application은 여러 방식으로 실행할 수 있다.

### 5.1 IDE에서 실행

IntelliJ 또는 Eclipse에서 `main()` method를 실행한다.

```java
@SpringBootApplication
public class Day01HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day01HelloApplication.class, args);
    }
}
```

수업 초반에는 이 방식이 가장 쉽다.

### 5.2 Gradle로 실행

terminal에서 Gradle task를 실행할 수도 있다.

```bash
./gradlew bootRun
```

Windows에서는 보통 다음처럼 실행한다.

```bash
gradlew.bat bootRun
```

### 5.3 Jar로 build 후 실행

배포 가능한 jar를 만든 뒤 실행할 수 있다.

```bash
./gradlew bootJar
java -jar build/libs/app-name.jar
```

Spring Boot jar는 필요한 library와 내장 web server를 포함할 수 있으므로 외부 Tomcat에 따로 배포하지 않아도 된다.

## 6. `main()`과 `SpringApplication.run()`

Spring Boot application의 시작점은 Java의 일반 program과 똑같이 `main()` method이다.

```java
public static void main(String[] args) {
    SpringApplication.run(Day01HelloApplication.class, args);
}
```

여기서 핵심은 `SpringApplication.run()`이다.

`SpringApplication.run()`은 단순히 Java 객체 하나를 만드는 것이 아니라 Spring application 전체를 시작한다.

주요 작업은 다음과 같다.

1. application 종류를 판단한다.
2. 설정 정보를 읽는다.
3. Spring container인 `ApplicationContext`를 만든다.
4. Bean 등록 대상을 찾는다.
5. 자동설정을 적용한다.
6. Bean 객체를 생성하고 dependency injection을 수행한다.
7. web application이면 내장 Tomcat 같은 web server를 시작한다.
8. application을 요청 받을 수 있는 상태로 만든다.

## 7. 실행 흐름 전체 보기

Spring Boot web application의 실행 흐름은 다음과 같이 볼 수 있다.

```text
1. JVM 실행
2. main() 호출
3. SpringApplication.run() 호출
4. Environment 준비
5. ApplicationContext 생성
6. Component Scan 수행
7. Auto-Configuration 후보 확인
8. 조건에 맞는 Bean 등록
9. Bean 생성과 Dependency Injection 수행
10. Embedded Tomcat 시작
11. DispatcherServlet 준비
12. Browser 요청 처리 가능 상태
```

각 단계를 조금 더 풀면 다음과 같다.

| 단계 | 설명 |
| --- | --- |
| JVM 실행 | Java program이 시작된다. |
| `main()` 호출 | application 시작점이 실행된다. |
| `SpringApplication.run()` | Spring Boot startup 절차가 시작된다. |
| `Environment` 준비 | properties, YAML, 환경변수, command-line args 등을 읽는다. |
| `ApplicationContext` 생성 | Spring Bean을 관리하는 container를 만든다. |
| Component Scan | `@Controller`, `@Service`, `@Repository`, `@Component` 등을 찾는다. |
| Auto-Configuration | classpath와 설정값을 보고 필요한 Bean을 자동 등록한다. |
| Bean 생성 | 객체를 만들고 `@Autowired` 같은 dependency injection을 처리한다. |
| Embedded server 시작 | web project라면 Tomcat 같은 내장 server를 시작한다. |
| 요청 대기 | browser 또는 client 요청을 받을 수 있다. |

## 8. Embedded Tomcat

Spring Boot web project에는 보통 내장 Tomcat이 포함된다.

예를 들어 `build.gradle`에 다음 dependency가 있으면 web application으로 구성된다.

```gradle
implementation 'org.springframework.boot:spring-boot-starter-web'
```

`spring-boot-starter-web`은 Spring MVC, JSON 처리, embedded Tomcat 등 web application에 필요한 dependency를 묶어서 제공한다.

그래서 따로 Tomcat을 설치하지 않아도 `main()`을 실행하면 server가 같이 시작된다.

기본 port는 `8080`이다.

```properties
server.port=8080
```

port를 바꾸고 싶으면 `application.properties`에 다음처럼 설정한다.

```properties
server.port=8081
```

## 9. `@SpringBootApplication`

Spring Boot main class 위에는 보통 `@SpringBootApplication`을 붙인다.

```java
@SpringBootApplication
public class Day01HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(Day01HelloApplication.class, args);
    }
}
```

`@SpringBootApplication`은 세 가지 annotation을 합친 것이다.

| 포함 annotation | 역할 |
| --- | --- |
| `@SpringBootConfiguration` | 이 class가 Spring 설정 class임을 표시 |
| `@EnableAutoConfiguration` | Spring Boot 자동설정 활성화 |
| `@ComponentScan` | 현재 package 아래에서 component를 찾아 Bean으로 등록 |

따라서 `@SpringBootApplication` 하나만 붙여도 기본 설정, 자동설정, component scan이 함께 동작한다.

## 10. Component Scan

Component Scan은 Spring이 Bean으로 등록할 class를 찾는 과정이다.

대표 annotation은 다음과 같다.

| annotation | 주로 쓰는 위치 | 의미 |
| --- | --- | --- |
| `@Controller` | Controller class | web 요청 처리 |
| `@RestController` | REST API Controller | JSON 같은 데이터 응답 |
| `@Service` | Service class | 비즈니스 로직 처리 |
| `@Repository` | Repository/DAO class | DB 접근 처리 |
| `@Component` | 일반 component | Spring Bean 등록 |

중요한 점은 scan 범위이다.

`@SpringBootApplication`이 있는 package를 기준으로 그 하위 package를 scan한다.

예를 들어 main class가 다음 위치에 있다.

```text
com.acorn.day01Hello.Day01HelloApplication
```

그러면 기본 scan 대상은 다음과 같다.

```text
com.acorn.day01Hello
com.acorn.day01Hello.*
```

따라서 Controller를 다음처럼 밖에 만들면 scan되지 않을 수 있다.

```text
com.acorn.other.HomeController
```

수업에서는 main class를 가장 상위 package에 두고, Controller/Service/Repository를 그 하위에 두는 방식이 안전하다.

## 11. ApplicationContext

`ApplicationContext`는 Spring의 container이다.

Container는 객체를 직접 만들고 관리한다.

Spring에서는 container가 관리하는 객체를 `Bean`이라고 부른다.

예를 들어 다음 class들은 Bean이 될 수 있다.

```java
@Controller
public class HomeController {
}

@Service
public class Task1Service {
}

@Repository
public class MemberRepository {
}
```

`ApplicationContext`가 하는 일은 다음과 같다.

- Bean 생성
- Bean 보관
- Bean 간 dependency injection
- lifecycle 관리
- event 처리
- 설정 정보 관리

개발자가 `new HomeController()`로 직접 만들지 않아도 Spring이 대신 만들고 필요한 곳에 주입한다.

## 12. Dependency Injection

Dependency Injection은 필요한 객체를 외부에서 넣어주는 방식이다.

Controller가 Service를 직접 만들지 않고 생성자로 받는 예시는 다음과 같다.

```java
@Controller
public class Task1Controller {

    private final Task1Service service;

    public Task1Controller(Task1Service service) {
        this.service = service;
    }
}
```

Spring은 `Task1Service` Bean을 찾아서 `Task1Controller` 생성자에 넣어준다.

이 방식의 장점은 다음과 같다.

- 객체 생성 책임이 Spring container로 이동한다.
- Controller와 Service의 결합도가 낮아진다.
- 테스트하기 쉬워진다.
- 코드 구조가 계층별로 정리된다.

## 13. Starter Dependency

Starter는 특정 기능에 필요한 dependency를 묶어둔 dependency이다.

예를 들어 web application을 만들 때 필요한 library를 하나하나 직접 적지 않고 다음 하나만 추가한다.

```gradle
implementation 'org.springframework.boot:spring-boot-starter-web'
```

Thymeleaf를 쓰려면 다음 starter를 추가한다.

```gradle
implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
```

MyBatis를 쓰려면 다음 starter를 추가한다.

```gradle
implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.3'
```

Starter의 핵심은 다음과 같다.

- 관련 dependency를 묶어서 제공한다.
- version 충돌을 줄인다.
- classpath에 어떤 library가 있는지에 따라 자동설정이 달라진다.

## 14. Auto-Configuration이란?

Auto-Configuration은 Spring Boot가 application에 필요한 기본 Bean을 자동으로 등록하는 기능이다.

예를 들어 `spring-boot-starter-web`이 있으면 Spring Boot는 다음을 자동으로 준비한다.

- embedded Tomcat
- Spring MVC 기본 설정
- DispatcherServlet
- JSON 변환을 위한 Jackson 설정
- error page 기본 처리
- static resource 처리

`spring-boot-starter-thymeleaf`가 있으면 다음을 자동으로 준비한다.

- Thymeleaf template engine
- Thymeleaf ViewResolver
- `templates` 위치 인식

DB 관련 starter와 driver, datasource 설정이 있으면 다음을 자동으로 준비할 수 있다.

- DataSource
- TransactionManager
- MyBatis의 SqlSessionFactory 또는 관련 Bean

개발자가 모든 Bean을 직접 설정하지 않아도 Spring Boot가 조건에 맞춰 기본 설정을 제공한다.

## 15. Auto-Configuration 동작 방식

Auto-Configuration은 아무 설정이나 무조건 등록하지 않는다.

조건을 확인한 뒤 필요한 Bean만 등록한다.

동작 기준은 크게 세 가지이다.

### 15.1 Classpath 조건

현재 project에 어떤 library가 있는지 확인한다.

예를 들어 Spring MVC library가 있으면 MVC 관련 자동설정 후보가 활성화될 수 있다.

```text
spring-boot-starter-web 있음
→ Spring MVC 관련 class 있음
→ Web MVC 자동설정 후보 검토
```

### 15.2 Property 조건

`application.properties`, 환경변수, command-line args 같은 설정값을 확인한다.

예를 들어 다음 설정이 있으면 server port가 바뀐다.

```properties
server.port=8081
```

또 다음처럼 특정 기능을 켜고 끄는 설정도 가능하다.

```properties
spring.main.web-application-type=none
```

### 15.3 Bean 존재 여부

사용자가 직접 Bean을 등록했는지도 확인한다.

Spring Boot 자동설정은 보통 사용자가 직접 등록한 Bean을 우선한다.

즉, 내가 직접 설정하면 Spring Boot는 뒤로 물러난다.

이것을 흔히 `back off`라고 표현한다.

```text
사용자가 직접 Bean 등록
→ Spring Boot 자동설정은 같은 역할의 Bean을 새로 만들지 않음
```

## 16. Auto-Configuration 조건 annotation

Spring Boot 내부 자동설정 class에는 조건 annotation이 많이 사용된다.

| annotation | 의미 |
| --- | --- |
| `@ConditionalOnClass` | 특정 class가 classpath에 있으면 적용 |
| `@ConditionalOnMissingBean` | 특정 Bean이 없으면 적용 |
| `@ConditionalOnBean` | 특정 Bean이 있으면 적용 |
| `@ConditionalOnProperty` | 특정 설정값이 있거나 값이 맞으면 적용 |
| `@ConditionalOnWebApplication` | web application이면 적용 |

예를 들어 개념적으로 보면 다음과 같다.

```java
@ConditionalOnClass(DispatcherServlet.class)
@ConditionalOnMissingBean(DispatcherServlet.class)
class DispatcherServletAutoConfiguration {
}
```

뜻은 다음과 같다.

```text
DispatcherServlet class가 있고,
사용자가 DispatcherServlet Bean을 직접 등록하지 않았다면,
Spring Boot가 기본 DispatcherServlet을 등록한다.
```

## 17. `application.properties`

Spring Boot는 설정을 code가 아니라 외부 설정 파일로 분리할 수 있다.

대표 파일은 다음과 같다.

```text
src/main/resources/application.properties
src/main/resources/application.yml
```

수업에서 자주 쓰는 설정 예시는 다음과 같다.

```properties
spring.application.name=day01Hello
server.port=8080

spring.datasource.url=jdbc:oracle:thin:@host:port:sid
spring.datasource.username=DB_USER
spring.datasource.password=DB_PASSWORD
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

mybatis.type-aliases-package=com.acorn.day2Batis
mybatis.mapper-locations=classpath:mapper/*.xml
```

설정은 여러 위치에서 올 수 있다.

| 설정 위치 | 예시 |
| --- | --- |
| properties 파일 | `application.properties` |
| YAML 파일 | `application.yml` |
| 환경변수 | `SERVER_PORT=8081` |
| command-line argument | `--server.port=8081` |
| JVM system property | `-Dserver.port=8081` |

일반적으로 command-line argument는 파일 설정보다 우선순위가 높다.

```bash
java -jar app.jar --server.port=9090
```

이렇게 실행하면 `application.properties`의 `server.port`보다 command-line 값이 우선 적용될 수 있다.

## 18. Web 요청 처리 흐름

Spring Boot MVC application에서 browser 요청은 다음 흐름으로 처리된다.

```text
Browser
→ Embedded Tomcat
→ DispatcherServlet
→ HandlerMapping
→ Controller method
→ Service
→ Repository
→ Model 또는 ResponseBody
→ ViewResolver 또는 MessageConverter
→ HTML 또는 JSON 응답
```

### 18.1 View 응답

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

흐름은 다음과 같다.

```text
/hello 요청
→ HomeController.hello() 실행
→ Model에 data 저장
→ return "hello"
→ templates/hello.html 렌더링
→ HTML 응답
```

### 18.2 데이터 응답

```java
@ResponseBody
@GetMapping("/hello2")
public String hello2() {
    return "hello2";
}
```

흐름은 다음과 같다.

```text
/hello2 요청
→ Controller method 실행
→ return 값이 response body에 직접 기록
→ 문자열 또는 JSON 응답
```

`@RestController`는 모든 method에 `@ResponseBody`가 붙은 것처럼 동작한다.

## 19. ViewResolver와 MessageConverter

Controller method의 return 방식에 따라 응답 처리 방식이 달라진다.

| Controller 반환 | 처리 방식 | 결과 |
| --- | --- | --- |
| `return "hello"` | ViewResolver | `templates/hello.html` 렌더링 |
| `@ResponseBody return "hello"` | MessageConverter | 문자열 응답 |
| `@ResponseBody return member` | MessageConverter | JSON 응답 |
| `ResponseEntity<T>` | MessageConverter + status/header 제어 | HTTP 응답 직접 제어 |

Spring Boot는 starter와 자동설정으로 기본 ViewResolver와 MessageConverter를 준비한다.

## 20. 자동설정 예시로 이해하기

### 20.1 Web starter를 추가한 경우

```gradle
implementation 'org.springframework.boot:spring-boot-starter-web'
```

Spring Boot는 대략 다음을 판단한다.

```text
Spring MVC class가 있음
Tomcat class가 있음
사용자가 직접 web server Bean을 만들지 않음
→ Tomcat 기반 web application 자동설정
```

결과적으로 `main()`만 실행해도 browser에서 `http://localhost:8080`으로 접근할 수 있다.

### 20.2 Thymeleaf starter를 추가한 경우

```gradle
implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
```

Spring Boot는 대략 다음을 판단한다.

```text
Thymeleaf class가 있음
template engine Bean이 없음
→ ThymeleafViewResolver 자동 등록
→ templates/*.html View 처리 가능
```

그래서 Controller에서 `return "hello"`를 하면 `templates/hello.html`을 찾는다.

### 20.3 MyBatis starter를 추가한 경우

```gradle
implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.3'
```

DB driver와 datasource 설정이 있으면 MyBatis 관련 Bean이 자동 구성될 수 있다.

```text
MyBatis class가 있음
DataSource 설정이 있음
mapper location 설정이 있음
→ SqlSessionFactory, SqlSessionTemplate 등 MyBatis 기반 설정 준비
```

이후 Repository에서 `SqlSession`을 주입받아 Mapper SQL을 실행할 수 있다.

## 21. 자동설정을 확인하는 방법

자동설정이 왜 적용됐는지, 왜 적용되지 않았는지 확인하려면 다음 방법을 쓴다.

### 21.1 `--debug` 실행

```bash
java -jar app.jar --debug
```

또는 IDE 실행 설정에 `--debug`를 넣을 수 있다.

그러면 어떤 auto-configuration이 조건에 맞았고, 어떤 것은 조건에 맞지 않았는지 report가 출력된다.

### 21.2 Actuator 사용

Actuator dependency를 추가하면 운영/진단 endpoint를 사용할 수 있다.

자주 보는 endpoint는 다음과 같다.

| endpoint | 용도 |
| --- | --- |
| `/actuator/conditions` | auto-configuration 조건 결과 확인 |
| `/actuator/beans` | 등록된 Bean 목록 확인 |
| `/actuator/mappings` | Controller mapping 확인 |
| `/actuator/env` | 적용된 환경설정 확인 |
| `/actuator/configprops` | configuration properties 확인 |

### 21.3 Source에서 `*AutoConfiguration` 검색

IDE에서 다음 이름을 검색하면 Spring Boot가 어떤 자동설정을 제공하는지 볼 수 있다.

```text
WebMvcAutoConfiguration
DispatcherServletAutoConfiguration
ThymeleafAutoConfiguration
DataSourceAutoConfiguration
MybatisAutoConfiguration
```

`@ConditionalOnClass`, `@ConditionalOnMissingBean`, `@ConditionalOnProperty`를 보면 왜 적용되는지 이해하기 쉽다.

## 22. 자주 나오는 오류와 확인 포인트

| 증상 | 확인할 것 |
| --- | --- |
| server가 안 뜸 | port 충돌, dependency 누락, startup log 확인 |
| Controller가 호출되지 않음 | URL, `@GetMapping`, component scan 범위 확인 |
| View를 못 찾음 | `templates` 위치, return view name, Thymeleaf dependency 확인 |
| static 파일이 안 보임 | `static` 위치, 경로 `/css/...`, `/imgs/...` 확인 |
| Bean 주입 실패 | `@Service`, `@Repository`, 생성자 주입, scan 범위 확인 |
| DB 연결 실패 | datasource URL, driver, 계정, DB server 상태 확인 |
| MyBatis mapper 오류 | mapper XML 위치, namespace, statement id, alias package 확인 |
| 자동설정이 예상과 다름 | `--debug`, `/actuator/conditions`, 직접 등록한 Bean 확인 |

## 23. 수업 기준 핵심 암기

- Spring Boot 시작점은 `main()`이다.
- 실제 Spring 시작은 `SpringApplication.run()`에서 일어난다.
- `@SpringBootApplication`은 설정, 자동설정, component scan을 묶은 annotation이다.
- `ApplicationContext`는 Bean을 만들고 관리하는 Spring container이다.
- `starter`는 관련 dependency 묶음이다.
- `auto-configuration`은 classpath, property, Bean 존재 여부를 보고 기본 Bean을 자동 등록한다.
- web starter가 있으면 내장 Tomcat이 실행되고 기본 port는 `8080`이다.
- View 응답은 `templates`의 Thymeleaf HTML로 간다.
- 데이터 응답은 `@ResponseBody` 또는 `@RestController`로 처리한다.
- 설정은 `application.properties`에서 관리한다.
- 자동설정이 궁금하면 `--debug` 또는 Actuator conditions를 확인한다.

## 24. Review Checklist

- [ ] Spring Boot가 무엇인지 한 문장으로 설명할 수 있다.
- [ ] Spring과 Spring Boot의 차이를 설명할 수 있다.
- [ ] IDE 실행, Gradle 실행, jar 실행 방식을 구분할 수 있다.
- [ ] `main()`과 `SpringApplication.run()`의 역할을 설명할 수 있다.
- [ ] `@SpringBootApplication`이 포함하는 세 가지 기능을 말할 수 있다.
- [ ] Component Scan 범위가 main class package 기준임을 설명할 수 있다.
- [ ] `ApplicationContext`와 Bean의 관계를 설명할 수 있다.
- [ ] starter dependency의 역할을 설명할 수 있다.
- [ ] auto-configuration이 조건 기반으로 동작한다는 점을 설명할 수 있다.
- [ ] `@ConditionalOnClass`, `@ConditionalOnMissingBean`, `@ConditionalOnProperty`의 의미를 말할 수 있다.
- [ ] 내장 Tomcat이 언제 시작되는지 설명할 수 있다.
- [ ] browser 요청이 Controller까지 가는 흐름을 설명할 수 있다.
- [ ] View 응답과 데이터 응답의 차이를 설명할 수 있다.
- [ ] `application.properties`의 역할을 설명할 수 있다.
- [ ] 자동설정 문제를 `--debug` 또는 Actuator로 확인할 수 있다.

## 25. 공식 참고 키워드

공식 문서나 source를 볼 때는 다음 키워드로 찾으면 된다.

- `SpringApplication`
- `@SpringBootApplication`
- `@EnableAutoConfiguration`
- `AutoConfiguration.imports`
- `AutoConfigurationImportSelector`
- `ApplicationContext`
- `ServletWebServerApplicationContext`
- `WebMvcAutoConfiguration`
- `DispatcherServletAutoConfiguration`
- `ConditionEvaluationReport`
