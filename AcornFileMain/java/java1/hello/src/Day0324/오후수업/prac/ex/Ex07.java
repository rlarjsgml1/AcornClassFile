package Day0324.오후수업.prac.ex;

import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) throws IOException {
		
		int ch = System.in.read(); //키보드로부터 한 바이트 읽어오기
								   //checkedException -> 예외처리를 반드시 해야한다
								   // - try ~ catch, throws(예외 던지기)를 사용할 수 있다.
		
		//1) throws 사용하기 -> 예외던지기, 예외미루기(main -> 미루기 -> jvm) : 예외처리를 하지 않고 작성 할수 있다.5
		System.out.println();
		System.err.println((char)ch);
		System.out.println("ok");
	}
}
