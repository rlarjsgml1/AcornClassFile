package day1prac.myarrays;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		// 기본 자료형 배열과 문자열 배열을 준비한다.
		int[] kors = { 90, 80, 55, 78 };
		String[] names = { "장해든", "박세인", "김건희" };
		
		// Arrays.sort()는 배열을 오름차순으로 정렬한다.
		Arrays.sort(kors);
		Arrays.sort(names);
		
		// Arrays.toString()은 배열 내용을 보기 좋게 문자열로 바꿔준다.
		System.out.println(Arrays.toString(kors));
		System.out.println(Arrays.toString(names));
	}

}
