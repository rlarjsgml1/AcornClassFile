package com.example.helloSpring.model;

public class LHKCook extends Cook implements 일식가능한 {

	public LHKCook() {
		//super() ;    //부모의 기본생성자가 반드시 있어야 함 
	 	super("이현겸");
		System.out.println("자식 기본 생성자");
	}
	
	public LHKCook(String name) {
		super(name);
		System.out.println("자식 매개변수 있는 생성자");
	}

	@Override
	public String toString() {
		return "LHKCook [name=" + name + "]";
	}

	@Override
	public String 초밥만들기() {
		// TODO Auto-generated method stub
		return "광어초밥 삭삭";
	}	
	
	public static void main(String[] args) {
		LHKCook c = new LHKCook("이현겸");
		c.toString();
	}
	
}
