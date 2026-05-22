package Day0320.라이브러리;

import java.util.Scanner;

public class 이현겸Imp implements TeacherCodeRun{

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void codeRun() {
		System.out.println("단 입력하세요");
		int dan = sc.nextInt();
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		
	}
	
}
