package Day0324.오후수업.prac.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex09 {
	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new FileReader("res/acorn"));
			while(true) {
				String data = bf.readLine();
				if(data==null)break;
				System.out.println(data);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("파일이 없다고 멍청아");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			System.out.println("파일이 없다 확인");
		} finally {
			System.out.println("ddd");
		}
	}
}
