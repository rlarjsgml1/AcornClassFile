package Day0309;

public class 배열1차원_정수형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1차원 배열: 기억장소의 집합
		//같은 기억장소(같은 자료형)의 데이터를 여러개 저장할 수 있는 연속된 기억공간
		//자료형의 크기 + 연속적 + 배열선언시 크기를 정해야한다
		
		//기억장소의 접근방법
		//배열이름[인덱스]를 사용하여 몇 번째 요소인지 접근한다
		//인덱스 : 배열이름 부터 떨어진 위치( 크기 만큼)
		//배열명[0] : //의미 ==> 기준으로부터 0만큼 떨어진 위치에 1첫번재 박스 (기억장소)가 있다.
		
		//배열선언
		int [] kors = new int[5]; //배열의 크기( int형 기억장소 (변수)를 연속적으로 5개 확보
								  //배열은 자료형의 기본갑스로 초기화 해 줌  int형의 0이다
		
		//배열선언 및 초기화
		int[] engs = new int[] {90, 100, 85, 75, 99}; //초기화값만큼 배열을 만들고 값을 넣어줌
		//int[] engs;
		//engs = new int[] {90, 100, 85, 75, 99};
		
		//배열선언 및 초기화
		int[] maths = {100, 89, 79, 99}; //초기화값 만큼 배열을 만들고 값을 넣어줌
										 //한라인에 배열을 만들고 초기화할 때만 사용가능
		//int [] maths;
		//maths = {100, 89, 79, 99};
		
		//국어점수 배열 출력하기
		//접근방법 = > 배열명[인덱스]
		System.out.println( kors[0]);
		System.out.println( kors[1]);
		System.out.println( kors[2]);
		System.out.println( kors[3]);
		System.out.println( kors[4]);
		for(int i = 0; i<kors.length; i++) {
			System.out.println(kors[i]);
		}
		//영어저수 배열 출력하기

		for(int i = 0; i<engs.length; i++) {
			System.out.println(engs[i]); //배열명[인덱스]로 접근 => 기억(저장), 이용(읽기)
		}
		//수학점수 배열 출력하기
		
		for(int i = 0; i<maths.length; i++) {
			System.out.println(maths[i]);
		}
	}

}
