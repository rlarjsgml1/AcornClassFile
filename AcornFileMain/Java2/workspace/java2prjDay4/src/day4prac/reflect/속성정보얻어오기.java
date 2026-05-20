package day4prac.reflect;

import java.lang.reflect.Field;

/*
 * [공부 순서 11]
 * 클래스가 가진 필드 정보 가져오기
 *
 * Field는 클래스의 멤버 변수 정보를 표현한다.
 * Member 클래스에는 id, pw 필드가 있으므로 두 필드 정보가 출력된다.
 */
public class 속성정보얻어오기 {

	public static void main(String[] args) throws ClassNotFoundException {
		 // 1. 분석할 클래스 정보를 얻는다.
		 Class   clazz  = Class.forName("day4prac.reflect.Member");

		 // 2. Member 클래스에 선언된 필드 정보를 모두 가져온다.
		 Field[]   fields  = clazz.getDeclaredFields();
		 

		 // 3. Field 객체를 출력하면 접근제어자, 타입, 패키지명, 필드명이 함께 보인다.
		 for(  Field field  : fields) {
			 System.out.println(field);
		 }
		 
		 
		 
	}

}
