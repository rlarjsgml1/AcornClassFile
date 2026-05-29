package com.example.helloSpring.model;


//에러나는 이유
//상속관계에서 자식의 생성자에서는 부모의 생성자(기본 생성자를 호출)
//하는 코드가 자동으로 들어감
public class KMKCook extends Cook{

	public KMKCook(String name) {
		super(name);
		System.out.println("자식 매개변수가 있는 생성자");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "KMKCook [name=" + name + "]";
	}
	
	public String 초밥만들기() {
		return "계란초밥";
		
	}
}
