	package Day0316.접근제한자;

public class Other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A(); //A type(A class)로 객체만들기 => 변수만들기
		//a.a = 10; private 외부에서
		a.b = 10; //public 외부에서 ok
		a.c = 5; //default (A와 Other)은 같은 폴더, 즉 같은 패키지이므로 접근가능 
		
		
		
	}

}
