package Day0317;

import java.util.Scanner;

public class 학생관리2 {
	Student3[] list = new Student3[5];
	int index = 0;
	Scanner sc = new Scanner(System.in);
	
	//등록하기
	public void 등록하기() {
		System.out.println("등록");
		System.out.println("이름, 국어, 영어, 입력하시오");
		String name =sc.nextLine();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		
		Student3 s = new Student3(name, kor, eng);
		list[index] = s;
		index++;
	}
	//변경하기
	public void 변경하기() {
		
	}
	
	//조회하기
	public void 조회하기() {
		System.out.println("조회");
		for(int i = 0; i<index; i++) {
			System.out.println(list[i].toString());
		}
	}
	
	//삭제하기
	public void 삭제하기() {
		
	}
	
	public void 성적처리() {
		for(int i = 0; i<index; i++) {
			list[i].calcGrade();
		}
	}
	
	//실행하기
	public void run() { //반복문에서 메뉴제공 
		int menu;
		loop: while (true) {
			System.out.println("1.등록 2.조회 3. 변경, 4. 삭제 5. 종료");
			menu = sc.nextInt(); //키보에 입력을 하면 입력버퍼에 입력한 모든 내용이 저장이된다
								 //nextInt는 스페이스는, 엔터값은 읽어오지 않음
								 //엔터 비우기 
			sc.nextLine();
			switch (menu) {

			case 1:
//				System.out.println("등록");
				등록하기();
				break;
			case 2:
				//System.out.println("조회");
				조회하기();
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
			case 6: 
				성적처리();
				break;
			default:
				System.out.println("메뉴x");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		}
}
