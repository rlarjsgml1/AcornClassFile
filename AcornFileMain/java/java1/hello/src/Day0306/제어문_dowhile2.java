package Day0306;

import java.util.Scanner;

public class 제어문_dowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력유효성 체크하기
		//올바른값이 입력될 때까지 입력받기
//		do {}while();
		
		int math;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("수학점수입력: ");
			math=sc.nextInt();
			
		}while(math> 0 || math> 100); //0보다 작거나 100보다 크다면 반복
		System.out.print("수학점수: " + math);
	}

}
