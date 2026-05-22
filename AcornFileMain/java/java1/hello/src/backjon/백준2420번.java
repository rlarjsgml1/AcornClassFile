package backjon;

import java.util.Scanner;

public class 백준2420번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long M = sc.nextLong();
		long N = sc.nextLong();
		
		if(M>=N) {
			System.out.println(M-N);
		} else {
			System.out.println(N-M);
		}
	}

}
