package Day0317;

import java.util.Scanner;

public class 학생관리0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복으로 메뉴처리하기
		// 반복으로 메뉴처리하기
		Scanner sc = new Scanner(System.in);
		int menu;
		loop: while (true) {
			System.out.println("1.등록 2.조회 3. 변경, 4. 삭제 5. 종료");
			menu = sc.nextInt();
			switch (menu) {

			case 1:
				System.out.println("등록");
				break;
			case 2:
				System.out.println("조회");
				break;
			case 3:
				System.out.println("변경");
				break;
			case 4:
				System.out.println("삭제");
				break;
			case 5:
				System.out.println("종료");
				break loop;
			default:
				System.out.println("메뉴x");
			}
		}
	}
}
