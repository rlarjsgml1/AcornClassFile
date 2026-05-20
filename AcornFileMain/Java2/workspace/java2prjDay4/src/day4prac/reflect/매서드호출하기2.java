package day4prac.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * [공부 순서 10]
 * 매개변수가 있는 생성자와 매개변수가 있는 메서드 호출하기
 *
 * 생성자나 메서드에 매개변수가 있으면 정보를 찾을 때 타입을 같이 알려 줘야 한다.
 * 예: getDeclaredConstructor(String.class, String.class)
 * 예: getDeclaredMethod("printSquare", int.class)
 */
public class 매서드호출하기2 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		 // 1. Member 클래스 정보를 얻는다.
		 Class   clazz  = Class.forName("day4prac.reflect.Member");

		 // 2. String, String 매개변수를 받는 생성자 정보를 얻는다.
		 Constructor  c  =  clazz.getDeclaredConstructor(String.class , String.class);

		 // 3. 생성자 호출 시 실제 인자값을 넘겨 Member 객체를 만든다.
		 Member m  =(Member)c.newInstance("victoai", "1234");
		 
		 
		 
		 //printInfo		 
		 //printSquare
		 
		// 4. 매개변수 없는 printInfo() 정보를 얻고 호출한다.
		Method  method  =  clazz.getDeclaredMethod("printInfo");
		
		
		// method 변수는 printInfo 메서드의 정보를 가진 객체이다.
		
		// invoke로 m.printInfo()를 실행한다.
		method.invoke( m);
		
		
		// 5. int 매개변수 하나를 받는 printSquare(int) 메서드 정보를 얻는다.
		Method   method2= clazz.getDeclaredMethod("printSquare", int.class);
		 
		// 6. invoke의 두 번째 인자부터는 실제 메서드에 전달할 값이다.
		// 아래 코드는 m.printSquare(7)과 같은 의미이다.
		method2.invoke(m,  7 );
		
		
		
		

	}

}
