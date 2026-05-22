package Day0319.상속객체실습프로그램;

// Member를 상속받는 프리미엄 회원 클래스
public class PremiumMember extends Member {

	int discountRate; // 할인율 (%)

	public PremiumMember(int id, String name, int age, String phone, int discountRate) {
		super(id, name, age, phone, "프리미엄"); // 등급은 고정
		this.discountRate = discountRate;
	}

	@Override
	public void printInfo() {
		super.printInfo(); // 부모의 printInfo() 호출
		System.out.println("   └─ 할인율: " + discountRate + "%");
	}
}
