package day4prac.reflect;

/*
 * [공부 순서 4]
 * Class 객체를 얻는 방법 2: 객체.getClass()
 *
 * 이미 만들어진 객체가 있을 때, 그 객체가 어떤 클래스로 만들어졌는지
 * getClass()로 확인할 수 있다.
 */
public class 객체생성하기3 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		// 1. 먼저 일반적인 방식으로 Member 객체를 만든다.
		Member m  = new Member();		

		// 2. 만들어진 객체에서 클래스 정보를 얻는다.
		Class  clazz  = m.getClass();

		// 3. 얻어 온 클래스 정보로 새 객체를 다시 만든다.
		Member m2 = (Member)clazz.newInstance();
		
		m2.printSquare(3);
		
		

	}

}
