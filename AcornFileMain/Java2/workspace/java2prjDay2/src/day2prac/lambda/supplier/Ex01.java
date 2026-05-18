package day2prac.lambda.supplier;

import java.util.function.Consumer;

/*
 * 
 * interface Consumer<T>{
 * 
 *     void accept(  T t);
 * }
 * 
 * 
 */


interface MyConsumer<T>{	
	void accept( T  t);
}


public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1.
		class  A   implements MyConsumer<Integer>{

			@Override
			public void accept(Integer t) {
				System.out.println( t+"청바지 샀음 ");				
			}
			
		}
		
		
		MyConsumer<Integer>  c1 = new A();
		c1.accept(50000);
		
		//2
		
		
		MyConsumer<Integer>  c2  = new MyConsumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println( t+"청바지 샀음  +익명");	
				
			}};
		
			
		c2.accept(60000);
		
		//3
		
		MyConsumer<Integer>  c3= (  money )->{  System.out.println(money+   "청바지 샀음 + 람다식");	  };
		c3.accept(70000);
		
		
		// ()->{}   생략가능 한가?   직접 생략해보면 알 수 잇음 
		// 매개변수가 한 개인 경우 () 괄호 생략 가능
		// 수행할 코드 한 줄인경우 중괄호블럭 생략가능, 이때 리턴이 있다면 리턴도 같이 생략해야 함 
		
		MyConsumer<Integer>  c4=   money  ->   System.out.println( money+ "청바지 샀음 + 람다식") 	 ;
		c4.accept(70000);
		
		
		Consumer<Integer>  c5 = ( t) -> { 
			
			System.out.println("받은 돈 " +t);
			System.out.println("지우기 500소비 " );
			t-=500;
			
			System.out.println("남은 돈 " +t);
		};
		c5.accept(1000);
	}

}
