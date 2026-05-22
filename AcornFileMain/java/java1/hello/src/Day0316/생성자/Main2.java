package Day0316.생성자;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcornStudent2 s; //참조형변수선언
		s = new AcornStudent2("나해수공주", 500, 10, 30, 100); //매개변수가 있는 생성자를 사용해보기
		s.정보출력하기();
		s.배열공부하기();
		s.밥먹기();
		s.정보출력하기();
		
		//생성자의 필요성 느끼나요??
	}

}
