package Day0311;

public class 함수만들기2 {
	//입력:o , 반환: x
	public static void printStar(int cnt) {
		for(int i=1; i<=cnt; i++) {
			System.out.print("*");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printStar(3);
		System.out.println();
		printStar(11);
	}

}
