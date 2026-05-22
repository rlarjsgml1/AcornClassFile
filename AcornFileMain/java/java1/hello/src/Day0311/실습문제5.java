package Day0311;

public class 실습문제5 {

	public static void number(int num) {
		for(int i = 1; i<=num; i++) { //i가 num만큼 증가 
			if(num % i ==0) { //i랑 num이 나눴을대 0이되는 조건
				System.out.print(i + " "); //조건이 맞을때 출력
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5. 수를 매개변수로 약수를 반환하는 함수 만들기
		number(6); //number(매개변수(num));
	}

}
