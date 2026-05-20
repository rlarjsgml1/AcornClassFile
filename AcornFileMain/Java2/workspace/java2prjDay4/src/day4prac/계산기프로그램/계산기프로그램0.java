package day4prac.계산기프로그램;

import java.util.Scanner;

public class 계산기프로그램0 {
 
	public void run() { 
		System.out.println(" 두 수 입력하시오 , 계산해 드릴께요");
		Scanner sc  = new Scanner( System.in);
		
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		//계산하기 , 직접계산하기
		int result  = su1+su2;
		
		System.out.println( result +"입니다");
		
		
	}
	
	
	
	public static void main(String[] args) {
		계산기프로그램0  p = new 계산기프로그램0();
		p.run();

	}

}
