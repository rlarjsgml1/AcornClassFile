package Day0305;

import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. 사용자로부터 수를 입력받아 입력받은 수까지의 합 구하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		int sum = sc.nextInt();
		int result =0;
		for(int i = 1; i<=sum; i++) {
			result = result + i;
		}
		System.out.println(result);
	}

}
