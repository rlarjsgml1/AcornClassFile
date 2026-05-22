package Day0324.오후수업.prac.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		try {
			System.out.println("숫자입력해");
			input = sc.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("숫자로 입력해주세요");
		}
		System.out.println("당신이 입력한 숫자=" + input);
		
	}
}
