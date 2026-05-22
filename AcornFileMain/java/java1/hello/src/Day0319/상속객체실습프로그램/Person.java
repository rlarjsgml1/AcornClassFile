package Day0319.상속객체실습프로그램;

// 최상위 부모 클래스
public class Person {

	String name; // 이름
	int age; // 나이
	String phone; // 전화번호

	public Person(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public void printInfo() {
		System.out.println("이름: " + name + " | 나이: " + age + " | 전화: " + phone);
	}
}
