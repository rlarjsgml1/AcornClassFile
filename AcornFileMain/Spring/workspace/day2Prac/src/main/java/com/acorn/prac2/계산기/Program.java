package com.acorn.prac2.계산기;

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

	public void printCalc(int i, int j) {
		int result = calculator.calcAdd(i, j);
		System.out.println(result);
	}

	public Calculator getCalculator() {
		return calculator;
	}

	
	

}
