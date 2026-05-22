package Day0305;

import java.util.Scanner;

public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 2 3 0 => 6
		//입력되는 숫자가 0이면 더한값을 출력하고 종료
		
		Scanner sc = new Scanner(System.in);
		int input;
		int total=0;
		while(true) {
			//반드시 종료(탈출조건 명시)
			input = sc.nextInt();
			if(input==0)break;
			
			total += input; //total = total + input;
		}
		System.out.println(total);
	}

}
