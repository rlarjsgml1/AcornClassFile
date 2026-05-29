package com.example.helloSpring.model;

public class NHSCook extends Cook  implements 일식가능한  {

	public NHSCook(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		System.out.println("자식 매개변수가 있는 기본생성자");
		
	}

	@Override
	public String toString() {
		return "NHSCook [name=" + name + "]";
	}
	
	public static void main(String[] args) {
		NHSCook n = new NHSCook("나해수");
	}

	@Override
	public String 초밥만들기() {
		// TODO Auto-generated method stub
		return  "육회초밥";
	}

	 
	
	 
}
