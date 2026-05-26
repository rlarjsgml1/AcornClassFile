package com.acorn.prac2.에너테이션;

public class ACalculator implements Calculator	{

	@Override
	public int calcAdd(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("A calculator");
		return su1 + su2;
	}

}
