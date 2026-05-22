package Day0305;

import java.util.Scanner;

public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12.     구구단 출력   , 원하는단 출력 
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int n = sc.nextInt();
		int result = 0;
		for(int i = 1; i<=9; i++) {
			result = n * i;
			System.out.println( n + "x" + i + "=" + result);
		}
	}

}
