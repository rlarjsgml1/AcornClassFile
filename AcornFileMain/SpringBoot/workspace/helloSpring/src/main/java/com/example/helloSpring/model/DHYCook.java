package com.example.helloSpring.model;

public class DHYCook extends Cook implements 일식가능한{

	public DHYCook(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		System.out.println("자식 기본생성자");

	}

	@Override
	public String toString() {
		return "DHYCook [name=" + name + "]";
	}

	public static void main(String[] args) {
		DHYCook d = new DHYCook("여도현");
		System.out.println(d);
	}

	@Override
	public String 초밥만들기() {
		// TODO Auto-generated method stub
		return "연어초밥";
	}
}
