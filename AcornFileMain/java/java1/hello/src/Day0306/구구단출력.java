package Day0306;

import java.util.Scanner;

public class 구구단출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 2;
		for(int i =1; i<=9; i++) {
			int result =a * i;
			System.out.println(a + "x" + i +"="+ result);
		}
		//-------------------------------------------------------
		System.out.println("구구단출력 숫자를 입력해주세요");
		int b = sc.nextInt();
		for(int j = 1; j<=9; j++) {
			int result2 = b * j;
			System.out.println(b + "x" + j +"="+ result2);
		}
		//----------------------------
		//전체구구단 반복문으로 출력하기
		for(int y =2; y<=9; y++) {
			for(int u =1; u<=9; u++) {
				//System.out.println("9*" + u +"=" + 9*u);
				System.out.println(y + "*" + u +"=" + y*u);
			}
		}
		
	}

}
