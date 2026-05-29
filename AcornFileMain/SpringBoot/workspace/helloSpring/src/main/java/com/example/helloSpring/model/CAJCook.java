package com.example.helloSpring.model;

public class CAJCook extends Cook implements 일식가능한{
	
	public CAJCook(String name) {
		super(name);		
		System.out.println("자식 매개변수가 있는 생성자");

	}
	
	public static void main(String[] args) {
		CAJCook c = new CAJCook("조아진");
	}

	@Override
	public String 초밥만들기() {
		// TODO Auto-generated method stub
		return "새우초밥 냠";
	}

	@Override
	public String toString() {
		return super.toString();
	}
	

}
