package Day0316;

import java.util.Scanner;

public class Bookinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("몇권을 입력하시겠습니까 ?");
		int input = sc.nextInt();
		sc.nextLine();
		Book[] books = new Book[input];
		int index = 0;
		loop:while(true) {
			System.out.println("1.등록 2.출력 3.종료");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				System.out.println("제목 입력: ");
				String title = sc.nextLine();
				System.out.println("내용: ");
				String auther = sc.nextLine();
				System.out.println("가격: ");
				int price = sc.nextInt();
				
				books[index] =new Book();
				books[index].입력하기(title,auther,price);
				index++;
				
				System.out.println("저장되었습니다");
				break;
			case 2:
				if(index == 0) {
					System.out.println("저장한 책이 없습니다");
				} else {
					int i = 0;
					while(i<index) {
						books[i].출력하기();
						i++;
					}
				}
				break;
			case 3:
				System.out.println("종료");
				break loop;
			default:
				System.out.println("다시 입력해주세요");
			}
		}

	}

}
