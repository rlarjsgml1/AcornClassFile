package Day0324.오후수업.prac.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex08 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("res/acorn"));
		String data = bf.readLine();
		System.out.println(data);
		data = bf.readLine();
		System.out.println(data);
		data = bf.readLine();
		System.out.println(data);
	}
}
