package day4prac.계산기프로그램;

import java.util.Scanner;

public class 계산기프로그램2 {

	
	//LG계산기 객체 의존성 (dependency)    => SM계산기 객체로 변경하기 
	
//	LG계산기    calculator  = new LG계산기();
	SM계산기    calculator  = new SM계산기();
	
	public void run() {
		System.out.println( "두 수를 입력하시오  계산해 드릴께요 ");
		Scanner sc = new Scanner( System.in);
		
		 int su1 = sc.nextInt();
		 int su2= sc.nextInt();
		 
		 
		 //계산하기
		// int result  =calculator.addLG(su1, su2);	
		 int result  =calculator.addSM(su1, su2);		
		 System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		계산기프로그램2   p  = new 계산기프로그램2();
		p.run();

	}

}
