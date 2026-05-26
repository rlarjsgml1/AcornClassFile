package com.acorn.prac2.태준건희문제;

// Spring 없이 Main에서 직접 객체를 만들고 주입하는 예제
public class ProgramMain {

	public static void main(String[] args) {
		Program program = new Program();
		// Program 객체에 Calculator 구현체를 직접 넣어 준다.
		program.setCalculator(new CatButlerCalculator());
		program.printResult(8, 9, 7, 8, 10);
	}

}
