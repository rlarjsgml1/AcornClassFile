package Day0309;

public class 배열1차원_논리형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//논리형 변수 5개 만들고 출력하기
		boolean a = true;
		boolean b = false;
		boolean c = true;
		boolean d = false;
		boolean e = true;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		//배열로 만들고 출력하기
		boolean[] arr = new boolean[5]; //boolean 기본값은 false이다.
		for(int i= 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//boolean e; //변수는 초기화를 개발자가 직접해야 한다. !! 에러를 줌
		//System.out.println(e);
		
		//배열선언및 초기화
		boolean[] arr2 = new boolean[] {true, true, true, false, false};
		
		//
		
		//배열 선언 및 초기화
		boolean[] arr3 = {true, true, true, false, false};
		for(int i = 0; i< arr3.length; i++) {
		System.out.println(arr3[i]);
		}
	}

}
