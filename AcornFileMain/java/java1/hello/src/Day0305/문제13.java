package Day0305;

import java.util.Scanner;

public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12.  주문수량, 메뉴를 입력받아
		//해당 주문의 주문금액을 출력하는 프로그램 작성하시오     
		//( 메뉴, 가격 임의로 정하기 )
		Scanner sc = new Scanner(System.in);
		
		loop:while(true) {
		System.out.println("menu(1.포카칩 2.깻입 3.토마토 4.두쫀쿠 5.오레오 6.종료를 선택해주세요");
		int menu = sc.nextInt();
		
		System.out.println("주문수량을 입력해주세요");
		int quantity = sc.nextInt();
		
		int pay = 0;
		
		switch(menu) {
		case 1:
			System.out.println("포카칩");
			pay = quantity * 1000;
			System.out.println("주문수량:" + pay);
			break;
		case 2:
			System.out.println("깻입");
			pay = quantity * 2000;
			System.out.println("주문수량:" + pay);
			break;
		case 3:
			System.out.println("토마토");
			pay = quantity * 3000;
			System.out.println("주문수량:" + pay);
			break;
		case 4:
			System.out.println("두쫀쿠");
			pay = quantity * 4000;
			System.out.println("주문수량:" + pay);
			break;
		case 5:
			System.out.println("오레오");
			pay = quantity * 5000;
			System.out.println("주문수량:" + pay);
			break;
		case 6:
			System.out.println("종료");
			break loop;
		default:
			System.out.println("선택한 menu가 없습니다");
		}
		}
		
	}

}
