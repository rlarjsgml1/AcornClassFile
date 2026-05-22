package Day0324.오후수업.prac.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su = 10;   // while 밖에서 선언
		
		while(true) {
			try {
				System.out.println("숫자입력");
				su = sc.nextInt();
				break;
			}catch(InputMismatchException e){
				System.out.println("숫자로 입력하세요");
				sc.nextLine(); // 남아 있는 잘못된 데이터 비우기
			}
		}
		
		System.out.println("당신이 입력한 숫자: " + su);
	}
}