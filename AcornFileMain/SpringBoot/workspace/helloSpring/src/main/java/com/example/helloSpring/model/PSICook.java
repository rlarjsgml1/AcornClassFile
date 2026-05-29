package com.example.helloSpring.model;

public class PSICook extends Cook implements 일식가능한{

	public PSICook(String name) {
		super(name);
		System.out.println("자식 기본 생성자");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "PSICook [name=" + name + "]";
	}
	
	public static void main(String[] args) {
		PSICook p = new PSICook("박세인");
	}
	
	@Override
	public String 초밥만들기() {
		// TODO Auto-generated method stub
		return "간장새우초밥";
	}
}
