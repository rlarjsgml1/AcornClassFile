package day4prac.reflect;

import java.lang.reflect.Method;

/*
 * [공부 순서 8]
 * 클래스가 가진 메서드 정보 목록 가져오기
 *
 * getDeclaredMethods()는 해당 클래스에 선언된 메서드들을 Method 배열로 돌려준다.
 * 여기서는 Member 클래스 안에 있는 getter/setter, printInfo, printSquare 등을 확인한다.
 */
public class 매서드정보가져오기 {

	public static void main(String[] args) throws ClassNotFoundException {
		 // 1. 분석할 클래스 정보를 얻는다.
		 Class   clazz  = Class.forName("day4prac.reflect.Member");
		 
		 // 2. Member 클래스에 선언된 모든 메서드 정보를 가져온다.
		 Method[]  methods  = clazz.getDeclaredMethods();
		 
		 
		 
		 // 3. Method 객체에서 메서드 이름을 꺼내 출력한다.
		 for( Method  method : methods) {
			 
			 System.out.println( method.getName());
		 }
		 

	}

}
