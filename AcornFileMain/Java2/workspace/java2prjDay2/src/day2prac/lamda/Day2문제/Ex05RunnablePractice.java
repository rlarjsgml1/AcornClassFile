package day2prac.lamda.Day2문제;

public class Ex05RunnablePractice {

	public static void main(String[] args) {
		Runnable runnable1 = new BucketListRunnable();
		runnable1.run();

		Runnable runnable2 = new Runnable() {
			@Override
			public void run() {
				System.out.println("익명 클래스 Runnable: 자바 람다식 복습하기");
			}
		};
		runnable2.run();

		Runnable runnable3 = () -> System.out.println("람다식 Runnable: GitHub에 과제 정리해서 올리기");
		runnable3.run();
	}
}
