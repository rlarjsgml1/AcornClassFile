package com.acorn.prac2.태준건희문제;

// 계산 기능의 공통 규칙을 정하는 인터페이스
public interface Calculator {

	// 5가지 항목 점수를 받아 고양이 집사 적합도 점수를 계산한다.
	int calcScore(int playTime, int patience, int cleaning, int budget, int responsibility);

}
