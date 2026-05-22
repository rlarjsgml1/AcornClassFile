package Day0324.오후수업.prac.io;

import java.io.FileReader;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		
		
		FileReader fis = new FileReader("res/acorn");
		int data = fis.read();
		System.out.println((char)data);
		
		data = fis.read();
		System.out.println((char)data);
		
		data = fis.read();
		System.out.println((char)data);
		
		fis.close();
	}
}
