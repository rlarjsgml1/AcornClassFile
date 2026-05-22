package Day0324.오후수업.prac.io;

import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		System.out.println("알파벳 여러개 쓰고 엔터");
		
		int input;
		while((input = System.in.read()) !='\n') {
			System.out.print((char)input);
		}
	}
}
