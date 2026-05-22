package Day0305;

import java.util.Scanner;

public class 문제14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//13. 연산자와 두 수가 입력되면  사칙연산하는 프로그램을 작성하시오
		Scanner sc = new Scanner(System.in);
		double result = 0;
		System.out.println("A값을 입력해주세요");
		double a = sc.nextInt();
		
		System.out.println("B값을 입력해주세요");
		int b = sc.nextInt();
		
		System.out.println("사칙연산(+, -, /, *, %)을 선택해주세요");
		int c = sc.nextInt();
		
		if(c==1) {
			result = a+b;
		} else if(c == 2) {
			result = a-b;
		} else if(c ==3) {
			result = a/b;
		} else if(c ==4) {
			result = a*b;
		} else if(c == 5) {
			result = a%b;
		} else {
			System.out.println("잘못눌렀습니다");
		}
		
		System.out.println("결과:" + result);
	}

}
