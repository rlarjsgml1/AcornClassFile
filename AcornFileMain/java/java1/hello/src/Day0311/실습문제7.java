package Day0311;

public class 실습문제7 {

	public static double avgNum(int[] arr) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i]; //sum = sum + arr[i]
		}
		double result = (double)sum / arr.length;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7. 수목록(배열)을 주면 평균을 반환하는 함수 만들기
		int[] arr = {55, 80, 90, 30};
		
		double result = avgNum(arr);
		System.out.print(result);
	}

}
