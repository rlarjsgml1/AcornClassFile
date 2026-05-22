package Day0316.접근제한자2;

import Day0316.접근제한자.A;

public class Other2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스이름 => 패키지를 포함한다.
		//다른패키지의 클래스를 사용하고 싶을 때
		//패키지 전체를 명시하는 방법
		// import하는 방법
		
		Day0316.접근제한자.A b = new Day0316.접근제한자.A();
		A a = new A();
		
		//a.a=5; private
		a.b = 10; //public 접근이 가능
		//a.c =10; //default 같은 패키지에서만 접근 가능하기 때문에 지금은 접근불가
	}

}
