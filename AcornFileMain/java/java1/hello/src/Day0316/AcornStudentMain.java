package Day0316;

public class AcornStudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcornStudent김건희 s = new AcornStudent김건희();
		
		//입력하기
		s.입력하기("김건희", 10, 1000, 1500, 20,10);
		//출력하기
		s.정보출력하기();
		
		s.밥먹기();
		
		s.운동하기();
		
		s.정보출력하기();
		
		s.클라이밍하기();
		//s.자바능력 = 500000; private 외부 접근 막고 정해진방법으로만 자바능력치가 올라가게 하겠다.
		
		s.헬스하기();
		
		s.복싱하기();
		
		s.웃는다();
		
		s.정보출력하기();
	}

}
