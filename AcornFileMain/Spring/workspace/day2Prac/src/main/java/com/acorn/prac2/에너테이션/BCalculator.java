package com.acorn.prac2.에너테이션;

import org.springframework.stereotype.Component;

@Component
public class BCalculator implements Calculator	{

	@Override
	public int calcAdd(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("B calculator");
		return su1 + su2;
	}

}
