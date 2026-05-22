package backjon;

import java.util.Scanner;

public class 백준9498번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		if(test>=90) {
			System.out.println("A");
		}else if(test>=80 && test<=89) {
			System.out.println("B");
		}else if(test>=70 && test<=79) {
			System.out.println("C");
		}else if(test>=60 && test<=69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
