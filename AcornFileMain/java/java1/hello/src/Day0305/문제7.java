package Day0305;

import java.util.Scanner;

public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7. 수를입력받아서 짝수의 합을 구하세요 ( 10개의 수를 입력)
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 1; i<=10; i++) {
			System.out.println("숫자를 입력해주세요");
			int odd = sc.nextInt();
			if(odd%2==0) {
				sum = sum + odd;
			}
		}
		System.out.println(sum);
	}

}
