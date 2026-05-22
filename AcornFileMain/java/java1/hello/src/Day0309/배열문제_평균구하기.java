package Day0309;

public class 배열문제_평균구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//국어점수배열 5개 국어점수
		int[] kors = {100, 99, 85, 75, 88};
		
		//평균을 구하시오
		//1.반복
		//	-총합구하기
		//2.평균구하기
		
		int sum = 0;
		double avg;
		
		for(int i =0; i<kors.length; i++) {
			sum = sum + kors[i]; //0~4번 까지의 요소 5개값의 합계를 구할 수 있다
		}
		avg = sum/(double)kors.length;
		System.out.println(avg);
		
		
	}

}
