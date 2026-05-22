package Day0305;

public class 함수연산_실수연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수연산
		//피연산자가 모두 정수라면 => 정수연산 수해 => 결과가 무조건 정수가 발생 
		//10/3 => 3 (정수/정수) => 정수연산 수행 => 결과도 무조건 장소 3이 결과로 나옴
		
		//10/3 의 결과가 실수형 값을 얻어야 한다면 
		//두 개 중에 한개를 실수형type 변환해야 한다.
		//10/3.0 => 자료형을 큰쪽으로 맞춰서 계산됨 실수연산을 수행
		int result;
		result = 10/3;
		System.out.println(result);
		
		double result2;
		result2 = 10/3;
		System.out.println(result2);
		
		result2 =10/3.0; //실수연산을 수행한다.
		System.out.println(result2);
		
		
	}

}
