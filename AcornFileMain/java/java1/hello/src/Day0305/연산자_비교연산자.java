package Day0305;

public class 연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//연산의 결과 ture, false발생된다.
		int su1 = 10;
		int su2 = 5;
		boolean sum = (su1>su2);
		
		System.out.println(su1>su2); //true
		System.out.println(su1<su2); //false
		System.out.println(su1==su2);//false
		System.out.println(su1!=su2);//true
		System.out.println(su1>=su2);//true
		System.out.println(su1<=su2);//false
		System.out.println(sum);	 //ture
	}

}
