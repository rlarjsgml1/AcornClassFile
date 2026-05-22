package Day0305;

public class 형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//형 : 자료형(type)
		//형변환 : type을 변환하는 = (일시적으로 변환)
		byte b = 127;
		//byte c = 128; //작은변수(작은공간) = 큰 값
		byte c = (byte)128;
		System.out.println(c); //오버플로우 발생
		
		int su1 =10;
		int su2 = 3;
		double result;
		result = su1/ (double)su2; //double 형으로 형변환시키기
		System.out.println(result);
		//=>3.0
		
		//형변환
		//큰변수 = 작은변수 => 작은변수의 type을 큰변수의 타입으로 형변환을 시도함(자동 형변환)
		//작은변수 = 큰변수 => 큰변수의 타입을 작은변수의 타입으로 배열(강제 형변환)
		double score = 98.56;
		float kor = (float)score; //강제형변환, score 변수의 타입을 일시적으로 float으로 형변환 시킴
		
		float score2=98.56f;
		double kor2= score2; //자동현변환 score2가 double형으로 자동으로 변환되어 사용됨
		//큰공간 = 작은값 
		//작은공간 = 큰값 (명시적 형변환해서 쓰거나 아니면 타입을 맞춰서 사용하면 됨)
		
		
		
		
	}

}
