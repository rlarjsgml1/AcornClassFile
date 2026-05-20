package day4prac.reflect;

/*
 * [공부 순서 5]
 * Class 객체를 얻는 방법 3: Class.forName("패키지명.클래스명")
 *
 * 문자열로 클래스 이름을 넘기면 런타임에 그 클래스 정보를 가져온다.
 * 설정 파일에서 클래스명을 읽어 교체 가능한 코드를 만들 때 자주 사용한다.
 */
public class 객체생성하기4 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		
		//Class<?>   clazz  = Class.forName("day4prac.reflect.Member");
		
		 // 1. 문자열로 Member 클래스 정보를 얻는다.
		 Class    clazz  = Class.forName("day4prac.reflect.Member");

		 // 2. 얻은 클래스 정보로 기본 생성자를 호출해 객체를 만든다.
		 Member m  = (Member) clazz.newInstance();
		
		 m.printSquare(10);
		 
		 
		
	}

}
