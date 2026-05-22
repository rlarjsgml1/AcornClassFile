package Day0316.접근제한자;

public class A {
	private int a; //내클래스에서만 내 멤버들만 사용가능하다
	public int b; //어디서든지 접근가능
	int c; //default(같은 패키지에서 접근 가능 하다) : 같은 폴더안에 있는 것끼리 접근 가능 
	
}
