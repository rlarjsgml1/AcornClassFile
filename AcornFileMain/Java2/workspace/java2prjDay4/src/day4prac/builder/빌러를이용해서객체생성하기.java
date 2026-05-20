package day4prac.builder;

public class 빌러를이용해서객체생성하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Acorn a  = Acorn.build()
		.id("acorn1")
		.name("김태준")
		.address("서울시")
		.age(20)
		.build();
		

		System.out.println(a);
		
		
		Acorn b  = Acorn.build()
				.id("acorn2")
				.name("고지연")
				.build();

		
		System.out.println(b );
		
	}

}
