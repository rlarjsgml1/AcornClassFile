package day4prac.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * [공부 순서 9]
 * 매개변수가 없는 메서드를 리플렉션으로 호출하기
 *
 * Method 객체는 "메서드 정보"일 뿐이라 그 자체로 실행되지 않는다.
 * 실제 실행은 method.invoke(호출할 객체) 형태로 한다.
 */
public class 매서드호출하기 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		 // 1. Member 클래스 정보를 얻는다.
		 Class   clazz  = Class.forName("day4prac.reflect.Member");

		 // 2. 기본 생성자 정보를 얻고, Member 객체를 만든다.
		 Constructor  c  =  clazz.getDeclaredConstructor();
		 Member m  =(Member)c.newInstance();
		 
		 
		 
		 //printInfo		 
		 //printSquare
		 
		// 3. printInfo라는 이름의 메서드 정보를 얻는다.
		Method  method  =  clazz.getDeclaredMethod("printInfo");
		
		
		// method 변수는 printInfo 메서드의 정보를 가진 객체이다.
		
		// 4. invoke로 m 객체의 printInfo()를 실제 호출한다.
		method.invoke( m);
		
		
		
		
		
		

	}

}
