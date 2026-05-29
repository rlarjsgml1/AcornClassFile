package com.example.helloSpring.model;

public class 김잼Cook extends Cook implements 한식가능한 {

	public 김잼Cook() {
		super("김잼");
	}

	@Override
	public String 비빔밥만들기() {
		return "야채가득비빔밥";
	}
}
