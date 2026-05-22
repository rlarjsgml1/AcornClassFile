package Day0319.상속객체실습프로그램;

import java.util.Scanner;

import Day0319.상속객체실습프로그램.Food;
import Day0319.상속객체실습프로그램.Product;

public class Main2 { // new 학생관리3() => 해야지만 데이터, 기능을 사용할 수 있다

	Product[] product1 = new Product[4];
	Food food = new Food();
	int index = 0;
	Scanner sc = new Scanner(System.in);

	// 등록하기
	public void 등록하기() {
		System.out.println("등록");
		System.out.print("상품명 입력: ");
		String name = sc.nextLine();

		System.out.print("가격 입력: ");
		int price = sc.nextInt();
		sc.nextLine();

		System.out.print("재고 입력: ");
		int stock = sc.nextInt();
		sc.nextLine();

		System.out.print("유통기한 입력: ");
		String date = sc.nextLine();
		product1[index] = new Food(name, price, stock, date);
		index++;
		System.out.println("등록 완료 되었습니다.");
	}

	// 변경하기
	public void 변경하기() {
		조회하기();
		System.out.println("수정할 상품 번호 입력");
		int updateIndex = sc.nextInt();
		updateIndex = updateIndex - 1; // 배열의 index가 0부터 시작 1 => 0
		System.out.println("재고 수정해주세요~");
		int newNum = sc.nextInt();
		// Product p = product1[updateIndex];
		// p.setStock(newNum);
		product1[updateIndex].stock = newNum;
		System.out.println("변경되었습니다");

	}

	// 조회하기
	public void 조회하기() {
		System.out.println("조회");
		for (int i = 0; i < product1.length; i++) {
			if (product1[i] == null) {
				System.out.print((i + 1) + "번: 비어있음");
			} else {
				System.out.print((i + 1) + "번: ");
				System.out.print("상품명 " + product1[i].name + "  가격 " + product1[i].price + "  재고 " + product1[i].stock);
				if (product1[i] instanceof Food) {
					Food foodDate = (Food) product1[i];
					System.out.print("  유통기한 " + foodDate.date);
				}
			}
			System.out.println();
		}
	}

	// 삭제하기
	public void 삭제하기() {

		System.out.println("삭제할 상품 번호 입력");
		int deleteIndex = sc.nextInt();
		deleteIndex = deleteIndex - 1;

		// 뒤에 있는 요소들을 앞으로 한 칸씩 이동
		for (int i = deleteIndex; i < index - 1; i++) {
			product1[i] = product1[i + 1];
		}

		// 마지막 값 비우기
		product1[index - 1] = null;

		// 개수 감소
		index--;

		System.out.println("삭제 완료!");
	}

	// 성적처리하기
	private void 성적처리하기() {
		for (int i = 0; i < index; i++) {
			// list[i].calcGrade();
		}
	}

	// 실행하기
	public void run() { // 반복문에서 메뉴제공
		int menu;
		loop: while (true) {
			System.out.println("1. 상품 등록     2. 재고 수정      3. 상품 조회      4. 상품 삭제       5. 종료");
			menu = sc.nextInt(); // 키보드에 입력을 하면 입력버퍼에 입력한 모든 내용이 저장됨
									// nextInt는 스페이스, 엔터값은 읽어오지 않는다, 입력버퍼에 엔터가 남아 있다
									// 엔터비우기
			sc.nextLine();

			switch (menu) {

			case 1:
				// System.out.println("등록");
				등록하기();
				break;
			case 2:
				// System.out.println("조회");
				변경하기();
				break;
			case 3:
				// System.out.println("변경");
				조회하기();
				break;
			case 4:
				삭제하기();
				break;
			case 5:
				System.out.println("종료");
				break loop;

			default:
				System.out.println("메뉴x");
			}

		}
	}

	public static void main(String[] args) {
		Main2 a = new Main2();
		a.run();

	}

}
