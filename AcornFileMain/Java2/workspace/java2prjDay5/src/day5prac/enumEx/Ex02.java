package day5prac.enumEx;

public class Ex02 {
	
	public static void main(String[] args) {
		int day;
		
//		day = 1;
		
		//요일 상수로 다루기
		day = DAY.MONDAY; //가독성 올라감
		day = 210000; //요일 정보가 아닌 다른 값이 들어가는 것을 막을 수 없음
		
		//enum(일요일 ~ 토요일 정보 나타내기)
		
		
		
		//enum으로 다루기
		DAYEnum day2 = null;
		day2 = DAYEnum.FRIDAY; //가독성, 안전성
		
		for(DAYEnum d : DAYEnum.values()) {
			System.out.println(d);
			System.out.println(d.name());
			System.out.println(d.ordinal());
		}
		
	}

}
