package day2prac.lamda.Day2문제;

public class Ex04AddInterfacePractice {

	public static void main(String[] args) {
		AddInterface add1 = new AddInterfaceImpl();
		System.out.println("이름 있는 클래스: " + add1.add(10, 20));

		AddInterface add2 = new AddInterface() {
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};
		System.out.println("익명 클래스: " + add2.add(10, 20));

		AddInterface add3 = (a, b) -> a + b;
		System.out.println("람다식: " + add3.add(10, 20));
	}
}
