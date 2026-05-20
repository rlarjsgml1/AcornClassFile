package day4prac.reflect;

/*
 * [공부 순서 3]
 * Class 객체를 얻는 방법 1: 클래스명.class
 *
 * Class 객체는 클래스의 설계도 정보를 담고 있는 객체이다.
 * 여기서는 Member.class로 Member 클래스의 정보를 얻는다.
 */
public class 객체생성하기2 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		
		// 1. Member 클래스 자체에서 클래스 정보를 얻는다.
		
		 // ? extends Object 
		//  ?
		 // Class<?> clazz  = Member.class;
		
		    Class  clazz  = Member.class;

		    // 2. Class 객체를 이용해서 기본 생성자로 객체를 만든다.
		    // newInstance()는 내부적으로 매개변수 없는 생성자를 호출한다.
		    Member  member  =  (Member)clazz.newInstance();
		    member.printSquare(3);
		    
		    
		
		
		  
	}

}
