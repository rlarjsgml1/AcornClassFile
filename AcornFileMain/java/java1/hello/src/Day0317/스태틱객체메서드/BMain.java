package Day0317.스태틱객체메서드;

import java.util.Random;

public class BMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.메서드1();
		
		Random r = new Random();
		int reuslt = r.nextInt(100);
		System.out.println(reuslt);
	}

}
