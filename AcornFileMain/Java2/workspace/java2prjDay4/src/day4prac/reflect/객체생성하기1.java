package day4prac.reflect;

/*
 * [공부 순서 2]
 * 가장 기본적인 객체 생성 방법: new
 *
 * 리플렉션을 배우기 전에 평소 객체 생성 방식과 비교하기 위한 예제이다.
 */
public class 객체생성하기1 {

	public static void main(String[] args) {
		// 1. 매개변수가 없는 기본 생성자를 직접 호출한다.
		 Member m  = new Member();
		 
		 System.out.println(m);
		 
		 // 2. 매개변수가 있는 생성자를 직접 호출한다.
		 Member m2  =new Member("victoai", "1234");
		 System.out.println(m2);
		 

	}

}
