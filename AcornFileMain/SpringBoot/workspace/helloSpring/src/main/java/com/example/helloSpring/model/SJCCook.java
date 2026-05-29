package com.example.helloSpring.model;

//에러나는 이유

//상속관계에서 자식의 생성자에서는 부모의 생성자(기본생성자를 호출)
//하는 코드가 자동으로 들어감

public class SJCCook extends Cook implements 한식가능한{
	
	public SJCCook(String name) {
		
		//부모의 기본생성자를 호출하는 코드가 자동으로 들어감
		//super(name);  필요하면 명시적으로 부모의 기본생성자를 호출할 수 있다
		
		super(name);
		System.out.println("자식 기본생성자");
		//this.name = name;  => 부모값은 부모의 생성자에게 할 수 있도록 함
	}
	
	@Override
	public String 비빔밥만들기() {
		return "비빔밥";
	}
	
	@Override
	public String toString() {
		return "SJCCook [name=" + name + "]";
	}



//	public static void main(String[] args) {
//		SJCCook s = new SJCCook("송주창");
//		
//		System.out.println(s);
//	}
}
