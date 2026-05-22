package Day0309;

public class 배열1차원_실수형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr= new double[5];
		
		arr[0] = 1.5;
		arr[1] = 1.1;
		arr[2] = 1.2;
		arr[3] = 1.3;
		arr[4] = 1.9;
		
		//1. 출력하기
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//2.반복문 출력하기
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//배열선언 및 초기화
		double[] arr2 = new double[] {1.3, 1.5, 1.2, 1.3, 1.6};
		//출력
		for(int i = 0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		//배열선언 및 초기화
		double[] arr3 = {2.0, 2.9, 2.8, 2.7, 2.1};
		//출력
		for(int i = 0; i< arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}

}
