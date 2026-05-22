package com.acorn.day1prac.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Ex01Controller {

	@RequestMapping(value = "calcForm", method = RequestMethod.GET)
	public String ex01Form() {
		return "calcForm";
	}

	@RequestMapping(value = "/calc", method = RequestMethod.GET)
	public String ex01(int su1, int su2, Model model) {
		System.out.println(su1);
		System.out.println(su2);

		// EX01 서비스
		int result = su1 + su2;

		// 모델에 저장하기(request)
		model.addAttribute("su1", su1);
		model.addAttribute("su2", su2);
		model.addAttribute("result", result);

		return "ex01";
	}
}