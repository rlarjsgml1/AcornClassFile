package day4prac.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * [공부 순서 6]
 * Constructor 정보를 이용해서 객체 생성하기
 *
 * 객체를 바로 new 하지 않고,
 * 1. 클래스 정보를 얻고
 * 2. 생성자 정보를 얻고
 * 3. 생성자 정보의 newInstance()로 객체를 만든다.
 */
public class 객체생성하기5 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		 // 1. 클래스 이름 문자열로 Class 객체를 얻는다.
		 Class   clazz  = Class.forName("day4prac.reflect.Member");

		 // 2. 매개변수가 없는 기본 생성자 정보를 얻는다.
		 Constructor  c = clazz.getDeclaredConstructor( );
		 
		 // 3. Constructor 객체로 실제 Member 객체를 생성한다.
		 Member m  = (Member)c.newInstance( );
		 m.printInfo();
		 m.printSquare(2);

	}

}
