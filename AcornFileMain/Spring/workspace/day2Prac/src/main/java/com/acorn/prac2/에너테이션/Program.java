package com.acorn.prac2.에너테이션;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Program {
	
	Calculator calculator;

	@Autowired
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
