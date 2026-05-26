package com.acorn.prac2.태준건희문제;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Calculator를 주입받아서 프로그램 흐름을 실행하는 클래스
@Component("catButlerProgram")
public class Program {

	// 직접 주입, XML 주입, Spring 자동 주입으로 들어올 계산기 객체
	Calculator calculator;

	public Program() {
	}

	// 생성자 주입 방식으로 Calculator를 받을 수 있다.
	public Program(Calculator calculator) {
		this.calculator = calculator;
	}

	// 세터 주입 방식으로 Calculator를 받을 수 있다.
	@Autowired
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	// 콘솔 실행용 메서드: 점수와 등급을 계산한 뒤 출력한다.
	public String printResult(int playTime, int patience, int cleaning, int budget, int responsibility) {
		int score = calculator.calcScore(playTime, patience, cleaning, budget, responsibility);
		String grade = getGrade(score);
		String result = "고양이 집사 적합도: " + score + "점, " + grade;
		System.out.println(result);
		return result;
	}

	// Controller에서 화면에 보여 줄 점수만 필요할 때 사용한다.
	public int getScore(int playTime, int patience, int cleaning, int budget, int responsibility) {
		return calculator.calcScore(playTime, patience, cleaning, budget, responsibility);
	}

	// 계산된 점수에 따라 결과 문구를 나눈다.
	public String getGrade(int score) {
		if (score >= 90) {
			return "최고의 집사 후보";
		}
		if (score >= 70) {
			return "좋은 집사 후보";
		}
		if (score >= 50) {
			return "준비가 더 필요한 집사 후보";
		}
		return "아직은 공부가 필요한 단계";
	}

}
