package day5prac.재귀호출;

public class 합10재귀2 {

	public static void main(String[] args) {
		
		//기능 : 1~10까지 합의 구하기
		//입력(매개변수) : x
		//반환	1~10까지 합
		
		int result = getSum();
		System.out.println(result);
		
		
	}

	private static int getSum() {
		int sum = 0;
		
		//처리
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}

		System.out.println(sum);
		return sum;
	}

}
