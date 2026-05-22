package Day0317.스태틱객체메서드;

public class AMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//스태틱메서드 사용법
		A.메서드1();
		int result = Math.abs(-2);
		System.out.println(result);
		
		double result2 = Math.random(); //클래스명.메서드(작성)
		System.out.println(result2);
	}

}
