package Day0305;

import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5. 일정을 관리프로그램 만들기 (1번)
		//(1.등록, 2.조회, 3.변경, 4.삭제)
		Scanner sc = new Scanner(System.in);
		System.out.println("(1.등록, 2.조회, 3.변경, 4.삭제, 5.종료)");
		int menu = sc.nextInt();
		sc.nextLine();
		switch(menu) {
		case 1:
			System.out.println("등록해주세요");
			String a = sc.nextLine();
			System.out.println("등록: " + a);
			System.out.println("등록이 완료되었습니다");
			break;
		case 2:
			System.out.println("조회할게 없습니다");
			break;
		case 3:
			System.out.println("변경할게 없습니다");
			break;
		case 4:
			System.out.println("삭제할게 없습니다");
			break;
		default:
			System.out.println("잘못눌렀습니다");
		}
	}

}
