package Day0312;

public class 함수_지역변수 {
	public static int 더하기(int su1, int su2) {
		int sum;
		sum = su1 + su2;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두 수 더하기
		//main 변수 풀이
		int sum;
		int su1 = 10;
		int su2 = 5;
		sum = su1 + su2;
		System.out.println(sum);
		
		//함수(더하기) 활용
		int result = 더하기(5, 10);
		System.out.println(result);
		int result2 = 더하기(su1, su2);
		System.out.println(result2);
		
	}

}
