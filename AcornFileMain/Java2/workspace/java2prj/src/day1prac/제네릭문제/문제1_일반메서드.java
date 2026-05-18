package day1prac.제네릭문제;

public class 문제1_일반메서드 {

	public static int findString(String[] arr, String target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}

	public static int findInt(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static int findDouble(double[] arr, double target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String[] strings = { "apple", "banana", "orange", "grape", "kiwi" };
		int[] numbers = { 10, 20, 30, 40, 50 };
		double[] doubleNumbers = { 1.1, 2.2, 3.3, 4.4, 5.5 };

		System.out.println(findString(strings, "orange"));
		System.out.println(findInt(numbers, 30));
		System.out.println(findDouble(doubleNumbers, 2.2));
	}

}
