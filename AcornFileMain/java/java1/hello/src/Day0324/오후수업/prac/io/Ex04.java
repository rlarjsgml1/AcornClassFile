package Day0324.오후수업.prac.io;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		
		int input = ir.read();
		System.out.println((char)input);
	}
}
