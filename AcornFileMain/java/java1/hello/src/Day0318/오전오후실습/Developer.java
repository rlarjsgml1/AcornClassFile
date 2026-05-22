package Day0318.오전오후실습;

public class Developer extends Employee {

	public Developer(String name) {
		super(name);
	}
	@Override
	public void work() {
		System.out.println(name + " " + "프로그램 개발 중");
	}
	public void coding() {
		System.out.println(name +"코딩 중");
	}
}
