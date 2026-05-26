package com.acorn.prac2.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("webCalcProgramController")
public class CalcProgramController {

	@Autowired
	Program p; //필드주입
	

	// 매핑, 메서드 단위 매핑
	// cal?su1=9&su2=10
	@RequestMapping(value = "/cal", method = RequestMethod.GET)
	// @RequestParam
	public String method1(
			@RequestParam(defaultValue = "0") int su1,
			@RequestParam(defaultValue = "0") int su2,
			Model model) {
		int result = p.printCalc(su1, su2);
		model.addAttribute("su1", su1);
		model.addAttribute("su2", su2);
		model.addAttribute("result", result);

		return "calView";
	}

}
