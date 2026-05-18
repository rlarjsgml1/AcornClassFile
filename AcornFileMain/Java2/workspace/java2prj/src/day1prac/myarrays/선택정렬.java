package day1prac.myarrays;

import java.util.Arrays;

public class 선택정렬 {

	public static void main(String[] args) {
		// 정렬할 숫자 배열과 문자열 배열을 준비한다.
		int[] kors = { 90, 80, 55, 78 };
		String[] names = { "장해든", "박세인", "김건희" };

		// 선택정렬: 왼쪽부터 작은 값을 채워 넣는 방식
		for (int i = 0; i < kors.length; i++) { // 기준
			for (int j = i + 1; j < kors.length; j++) { // 비교
				if (kors[i] > kors[j]) {// 오름차순
					// 두 값을 바꿀 때는 임시변수가 필요하다.
					int tmp;
					tmp = kors[i];
					kors[i] = kors[j];
					kors[j] = tmp;
				}
			}
		}

		// 숫자 배열 정렬 결과 출력
		System.out.println(Arrays.toString(kors));

		// 문자열도 compareTo() 결과를 기준으로 오름차순 정렬한다.
		for (int i = 0; i < names.length - 1; i++) {
			for (int j = i + 1; j < names.length; j++) {
				
				//기준 		  	 비교
				//객체.compareTo(문자열)
				if (names[i].compareTo(names[j]) > 0) { // 기준이 크면 양수, 기준이 작으면 음수 반환함
					String tmp = names[i];
					names[i] = names[j];
					names[j] = tmp;
				}
			}

		}
		// 문자열 배열 정렬 결과 출력
		System.out.println(Arrays.toString(names));
	}
}
