package com.example.helloSpring.model;

public class KJYCook extends Cook implements 한식가능한{

	public KJYCook(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String 비빔밥만들기() {
		// TODO Auto-generated method stub
		return "돌솥비빔밥";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CookKJY [name="+ name +"]";
	}
	


}
