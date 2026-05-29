package com.example.helloSpring.model;

// 에러나는 이유

// 상속관계에서 자식의 생성자에서는 부모의 생성자(기본생선자를 호출)
// 하는 코드가 자동으로 들어감

public class HSICook extends Cook implements 일식가능한 {

	public HSICook(String name) {
		
		// TODO Auto-generated constructor stub
		// 부모의 기본생성자를 호출하는 코드가 자동으로 들어감
		// super()
		// super(name); 필요하면 명시적으로 부모의 기본생성자를 호출할 수 있다
		
		 super(name);
//		 System.out.println("자식 매개변수가 있는 생성자");
		 // this.name=name; => 부모값은 부모의 생성자에게 할 수 있도록 함
	}

	@Override
	public String toString() {
		return "HSICook [name=" + name + "]";
	}

	@Override
	public String 초밥만들기() {
		// TODO Auto-generated method stub
		return "참치초밥";
	}
	
}
