package day2prac.consumer;

import java.util.function.Consumer;

public class Consumer연습하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 
		
		class A implements Consumer<Integer>{

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
			
		}
		Consumer<Integer> c1 = new A();
		c1.accept(1000);
		
		//2. 익명
		
		
		Consumer<Integer> c2 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		};
		c2.accept(2000);
		
		
		//3. 람다식
		
		Consumer<Integer> c3 = (m) -> {System.out.println(m);
		};
		c3.accept(3000);
		
		Consumer<Integer> c4 = m -> System.out.println(m);
		c4.accept(4000);
	}
}
