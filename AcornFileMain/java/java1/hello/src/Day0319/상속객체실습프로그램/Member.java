package Day0319.상속객체실습프로그램;

// Person을 상속받는 회원 클래스
public class Member extends Person {

	int id; // 회원 번호
	String grade; // 등급

	public Member(int id, String name, int age, String phone, String grade) {
		super(name, age, phone); // 부모 생성자 호출
		this.id = id;
		this.grade = grade;
	}

	@Override
	public void printInfo() {
		System.out.println("[" + id + "] " + name + " | 등급: " + grade + " | 나이: " + age + " | 전화: " + phone);
	}
}
