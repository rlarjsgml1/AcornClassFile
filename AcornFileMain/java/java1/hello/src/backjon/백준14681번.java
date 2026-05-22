package backjon;

import java.util.Scanner;

public class 백준14681번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사분면고르기
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>=0 && y>=0) {
			System.out.println(1);
		} else if(x<0 && y>=0) {
			System.out.println(2);
		} else if(x<0 && y<0) {
			System.out.println(3);
		} else if(x>=0 && y<0) {
			System.out.println(4);
		}
	}

}
