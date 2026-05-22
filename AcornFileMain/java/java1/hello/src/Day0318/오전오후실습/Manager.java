package Day0318.오전오후실습;

public class Manager extends Employee {

	public Manager(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println(name + " " + " 팀 관리");
	}

	public void manage() {
		System.out.println(name + " 직원 관리");
	}
}