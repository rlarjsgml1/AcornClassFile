package com.example.helloSpring.model;

public class KTJCOOK extends Cook implements 중식가능한{

	public KTJCOOK(String name) {
		super(name);
		System.out.println("자식 매개변수있는 기본생성자");
	}
	
	
	@Override
	public String 탕수육만들기() {
		// TODO Auto-generated method stub
		String result = "탕수육보단 깐풍기";
		return result;
	}
	
	public static void main(String[] args) {
		
		KTJCOOK ktj = new KTJCOOK("김태준");
		String a = ktj.toString();
		System.out.println(a);
		String b = ktj.탕수육만들기();
		System.out.println(b);
	}

}
