package Day0305;

public class 연산자_증강연산자_10까지합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while 구하기1~10
		//1 2 3 4 5 6 7 8 9 10 =>순번
		//1 2 3 4 5 6 7 8 9 10 => 수(항)
		
		//처리 : n:항이자 반복제어 변수
		//출력 : 항의 합계 : sum
		
		int n = 0;
		int sum = 0;
		
		while(n++<10) { //조건이 true(참)일 동안 반복 //n = 0 10
			
			sum = sum+n;
		}
		System.out.println(sum);
	}
}
