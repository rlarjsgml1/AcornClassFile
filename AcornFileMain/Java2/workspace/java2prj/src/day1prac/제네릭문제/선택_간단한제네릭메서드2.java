package day1prac.제네릭문제;

public class 선택_간단한제네릭메서드2 {

	public static <T> void printThreeTimes(T item) {
		for (int i = 1; i <= 3; i++) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) {
		printThreeTimes("apple");
		printThreeTimes(100);
		printThreeTimes(3.14);
	}

}
