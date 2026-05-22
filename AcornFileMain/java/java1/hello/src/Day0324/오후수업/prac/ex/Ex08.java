package Day0324.오후수업.prac.ex;

import java.io.IOException;

public class Ex08 {
	public static void main(String[] args) {
		int su = 0;
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//예외가 터지거나 예외가 발생하지 않는 경우 모두 실행되는 구간
			System.out.println("무조건수행된다");
		}
		
		System.out.println(su);
	}
	
}
