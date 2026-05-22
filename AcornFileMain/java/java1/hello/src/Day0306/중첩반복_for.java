package Day0306;

public class 중첩반복_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제) *별 하나로 5개 출력하기
		for(int i=1;i<=5; i++) {
			for(int j = 1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
