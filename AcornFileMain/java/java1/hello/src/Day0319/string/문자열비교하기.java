package Day0319.string;

import java.util.Arrays;

public class 문자열비교하기 {
	public static void main(String[] args) {
		String str = "apple";
		String str2 = "banana";
		
		//문자열의 비교 기준문자열.compareTo(비교대상 문자열)
		//반환 : 0 
		//		양수 => 기준문자열이 사전상 뒤에 위치함
		//		음수 => 기준문자열이 사전상 앞에 위치함
		
		int result = str.compareTo(str2); //기준이 앞에 있니? 뒤에 있니?
		
		System.out.println(result);
		
		//문자열 정렬
		//선택정렬
		String[] arr = {"banana", "apple", "tomato"};
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = i + 1; j< arr.length-1; j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//Arrays.sort(arr);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
