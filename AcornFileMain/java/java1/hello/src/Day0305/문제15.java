package Day0305;

import java.util.Scanner;

public class 문제15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		14 . 구구단을 단보다 곱하는 수가 작거나 같은경우까지만 출력하는 프로그램을 작성하시오 
//		   ( 3단
//		    3*1=3
//		    3*2=6
//		    3*3 =9
//
//		   4단
//		   4*1 =4
//		   4*2 =8 
//		   4*3 =12
//		   4*4 =16
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 숫자를 입력해주세요");
		int a = sc.nextInt();
		for(int i = 1; i<=a; i++) {
				int result = a * i;
				System.out.println(a + "*" + i + "=" + result);
		}
	}

}
