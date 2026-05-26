package com.acorn.prac2.태준건희문제;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// 브라우저 URL 요청으로 고양이 집사 적합도 계산기를 실행하는 Controller
@Controller
public class CatButlerController {

	// Spring이 Program 객체를 찾아서 자동으로 주입한다.
	@Autowired
	Program program;

	// 예: /catButler?playTime=8&patience=9&cleaning=7&budget=8&responsibility=10
	@RequestMapping(value = "/catButler", method = RequestMethod.GET)
	public String catButler(
			@RequestParam(defaultValue = "5") int playTime,
			@RequestParam(defaultValue = "5") int patience,
			@RequestParam(defaultValue = "5") int cleaning,
			@RequestParam(defaultValue = "5") int budget,
			@RequestParam(defaultValue = "5") int responsibility,
			Model model) {

		// Program에게 계산을 맡기고, 점수에 맞는 결과 문구도 받아 온다.
		int score = program.getScore(playTime, patience, cleaning, budget, responsibility);
		String grade = program.getGrade(score);

		// JSP 화면에서 사용할 값을 Model에 담는다.
		model.addAttribute("playTime", playTime);
		model.addAttribute("patience", patience);
		model.addAttribute("cleaning", cleaning);
		model.addAttribute("budget", budget);
		model.addAttribute("responsibility", responsibility);
		model.addAttribute("score", score);
		model.addAttribute("grade", grade);

		// /WEB-INF/views/catButlerView.jsp로 이동한다.
		return "catButlerView";
	}

}
