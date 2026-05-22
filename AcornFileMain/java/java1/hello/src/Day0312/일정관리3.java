package Day0312;

import java.util.Scanner;

public class 일정관리3 {
	static Scanner sc = new Scanner(System.in);
	static String[] 일정 = new String[5];
	static int index = 0;
	
	public static void 등록하기() {
		System.out.println("일정등록");
		String temp = sc.nextLine();
		일정[index] = temp;
		index++;
	}

	public static void 조회하기() {
		System.out.println("조회합니다");
		for(int i = 0 ; i< index; i++) {
			System.out.println(일정[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop:while(true) {
			System.out.println("1.등록 2.조회 3.종료");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1:
				//등록하기
				등록하기();
				break;
			case 2:
				//조회하기
				조회하기();
				break;
			case 3:
				//종료하기
				System.out.print("종료");
				break loop;
			default:
				System.out.println("잘못눌렀어요");
			}
		}
	}
}
