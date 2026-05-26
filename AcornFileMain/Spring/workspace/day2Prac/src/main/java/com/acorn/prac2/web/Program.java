package com.acorn.prac2.web;

public class Program {
	
	Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public Program(Calculator calculator) {
		super();
		this.calculator = calculator;
	}
	
	public Program() {
		// TODO Auto-generated constructor stub
	}

	public int printCalc(int i, int j) {
		int result = calculator.calcAdd(i, j);
		System.out.println(result);
		return result;
	}
	
	
	

}
