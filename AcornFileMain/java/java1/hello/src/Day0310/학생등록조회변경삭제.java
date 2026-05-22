package Day0310;

import java.util.Scanner;

public class 학생등록조회변경삭제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] names = new String[5];
		int index = 0;

		loop: while (true) {
			System.out.println("1.등록 2.조회 3.변경 4.삭제 5.종료");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				if (index >= names.length) {
					System.out.println("더 이상 등록할 수 없습니다");
					break;
				}

				System.out.println("등록: 이름 입력해주세요");
				String name = sc.nextLine();
				names[index] = name;
				index++;
				System.out.println("등록 되었습니다");
				break;

			case 2:
				System.out.println("조회");
				if (index == 0) {
					System.out.println("등록된 학생이 없습니다");
				} else {
					for (int i = 0; i < index; i++) {
						System.out.println((i + 1) + ". " + names[i]);
					}
				}
				break;

			case 3:
				if (index == 0) {
					System.out.println("변경할 학생이 없습니다");
					break;
				}

				// 전체조회
				for (int i = 0; i < index; i++) {
					System.out.println((i + 1) + ". " + names[i]);
				}

				System.out.println("변경할 학생번호 입력:");
				int updateNo = sc.nextInt();
				sc.nextLine();

				if (updateNo < 1 || updateNo > index) {
					System.out.println("없는 학생번호입니다");
					break;
				}

				System.out.println("변경할 이름 입력");
				String newName = sc.nextLine();
				names[updateNo - 1] = newName;

				System.out.println("변경이완료되어있습니다");

				for (int i = 0; i < index; i++) {
					System.out.println((i + 1) + ". " + names[i]);
				}

				break;

			case 4:
				System.out.println("삭제");

				if (index == 0) {
					System.out.println("삭제할 학생이 없습니다");
					break;
				}

				// 전체 조회 학생번호, 이름
				for (int i = 0; i < index; i++) {
					System.out.println((i + 1) + ". " + names[i]);
				}

				// 삭제할 번호:
				System.out.println("삭제할 번호 입력:");
				int deletNo = sc.nextInt();
				sc.nextLine();

				if (deletNo < 1 || deletNo > index) {
					System.out.println("없는 학생번호입니다");
					break;
				}

				// 뒤의 값을 한 칸씩 앞으로 당기기
				for (int i = deletNo - 1; i < index - 1; i++) {
					names[i] = names[i + 1];
				}

				// 마지막 칸 비우기
				names[index - 1] = null;
				index = index - 1;

				System.out.println("삭제되었습니다");

				// 전체조회하기
				for (int i = 0; i < index; i++) {
					System.out.println((i + 1) + ". " + names[i]);
				}
				break;

			case 5:
				System.out.println("종료");
				break loop;

			default:
				System.out.println("잘못눌렀어요");
			}
		}

		sc.close();
	}
}