package Day0318.맛있는다형성;

public class KKH extends AcornStudent {

	public KKH(String name, int age) {
		super(name, age);
	}

	@Override
	public void 음료마시기() {
		System.out.println(name + " 딸기스무디 먹고싶어요");
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 나이: " + age;
	}
}