package Day0311;

public class 함수구하기10_메소드로만들기 {
	/*
	 기능 : 1~10까지 합
	 매개변수(입력): x 
	 반환 :  10까지의 합
	 */
	public static int getTenTotal() {
		int sum = 0;
		for(int i =1; i<=10; i++) {
			sum +=i;
		}
		return sum;
	}
	private static int 합구하기10() {
		int sum = 0;
		for(int i =1; i<=10; i++) {
			sum +=i;
		}
		//System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//합구하기10_메서드로만들기.getTenTotal(); //같은클래스에서는 메서드 호출시 클래스명 생략가능!!
		int result = getTenTotal();
		System.out.println(result);
		
		int result2 = 합구하기10();
		System.out.println(result);
	}
}