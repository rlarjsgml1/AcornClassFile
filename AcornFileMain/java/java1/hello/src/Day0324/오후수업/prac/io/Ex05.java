package Day0324.오후수업.prac.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		System.out.println(line);
		
		String su = br.readLine();
		int suu = Integer.parseInt(su);
		System.out.println(suu);
		
		//.nextInt() nextDouble() nextLine() => Scanner => 보조스트림
		
	}

}
