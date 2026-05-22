package Day0306;

import java.util.Scanner;

public class 제어문_break2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메누입력받아서 출력하기
		Scanner sc = new Scanner(System.in);
		loop:while(true) {
			System.out.println("메뉴를 입력하세요");// 1.입력 2.조회 3.변경 4.종료
			int menu = sc.nextInt();
			
			
			switch(menu) {
			case 1: 
				System.out.println("입력");
				break;
			case 2:
				System.out.println("조회");
				break;
			case 3:
				System.out.println("변경");
				break;
			case 4:
				System.out.println("종료");
				break loop;
			default:
				System.out.println("잘못눌렀어요");
				
			}
		}
	}

}
