package Day0311;

public class MyMath {

	public static int max( int a, int b) {
		return a>b?a:b;
	}
	public static int abs(int a) {
		if(a < 0) {
			return a*-1;
		}else {
			return a;
		}
	}
}
//static 메서드란 단순히 클래스에 소속된 메서드임을 알리는 키워드이다
//static 메서드 : 나는 클래스에 단순히 소속된 메서드야 !!!
//자바는 모든 메서드가 특정 클래스에 소속되어야 한다.
//사용법 : 클래스명, 메서드명()
