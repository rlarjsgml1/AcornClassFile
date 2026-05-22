package Day0324.오후수업.prac.io;

import java.io.FileReader;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) throws IOException {
		FileReader fis = new FileReader("res/acorn");
		while (true) {
			int data = fis.read();
			System.out.println((char) data);
			if (data == -1) { // 아스키코드값이 -1이면 (파일의 끝)
				break;
			}
			System.out.println(data);
		}
	}
}
