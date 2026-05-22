package Day0306;

public class 손영석매운맛6_분모구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) 반복문으로 항구하기1~항의 순번까지 곱)
		//2) 이전항ㅇ을 이용하는 방법(이전항 + 항의 순번) :2번째 항 부터 구하기
		
		//2)풀이
		
		int sum =1;
		int a =1;
		
		for(int i=2; i<=5; i++) {
			a= a*i;
			sum = sum +a;
		}
	}

}
