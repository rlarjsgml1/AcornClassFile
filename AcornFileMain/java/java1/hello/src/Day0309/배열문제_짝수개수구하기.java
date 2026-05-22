package Day0309;

import java.util.Scanner;

public class 배열문제_짝수개수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제)5개의 숫자를 입력받아서(배열을 사용하세요)
		//숫자 중에서 짝수의 개수가 몇개인지 구하시오
		
		int[] number = new int[5];
		int evenCnt = 0;
		//입력받기 
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<number.length; i++) {
			number[i] = sc.nextInt();
		}
		
		//처리하기
		for(int i =0; i<number.length; i++) {
			int su = number[i];
			if(su % 2==0) {
				evenCnt++;
			}
		}
		
		//출력
		System.out.println(evenCnt);
//		for(int i = 0; i<number.length; i++) {
//			System.out.println(number[i]);
//		}
		
		
	}

}
