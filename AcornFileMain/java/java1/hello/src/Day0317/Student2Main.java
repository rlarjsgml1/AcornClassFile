package Day0317;

public class Student2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s = new Student2("홍길동", 100, 90); //학생정보
		
		System.out.println(s.toString());
		System.out.println(s.getAvg());
		System.out.println(s.getName());
		System.out.println(s.getEng());
		System.out.println(s.getGrade());
		
		//국어점수 변경하기
		s.setKor(90);
		//s.eng = 75; => 객체지향방식이 아님 !!, 메서드를 통해서 객체의 값을 사용할 수 있도록 하기
		s.setEng(75);
		System.out.println(s.toString());
		
		s.calcAvg();
		s.calcGrade();
		
		System.out.println(s.toString());
	}

}
