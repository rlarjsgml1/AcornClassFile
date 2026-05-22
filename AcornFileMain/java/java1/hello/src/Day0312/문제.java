package Day0312;

public class 문제 {

	//call by value
	//call by reference
	public static void printScor(int kor, int eng, int math) {
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		
	}
	public static void printLikesNumber(int[] likesNumber) {
		for(int i = 0; i<likesNumber.length; i++) {
			System.out.println(likesNumber[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 90, eng = 80, math = 100;
		//call
		//성적 출력하기
		System.out.println("성적 출력");
		printScor(kor, eng, math);
		
		int[] likesNumber = {1, 3, 11};
		//call
		//좋아하는 수 출력하기
		System.out.println("좋아하는 수 출력");
		printLikesNumber(likesNumber);
	}

}
