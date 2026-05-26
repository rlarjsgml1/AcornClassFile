package com.acorn.prac2.계산기;

public class ProgramMain {
	public static void main(String[] args) {
		Program p = new Program();
		p.setCalculator(new ACalculator());
		p.printCalc(7,7);

		p.setCalculator(new BCalculator());
		p.printCalc(7,7);
	}
}
