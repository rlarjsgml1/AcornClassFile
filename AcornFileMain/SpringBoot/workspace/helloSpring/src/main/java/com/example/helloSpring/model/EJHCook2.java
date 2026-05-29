package com.example.helloSpring.model;



public class EJHCook2 extends Cook implements 일식가능한{

	public EJHCook2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		
		System.out.println("자식 매개변수가 있는 기본생성자");
	}

	
	
	@Override
	public String toString() {
		return "EJHCook2 [name=" + name + "]";
	}



	public static void main(String[] args) {
		EJHCook2 e = new EJHCook2("엄진희");
		
	}

	public String 초밥만들기() {
		return "연어초밥";
		
	}
}

