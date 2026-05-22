package Day0311;

public class 실습문제1 {
	
	public static int even() {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10, 11, 12, 13};
		int count =0;
		for(int i =0; i< numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = even();
		System.out.print(result);

	}

}
