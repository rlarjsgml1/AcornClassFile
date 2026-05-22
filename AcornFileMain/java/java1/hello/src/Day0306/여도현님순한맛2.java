package Day0306;

public class 여도현님순한맛2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 + (1+2) + (1+2+3) + (1+2+3+4) + (1+2+3+4+5)......
		//출력: 항의 누적값을 저장할 변수
		int totalSum = 0;
		int n=5;
		for(int i = 1; i<=n; i++) { // 1 2 3 4 5
			totalSum = totalSum + i*(n-i+1);
		}
		System.out.println(totalSum);		
	}
}
