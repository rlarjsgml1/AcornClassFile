package com.example.helloSpring.model;

public class KKHCook4 extends Cook implements 한식가능한{

	public KKHCook4(String name) {
		super(name);
		System.out.println("자식 기본생성자");
	}

	@Override
	public String toString() {
		return "KKHCook4 [name=" + name + "]";
	}
	
	@Override
	  public String 비빔밥만들기() {
	      return "돌솥비빔밥";
	  }
}
