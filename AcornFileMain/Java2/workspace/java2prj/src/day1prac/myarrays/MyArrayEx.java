package day1prac.myarrays;

import java.util.Arrays;

public class MyArrayEx {

	public static void main(String[] args) {
		// 정렬할 Acorn 객체들을 만든다.
		Acorn a = new Acorn("T1", "장해든", 23) ;
		Acorn b = new Acorn("T2", "박세인", 24) ;
		Acorn c = new Acorn("T3", "김건희", 25) ;

		// 만든 객체들을 배열에 담는다.
		Acorn[] list = {a,b,c};
		
		// Acorn이 MyComparable을 구현했기 때문에 MyArrays.sort()로 정렬할 수 있다.
		MyArrays.sort(list);
		
		/*
		 Acorn이 MyComparable을 구현하지 않으면 아래와 같은 형변환 오류가 발생한다.
		 ClassCastException: Acorn cannot be cast to MyComparable
		 */
		
		// 정렬된 배열을 출력한다.
		System.out.println(Arrays.toString(list));
	}

}
