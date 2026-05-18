# Java2 학습 목표 정리

대상: MVC2 패턴으로 웹 개발을 배운 뒤 Java2 문법을 배우는 초보자

목표: 인터페이스, 정렬, 제네릭, 와일드카드를 단순 암기가 아니라 "왜 쓰는지"와 "어떻게 코드로 작성하는지"까지 이해한다.

---

## 목차

1. 라이브러리를 만들 때 인터페이스를 활용하는 경우
2. `ArrayList<Acorn>` 객체 배열 정렬
3. 인터페이스의 `static` 메서드와 `default` 메서드
4. 간단한 제네릭 클래스
5. 제한된 제네릭 클래스
6. 제네릭 메서드
7. 메서드 인자에서 와일드카드 사용하기
8. 전체 요약
9. 연습 문제

---

## 1. 라이브러리를 만들 때 인터페이스를 활용하는 경우

### 학습 목표

라이브러리 코드를 만들 때 왜 인터페이스가 필요한지 이해할 수 있다.

### 핵심 개념

인터페이스는 클래스가 따라야 하는 규칙입니다. 라이브러리를 만드는 사람은 사용자가 어떤 클래스를 만들지 미리 알 수 없습니다. 하지만 "이 메서드만 있으면 사용할 수 있다"라는 약속은 정할 수 있습니다.

예를 들어 출력 라이브러리를 만든다고 생각해 봅시다. 라이브러리는 보고서, 영수증, 성적표 같은 구체적인 클래스를 전부 알 필요가 없습니다. 대신 `Printable`이라는 인터페이스를 만들고, `print()` 메서드만 약속하면 됩니다.

### 쉬운 비유

멀티탭은 어떤 회사의 충전기인지 몰라도 플러그 모양만 맞으면 전기를 공급합니다. 인터페이스도 비슷합니다. 라이브러리는 객체의 정확한 클래스 이름보다 "정해진 메서드가 있는지"를 중요하게 봅니다.

### 예제 코드

```java
interface Printable {
    void print();
}

class Report implements Printable {
    public void print() {
        System.out.println("보고서를 출력합니다.");
    }
}

class Receipt implements Printable {
    public void print() {
        System.out.println("영수증을 출력합니다.");
    }
}

class PrintLibrary {
    static void run(Printable target) {
        target.print();
    }
}

class Main {
    public static void main(String[] args) {
        PrintLibrary.run(new Report());
        PrintLibrary.run(new Receipt());
    }
}
```

### 실행 흐름

1. `Printable`은 `print()`라는 규칙을 정합니다.
2. `Report`와 `Receipt`는 `Printable`을 구현합니다.
3. `PrintLibrary.run()`은 매개변수로 `Printable`을 받습니다.
4. 따라서 `Report`든 `Receipt`든 `print()` 규칙만 지키면 라이브러리에서 사용할 수 있습니다.

### 자주 헷갈리는 부분

인터페이스는 객체를 직접 만들기 위한 클래스가 아닙니다. `new Printable()`처럼 사용할 수 없습니다. 대신 인터페이스를 구현한 클래스의 객체를 인터페이스 타입 변수에 담을 수 있습니다.

```java
Printable p = new Report();
p.print();
```

---

## 2. `ArrayList<Acorn>` 객체 배열 정렬

### 학습 목표

`ArrayList<Acorn>`에 들어 있는 객체를 `Comparable`과 `Comparator`로 정렬할 수 있다.

### 먼저 알아야 할 것

`ArrayList<Integer>`는 숫자를 정렬하기 쉽습니다. Java가 숫자의 크기 비교를 이미 알고 있기 때문입니다.

하지만 `ArrayList<Acorn>`은 다릅니다. Java는 `Acorn` 객체에서 무엇을 기준으로 정렬해야 하는지 모릅니다.

- 이름순인가?
- 점수순인가?
- 무게순인가?

그래서 정렬 기준을 개발자가 직접 알려 주어야 합니다.

### Acorn 클래스 만들기

```java
class Acorn {
    String name;
    int score;

    Acorn(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return name + "(" + score + "점)";
    }
}
```

### ArrayList 만들기

```java
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Acorn> list = new ArrayList<>();
        list.add(new Acorn("나래", 95));
        list.add(new Acorn("가람", 80));
        list.add(new Acorn("다온", 70));

        System.out.println(list);
    }
}
```

### Comparable 인터페이스로 기본 정렬 구현하기

`Comparable`은 클래스 안에 기본 정렬 기준을 넣는 방식입니다.

```java
import java.util.ArrayList;
import java.util.Collections;

class Acorn implements Comparable<Acorn> {
    String name;
    int score;

    Acorn(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int compareTo(Acorn other) {
        return this.score - other.score;
    }

    public String toString() {
        return name + "(" + score + "점)";
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Acorn> list = new ArrayList<>();
        list.add(new Acorn("나래", 95));
        list.add(new Acorn("가람", 80));
        list.add(new Acorn("다온", 70));

        Collections.sort(list);
        System.out.println(list);
    }
}
```

### 실행 흐름

1. `Collections.sort(list)`가 호출됩니다.
2. Java는 `Acorn` 클래스가 `Comparable<Acorn>`을 구현했는지 확인합니다.
3. 객체끼리 비교할 때 `compareTo()`를 호출합니다.
4. `this.score - other.score` 결과가 음수이면 `this`가 앞에 옵니다.

### Comparator 인터페이스로 원하는 기준 정렬하기

`Comparator`는 클래스 밖에서 정렬 기준을 따로 만드는 방식입니다. 기준을 여러 개 만들고 싶을 때 좋습니다.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Acorn {
    String name;
    int score;

    Acorn(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return name + "(" + score + "점)";
    }
}

class NameComparator implements Comparator<Acorn> {
    public int compare(Acorn first, Acorn second) {
        return first.name.compareTo(second.name);
    }
}

class ScoreComparator implements Comparator<Acorn> {
    public int compare(Acorn first, Acorn second) {
        return second.score - first.score;
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Acorn> list = new ArrayList<>();
        list.add(new Acorn("나래", 95));
        list.add(new Acorn("가람", 80));
        list.add(new Acorn("다온", 70));

        Collections.sort(list, new NameComparator());
        System.out.println("이름순: " + list);

        Collections.sort(list, new ScoreComparator());
        System.out.println("점수순: " + list);
    }
}
```

### Comparable과 Comparator 차이

| 구분 | Comparable | Comparator |
|---|---|---|
| 위치 | 정렬될 클래스 안 | 클래스 밖 |
| 메서드 | `compareTo()` | `compare()` |
| 용도 | 기본 정렬 기준 1개 | 상황별 정렬 기준 여러 개 |
| 호출 | `Collections.sort(list)` | `Collections.sort(list, comparator)` |

### 자주 헷갈리는 부분

`return this.score - other.score;`는 점수 오름차순입니다. 높은 점수부터 보고 싶으면 `return other.score - this.score;`처럼 순서를 반대로 적습니다.

---

## 3. 인터페이스의 `static`과 `default` 구분

### 학습 목표

인터페이스의 `default` 메서드와 `static` 메서드를 구분할 수 있다.

### default 메서드

`default` 메서드는 인터페이스 안에 구현을 가진 메서드입니다. 구현 클래스가 물려받아 사용할 수 있습니다.

### static 메서드

`static` 메서드는 인터페이스 이름으로 직접 호출합니다. 구현 클래스 객체로 호출하는 것이 아닙니다.

### 예제 코드

```java
interface StudyTool {
    void study();

    default void rest() {
        System.out.println("10분 쉬기");
    }

    static void guide() {
        System.out.println("짧게 반복해서 공부하세요.");
    }
}

class JavaBook implements StudyTool {
    public void study() {
        System.out.println("Java 예제를 따라 칩니다.");
    }
}

class Main {
    public static void main(String[] args) {
        JavaBook book = new JavaBook();
        book.study();
        book.rest();

        StudyTool.guide();
    }
}
```

### 차이점 표

| 구분 | default 메서드 | static 메서드 |
|---|---|---|
| 호출 방법 | 객체로 호출 | 인터페이스 이름으로 호출 |
| 예시 | `book.rest()` | `StudyTool.guide()` |
| 구현 클래스가 물려받나? | 예 | 아니오 |
| 주 사용 목적 | 기존 구현 클래스에 기본 기능 제공 | 인터페이스 관련 유틸 기능 제공 |

### 자주 헷갈리는 부분

`static` 메서드는 `book.guide()`처럼 호출하지 않습니다. 반드시 `StudyTool.guide()`처럼 인터페이스 이름으로 호출합니다.

---

## 4. 간단한 제네릭 클래스 작성

### 학습 목표

`Box<T>` 같은 간단한 제네릭 클래스를 작성할 수 있다.

### 제네릭이 필요한 이유

제네릭은 사용할 타입을 나중에 정하는 문법입니다. 같은 `Box` 클래스를 문자열 상자로도 쓰고, 숫자 상자로도 쓸 수 있습니다.

### 쉬운 비유

상자 자체는 똑같지만 이름표를 붙이면 용도가 달라집니다.

- `Box<String>`: 문자열 전용 상자
- `Box<Integer>`: 정수 전용 상자
- `Box<Acorn>`: Acorn 전용 상자

### 예제 코드

```java
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

class Main {
    public static void main(String[] args) {
        Box<String> textBox = new Box<>();
        textBox.setItem("Hello");

        Box<Integer> numberBox = new Box<>();
        numberBox.setItem(100);

        System.out.println(textBox.getItem());
        System.out.println(numberBox.getItem());
    }
}
```

### T의 의미

`T`는 타입을 뜻하는 임시 이름입니다. 꼭 `T`만 써야 하는 것은 아니지만, Type의 첫 글자라서 많이 사용합니다.

---

## 5. 제한된 제네릭 클래스 작성

### 학습 목표

`<T extends Number>` 형태의 제한된 제네릭 클래스를 작성할 수 있다.

### 제한된 제네릭이 필요한 이유

그냥 `<T>`라고 쓰면 어떤 타입이 들어올지 모릅니다. 그래서 Java는 `T`가 숫자인지, 문자열인지 알 수 없습니다.

하지만 `<T extends Number>`라고 쓰면 `T`는 `Number` 또는 `Number`의 자식 클래스만 가능해집니다.

대표적인 숫자 타입은 다음과 같습니다.

- `Integer`
- `Double`
- `Long`
- `Float`

### 예제 코드

```java
class NumberBox<T extends Number> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public double getDoubleValue() {
        return value.doubleValue();
    }
}

class Main {
    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.setValue(10);

        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.setValue(3.14);

        System.out.println(intBox.getDoubleValue());
        System.out.println(doubleBox.getDoubleValue());
    }
}
```

### 실행 흐름

1. `NumberBox<T extends Number>`는 숫자 타입만 받겠다고 제한합니다.
2. `Integer`와 `Double`은 `Number`의 자식이므로 사용할 수 있습니다.
3. `String`은 `Number`의 자식이 아니므로 사용할 수 없습니다.
4. `value`가 숫자라는 보장이 있으므로 `doubleValue()`를 호출할 수 있습니다.

---

## 6. 간단한 제네릭 메서드 작성

### 학습 목표

`public static <T> void print(T value)` 형태의 제네릭 메서드를 작성할 수 있다.

### 클래스 제네릭과 메서드 제네릭 차이

클래스 제네릭은 클래스 전체에서 타입을 사용합니다.

```java
class Box<T> {
    private T item;
}
```

메서드 제네릭은 메서드 하나에서만 타입을 사용합니다.

```java
class Printer {
    public static <T> void print(T value) {
        System.out.println(value);
    }
}
```

### 예제 코드

```java
class Printer {
    public static <T> void print(T value) {
        System.out.println(value);
    }
}

class Main {
    public static void main(String[] args) {
        Printer.print("Java");
        Printer.print(100);
        Printer.print(3.14);
    }
}
```

### 자주 헷갈리는 부분

`public static <T> void print(T value)`에서 반환 타입은 `void`입니다. `<T>`는 반환 타입이 아니라 "이 메서드에서 T라는 타입 이름을 사용하겠다"는 선언입니다.

---

## 7. 메서드 인자에서 와일드카드 사용하는 법

### 학습 목표

메서드 매개변수에서 `List<?>`, `List<? extends Number>`, `List<? super Integer>`를 구분할 수 있다.

### 와일드카드란?

와일드카드 `?`는 정확한 타입 이름은 모르지만 어떤 타입이 들어온다는 뜻입니다.

### `List<?>`

어떤 타입의 리스트든 받을 수 있습니다. 주로 읽어서 출력할 때 사용합니다.

```java
import java.util.List;

class WildcardExample {
    static void printAll(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }
}
```

### `List<? extends Number>`

`Number` 또는 `Number`의 자식 타입 리스트를 받을 수 있습니다. 숫자를 꺼내서 읽을 때 좋습니다.

```java
import java.util.List;

class WildcardExample {
    static void printNumbers(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number.doubleValue());
        }
    }
}
```

받을 수 있는 예시는 다음과 같습니다.

- `List<Integer>`
- `List<Double>`
- `List<Long>`

### `List<? super Integer>`

`Integer` 또는 `Integer`의 부모 타입 리스트를 받을 수 있습니다. `Integer` 값을 넣을 때 좋습니다.

```java
import java.util.List;

class WildcardExample {
    static void addNumber(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }
}
```

받을 수 있는 예시는 다음과 같습니다.

- `List<Integer>`
- `List<Number>`
- `List<Object>`

### 쉽게 기억하기

| 문법 | 의미 | 초보자용 기억법 |
|---|---|---|
| `List<?>` | 어떤 타입이든 가능 | 그냥 출력할 때 |
| `List<? extends Number>` | Number의 자식까지 가능 | 꺼내서 읽을 때 |
| `List<? super Integer>` | Integer의 부모까지 가능 | Integer를 넣을 때 |

---

## 8. 전체 요약

| 학습 목표 | 핵심 정리 |
|---|---|
| 인터페이스 활용 | 라이브러리와 사용자 코드 사이의 약속을 만든다. |
| `ArrayList<Acorn>` 정렬 | 객체는 정렬 기준을 직접 알려 주어야 한다. |
| `Comparable` | 클래스 안에 기본 정렬 기준을 작성한다. |
| `Comparator` | 클래스 밖에 상황별 정렬 기준을 작성한다. |
| `default` 메서드 | 구현 클래스가 물려받아 객체로 호출한다. |
| `static` 메서드 | 인터페이스 이름으로 직접 호출한다. |
| 제네릭 클래스 | 사용할 타입을 객체 생성 시점에 정한다. |
| 제한된 제네릭 | 받을 수 있는 타입의 범위를 제한한다. |
| 제네릭 메서드 | 메서드 하나에만 타입 변수를 적용한다. |
| 와일드카드 | 매개변수에서 여러 제네릭 타입을 유연하게 받는다. |

---

## 9. 연습 문제

1. 인터페이스를 라이브러리에서 사용하면 어떤 장점이 있나요?
2. `implements` 키워드는 어떤 뜻인가요?
3. `ArrayList<Acorn>`에는 어떤 타입의 객체를 넣을 수 있나요?
4. `Comparable<Acorn>`을 구현할 때 작성해야 하는 메서드는 무엇인가요?
5. `Comparator`는 어떤 상황에서 사용하면 좋나요?
6. `default` 메서드는 어떻게 호출하나요?
7. `static` 메서드는 어떻게 호출하나요?
8. `Box<T>`에서 `T`는 무엇을 의미하나요?
9. `<T extends Number>`는 어떤 타입만 허용하나요?
10. `List<? extends Number>`와 `List<? super Integer>`의 차이는 무엇인가요?

---

## 정답 및 해설

1. 라이브러리가 구체적인 클래스 이름을 몰라도 인터페이스 규칙을 지키는 객체를 사용할 수 있습니다.
2. 어떤 인터페이스의 규칙을 클래스가 구현한다는 뜻입니다.
3. `Acorn` 객체를 넣을 수 있습니다.
4. `compareTo()` 메서드입니다.
5. 이름순, 점수순처럼 정렬 기준을 여러 개 만들고 싶을 때 사용합니다.
6. 구현 클래스의 객체로 호출합니다. 예: `book.rest()`
7. 인터페이스 이름으로 호출합니다. 예: `StudyTool.guide()`
8. 나중에 실제 타입으로 바뀔 타입 자리입니다.
9. `Number` 또는 `Number`를 상속한 `Integer`, `Double` 같은 숫자 타입만 허용합니다.
10. `extends`는 숫자를 꺼내서 읽을 때 좋고, `super`는 `Integer` 값을 넣을 때 좋습니다.
