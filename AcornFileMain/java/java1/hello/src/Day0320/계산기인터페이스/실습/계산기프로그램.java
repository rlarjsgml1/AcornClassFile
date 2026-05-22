package Day0320.계산기인터페이스.실습;

import java.util.Scanner;

public class 계산기프로그램 {
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner( System.in);		
		
		System.out.println(" 두 수를 입력하시오 ");
		
		int su1= sc.nextInt();
		int su2= sc.nextInt();		
		//Calculator cal  = new LGCalculator();		
		//Calculator cal  = new WJYCalculator();
		Calculator cal  = new SMCalculator();
		int result  =cal.add(su1, su2);
		System.out.println(result);
		
		

	}

}
