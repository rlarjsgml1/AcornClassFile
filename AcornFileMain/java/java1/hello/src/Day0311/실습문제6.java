package Day0311;

import java.util.Scanner;

public class 실습문제6 {
	public static int number(int[] arr) {
		int max = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6. 수목록(배열)을 입력으로 받아 가장 큰값을 반환하는 함수 만들기 ( 수 중에서 가장 큰값을 찾아주는 함수)
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를입력해주세요 5개");
		for(int i = 0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		int result =number(num);
		System.out.println("큰 숫자" + result);
	}

}
