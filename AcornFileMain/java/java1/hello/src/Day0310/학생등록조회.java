package Day0310;

import java.util.Scanner;

public class 학생등록조회 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메뉴만 잘 동작하는지 확인하기
		
		String[] names = new String[5];
		int index =0; 
		Scanner sc = new Scanner(System.in);
		loop: while (true) {
			System.out.println("1.등록 2.조회 3.종료");
			int menu = sc.nextInt(); // 1.등록 2.조회 3.종료
			sc.nextLine(); //남아 있는 엔터값 비우기
			switch (menu) {
			case 1:
				System.out.println("등록 : 이름을 입력하시오");
				String name = sc.nextLine();
				names[index] = name;
				index++;
				break;
			case 2:
				System.out.println("조회: ");
				for(int i = 0; i< index; i++) {
					System.out.println(names[i]);
				}
				break;
			case 3:
				System.out.println("종료");
				break loop;
			default:
				System.out.println("메뉴 없습니다");
			}
		}
	}

}
