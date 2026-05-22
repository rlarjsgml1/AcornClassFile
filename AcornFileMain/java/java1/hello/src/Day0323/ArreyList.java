package Day0323;

import java.util.ArrayList;

public class ArreyList {
	public static void main(String[] args) {
		
		// 일정을 저장할 수 있는 변수를 만들어 보세요
		Day day;
		day=new Day("자바 공부하기","오후 8시"); // 생성자 new 할 때 단 한번
		
		//일정 조회하기
		System.out.println(day);
		System.out.println(day.toString());

		//일정변경
		day.setName("자바인터페이스 공부하기");
		day.setTime("오후 8시 30");
		
		System.out.println(day.toString());
		
		//일정 여러개
		//순서,중복허용
		//가변길이배열처럼 사용하면 됨
		//add, get(index), remove
		ArrayList<Day> days = new ArrayList<>(); //기본생성자 제공
		
		//등록하기
		Day day1 = new Day("myArrays 연습 1억 코드", "오후 8시");
		days.add(day1);
		
		Day day2 = new Day("운동", "오후 8시");
		days.add(day2);
		
		//조회하기
		for(int i =0; i<days.size(); i++) {
			Day item = days.get(i);
			System.out.println(item);
		} //days 크기만큼 출력해달라는 코드
		
		//변경하기
		Day updateDay = days.get(1);
		updateDay.setName("필라테스 운동");
		updateDay.setTime("오후 9시 30분");
		
		for(int i =0; i<days.size(); i++) {
			Day item = days.get(i);
			System.out.println(item);
		} //days 크기만큼 출력해달라는 코드
		
		//삭제
		days.remove(1);
		
		for(int i =0; i<days.size(); i++) {
			Day item = days.get(i);
			System.out.println(item);
		} //days 크기만큼 출력해달라는 코드
	}
}
