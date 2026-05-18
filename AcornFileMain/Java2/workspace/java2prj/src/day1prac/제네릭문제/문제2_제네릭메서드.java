package day1prac.제네릭문제;

public class 문제2_제네릭메서드 {

	public static <T> int findIndex(T[] arr, T target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String[] strings = { "apple", "banana", "orange", "grape", "kiwi" };
		Integer[] numbers = { 10, 20, 30, 40, 50 };
		Double[] doubleNumbers = { 1.1, 2.2, 3.3, 4.4, 5.5 };

		System.out.println(findIndex(strings, "orange"));
		System.out.println(findIndex(numbers, 30));
		System.out.println(findIndex(doubleNumbers, 2.2));
	}

}
