package Day0316.접근제한자2;

import Day0316.접근제한자.A;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day0316.접근제한자.A a = new Day0316.접근제한자.A();
						//Day0313.접근제한자.A
		A b = new A(); //A 클래스이름은 패키지를 포함된다.
		
		//같은패키지라면 패키지명 생략가능
		//다른패키지라면 직접명시하거나 import를 해야함
		
		

	}

}
