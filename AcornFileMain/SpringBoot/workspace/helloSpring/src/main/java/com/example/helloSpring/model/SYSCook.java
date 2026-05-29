package com.example.helloSpring.model;

// 상속 관계에서 자식의 생성자는 부모의 생성자(기본 생성자를 호출) 코드가 자동으로 들어감.
public class SYSCook extends Cook implements 중식가능한 {

	public SYSCook(String name) {
//		부모의 기본 생성자를 호출하는 코드가 자동으로 들어감
		super(name);
		
		System.out.println("자식 기본 생성자");
//		this.name = name => 부모값은 부모의 생성자에게 할 수 있도록 함.
	}
	
	public static void main(String[] args) {
		SYSCook c1 = new SYSCook("손영석");
	}

	@Override
	public String 탕수육만들기() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
