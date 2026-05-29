package com.example.helloSpring.model;

public class JYSCook extends Cook implements 일식가능한 {

	public JYSCook(String name) {
		super(name);
		System.out.println("매개변수가 있는 생성자");
	}

	@Override
	public String toString() {
		return "JYSCook [name=" + name + "]";
	}

	@Override
	public String 초밥만들기() {
		// TODO Auto-generated method stub
		return "참치초밥 냠냠";
	}	
	
}
