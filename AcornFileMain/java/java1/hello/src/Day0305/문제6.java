package Day0305;

import java.util.Scanner;

public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6. 일정을 관리프로그램 만들기 (반복)
		//:5번,or  특정조건(숫자를 이용해서  0이나 99)
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("(1.등록, 2.조회, 3.변경, 4.삭제, 5.종료)");
			int menu = sc.nextInt();
			if(menu == 1) {
				System.out.println("등록");
			} else if(menu == 2) {
				System.out.println("조회");
			} else if(menu == 3) {
				System.out.println("변경");
			} else if(menu == 4) {
				System.out.println("삭제");
			} else if(menu == 5) {
				System.out.println("종료"); 
				break;
			} else {
				System.out.println("잘못입력했습니다");
			}
		}
	}

}
