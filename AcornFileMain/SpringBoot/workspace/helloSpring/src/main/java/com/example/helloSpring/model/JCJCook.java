package com.example.helloSpring.model;

public class JCJCook extends Cook implements 한식가능한{

	public JCJCook(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String 비빔밥만들기() {
		return "미역국 끓이기";
	}
	
	@Override
	public String toString() {
		return "JCJCook [name=" + name + "]";
	}
}
