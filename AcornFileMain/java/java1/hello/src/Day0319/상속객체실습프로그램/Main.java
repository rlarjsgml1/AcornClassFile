package Day0319.상속객체실습프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Member> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	static int nextId = 1;

	public static void main(String[] args) {

		// 업캐스팅 (Upcasting)
		// PremiumMember → Member 타입으로 자동 변환 (묵시적)
		// 자식 객체를 부모 타입 변수에 담는 것
		Member m1 = new PremiumMember(nextId++, "이영희", 28, "010-5555-6666", 15);
		Member m2 = new PremiumMember(nextId++, "박민준", 35, "010-7777-8888", 20);

		list.add(new Member(nextId++, "홍길동", 25, "010-1111-2222", "일반"));
		list.add(new Member(nextId++, "김철수", 30, "010-3333-4444", "일반"));
		list.add(m1); // Member 타입이지만 실제론 PremiumMember
		list.add(m2);

		while (true) {
			System.out.println("\n========= 회원 관리 시스템 =========");
			System.out.println("1. 전체 목록");
			System.out.println("2. 회원 추가");
			System.out.println("3. 회원 검색");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 프리미엄 할인율 조회 (다운캐스팅 예시)");
			System.out.println("0. 종료");
			System.out.print("선택 >> ");
			String input = sc.nextLine();

			if (input.equals("1"))
				printAll();
			else if (input.equals("2"))
				addMember();
			else if (input.equals("3"))
				searchMember();
			else if (input.equals("4"))
				deleteMember();
			else if (input.equals("5"))
				showDiscount();
			else if (input.equals("0")) {
				System.out.println("종료합니다.");
				break;
			} else
				System.out.println("잘못된 입력입니다.");
		}
	}

	// 전체 목록 출력
	static void printAll() {
		System.out.println("---------- 전체 회원 " + list.size() + "명 ----------");
		for (Member m : list) {
			m.printInfo(); // 다형성: 타입에 따라 오버라이딩된 메서드 호출
		}
	}

	// 다운캐스팅 (Downcasting)
	// Member → PremiumMember 타입으로 명시적 변환 (강제 캐스팅)
	// 업캐스팅된 객체를 다시 자식 타입으로 되돌려서 자식만의 기능 사용
	static void showDiscount() {
		System.out.println("---------- 프리미엄 회원 할인율 ----------");
		for (Member m : list) {

			// instanceof: 실제 객체가 PremiumMember인지 확인 후 다운캐스팅
			if (m instanceof PremiumMember) {
				PremiumMember pm = (PremiumMember) m; // 다운캐스팅
				// discountRate는 PremiumMember에만 있는 필드
				// Member 타입으로는 접근 불가 → 다운캐스팅 필요!
				System.out.println(pm.name + " → 할인율: " + pm.discountRate + "%");
			}
		}
	}

	// 회원 추가
	static void addMember() {
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("나이: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("전화: ");
		String phone = sc.nextLine();
		System.out.print("등급 (1:일반 / 2:프리미엄): ");
		String g = sc.nextLine();

		if (g.equals("2")) {
			System.out.print("할인율(%): ");
			int rate = Integer.parseInt(sc.nextLine());
			// 업캐스팅: PremiumMember를 Member 타입 list에 추가
			list.add(new PremiumMember(nextId++, name, age, phone, rate));
		} else {
			list.add(new Member(nextId++, name, age, phone, "일반"));
		}
		System.out.println(">> 등록 완료!");
	}

	// 이름으로 검색
	static void searchMember() {
		System.out.print("검색할 이름: ");
		String keyword = sc.nextLine();
		boolean found = false;
		for (Member m : list) {
			if (m.name.contains(keyword)) {
				m.printInfo();
				found = true;
			}
		}
		if (!found)
			System.out.println("검색 결과 없음.");
	}

	// ID로 삭제
	static void deleteMember() {
		System.out.print("삭제할 회원 ID: ");
		int id = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).id == id) {
				System.out.println(">> " + list.get(i).name + " 삭제 완료!");
				list.remove(i);
				return;
			}
		}
		System.out.println("해당 ID 없음.");
	}
}
