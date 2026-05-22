package Day0323;

import java.util.ArrayList;
import java.util.Scanner;

public class 일정관리2 {
	
	//ArrayList<Day> days = new ArrayList<>();
	//Scanner sc = new Scanner(System.in);
	ArrayList<Day> days;
	Scanner sc;
	
	public 일정관리2() {
		days = new ArrayList<>();
		sc = new Scanner(System.in);
	}
	
	//등록하기
	public void register() {
		System.out.println("등록");
		String name = sc.nextLine();
		String time = sc.nextLine();
		
		Day day = new Day(name, time); //초기화
		days.add(day);
		
	}
	//변경하기
	public void update() {
		//지역변수임
		findAll();
		System.out.println("변경할 번호 선택");
		int index = sc.nextInt()-1;
		sc.nextLine();
		System.out.println("변경할 내용, 시간 입력");
		String name = sc.nextLine();
		String time = sc.nextLine();
		
		Day day = days.get(index);
		day.setName(name);
		day.setTime(time);
		System.out.println("변경완료");
		
	}
	//삭제하기
	public void delete() {
		findAll(); //전체조회 확인
		System.out.println("삭제할 번호 선택");
		int index = sc.nextInt() -1;
		days.remove(index);
		System.out.println("완료");
		
	}
	//전체조회
	public void findAll() {
		System.out.println("전체조회");
		for(int i= 0; i<days.size(); i++) {
			Day day = days.get(i);
			System.out.println((i+1) + day.toString()); //toString() 생량가능함
			//System.out.println(day);
		}
		
	}
	
	//메뉴반복 --시작점
	public void run() {
		loop : while(true) {
			System.out.println("1.등록 2.조회 3.변경 4.삭제 5종료");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1: 
				register();
				break;
			case 2:
				findAll();
				break;
			case 3:
				update();
				break;
			case 4:
				delete();
			case 5:
				break loop;
			default:
				System.out.println("메뉴 없음");
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		일정관리2 mgt = new 일정관리2();
		mgt.run();
	}

}
