package day1prac.myarrays;

import java.util.Arrays;

public class AcornSort {
	
	public static void main(String[] args) {
		
		// 정렬할 Acorn 객체 3개를 만든다.
		Acorn a = new Acorn("T1", "장해든", 23) ;
		Acorn b = new Acorn("T2", "박세인", 24) ;
		Acorn c = new Acorn("T3", "김건희", 25) ;

		// 객체들을 배열에 담는다.
		Acorn[] list = {a,b,c};
		
		/*
		 Arrays.sort(list)는 Java의 Comparable 기준이 있어야 사용할 수 있다.
		 지금 Acorn은 우리가 만든 MyComparable을 구현했으므로 MyArrays.sort(list)를 사용한다.
		 */
		
		// 우리가 만든 정렬 기능으로 Acorn 배열을 정렬한다.
		MyArrays.sort(list);

		// 정렬된 결과를 배열 형태로 출력한다.
		System.out.println(Arrays.toString(list));
	}

}
