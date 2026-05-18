package day2prac.lamda.Day2문제;

public class Ex03LambdaExpressionPractice {

	public static void main(String[] args) {
		MaxInterface max = (a, b) -> a > b ? a : b;
		PrintVarInterface printVar = (name, age) -> System.out.println(name + "=" + age);
		SquareInterface square = x -> x * x;
		RandomInterface random = () -> (int) (Math.random() * 6);

		System.out.println("max(10, 20) = " + max.max(10, 20));
		printVar.printVar("홍길동", 20);
		System.out.println("square(5) = " + square.square(5));
		System.out.println("random() = " + random.getRandom());
	}
}
