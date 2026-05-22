package Day0317;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체변수만들기
		Student s; //Student type의변수(객체라고 한다)의 정보를 저장할 참조형변수 선언
		s = new Student("김건희", 75, 75); //매개변수 있는 생성자를 사용한다(생성된 객체, 즉 변수에 값 넣기)
//		Student s2 = new Student();
		
		System.out.print(s.toString());
//		System.out.print(s2.toString());
		
//		s.avg = (s.eng + s.kor) /2.0; => 메서드를 통해서 평균이 구해져서 한다
		s.calcAvg();
		s.calcGrade();
		
		System.out.println(s.toString());
		
	}

}
