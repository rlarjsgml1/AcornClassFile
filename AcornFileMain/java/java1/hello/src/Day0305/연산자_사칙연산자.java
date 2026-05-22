package Day0305;

public class 연산자_사칙연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//+, -, *, / %
		//정수연산, 실수연산
		
		int a = 10;
		int b = 3;
		//정수연산을 수행하고 정수결과를 얻고 싶었다면 그대로 사용하면 됨
		int result = a+b;
		int result2 = a-b;
		int result3 = a*b;
		
		int result4 = a/b; //정수연산 수행 => 무조건 정수 수행
		double result5 = a/(double)b; // 소수이하의 값을 원하면 실수연산수행하도록 해야됨
		
		int result6 = a%b;
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
	}

}
