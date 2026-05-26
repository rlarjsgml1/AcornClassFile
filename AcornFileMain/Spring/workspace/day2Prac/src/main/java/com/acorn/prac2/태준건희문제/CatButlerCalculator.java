package com.acorn.prac2.태준건희문제;

import org.springframework.stereotype.Component;

// 실제 고양이 집사 적합도 계산을 담당하는 클래스
@Component
public class CatButlerCalculator implements Calculator {

	@Override
	public int calcScore(int playTime, int patience, int cleaning, int budget, int responsibility) {
		// 각 항목은 10점 만점으로 받고, 2를 곱해서 총점이 100점이 되도록 계산한다.
		return playTime * 2 + patience * 2 + cleaning * 2 + budget * 2 + responsibility * 2;
	}

}
