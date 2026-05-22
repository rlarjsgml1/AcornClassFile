package Day0324.오후수업.prac.ex;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		//예외 만나기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력해");
		int input = sc.nextInt(); //숫자가 아닌 값을 입력하면 inputMismatchException 예외가 발생
		
		System.out.println("당신이 입력한 숫자 =" + input);
	}
}
