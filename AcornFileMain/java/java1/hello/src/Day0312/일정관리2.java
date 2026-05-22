package Day0312;

import java.util.Scanner;

public class 일정관리2 {
	public static int 등록하기(String[] 일정, int index, Scanner sc) {
		System.out.println("일정등록");
		String temp = sc.nextLine();
		일정[index] = temp;
		index++;
		return index;
	}
	public static void 출력하기(int index, String[] 일정) {
		System.out.println("조회합니다");
		for(int i = 0 ; i< index; i++) {
			System.out.println(일정[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] 일정 = new String[5];
		int index = 0;
		loop:while(true) {
			System.out.println("1.등록 2.조회 3.종료");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1:
				//등록하기
				index = 등록하기(일정, index, sc);
				break;
			case 2:
				//조회하기
				출력하기(index,일정);
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
