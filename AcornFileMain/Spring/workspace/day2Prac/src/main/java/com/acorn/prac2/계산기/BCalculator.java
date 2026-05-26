package com.acorn.prac2.계산기;

public class BCalculator implements Calculator {

	@Override
	public int calcAdd(int su1, int su2) {
		System.out.println("B calculator");
		return su1 + su2;
	}

}
