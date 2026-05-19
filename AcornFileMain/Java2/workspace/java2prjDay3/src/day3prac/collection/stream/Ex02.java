package day3prac.collection.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Ex02 {
	public static void main(String[] args) {
		int[] arr = { 10, 15, 20, 35, 12 };
		// 1.합계 구하기
		Arrays.stream(arr);
		IntStream is = Arrays.stream(arr);
		int result = is.sum();
		System.out.println(result);

		// 2. 짝수의 합계 구하기
		is = Arrays.stream(arr);
		int sumResult = is.filter(item -> item % 2 == 0).sum();
		System.out.println(sumResult);

		// 3. 전체 개수 구하기
		is = Arrays.stream(arr);
		long countResult = is.count();
		System.out.println(countResult);

		// 4.짝수 개 구하기

		// 스트림을 이용해서 구하기
		is = Arrays.stream(arr);
		long count2 = is.filter(n->n%2==0).count();
		System.out.println(count2);
		// 스트림을 사용하지 않고 구하기
		int eventCount = 0;
		for(int i = 0; i<arr.length; i++) {
			int num = arr[i];
			if(num%2 ==0) {
				eventCount++;
			}
		}
		System.out.println(eventCount);
		
		//5.통계 구하기
		is = Arrays.stream(arr);
		IntSummaryStatistics summary = is.summaryStatistics();
		System.out.println(summary);

	}
}
