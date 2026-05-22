package Day0318.오전오후실습;

public class Designer extends Employee {
	public Designer(String name) {
		super(name);
	}
	@Override
	public void work() {
		System.out.println(name + " " + "디자인 하는 중" + "\n");
	}
	public void design() {
		System.out.println(name + "웹 디자인 하는 중");
	}
}
