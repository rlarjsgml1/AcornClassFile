package com.acorn.prac2.에너테이션;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("annotationCalcProgramController")
public class CalcProgramController {
	
	@Autowired
	Program p;
	
	
	@RequestMapping(value = "/cal2", method = RequestMethod.GET)
	public String method1(
			@RequestParam(defaultValue = "0") int su1,
			@RequestParam(defaultValue = "0") int su2,
			Model model) {
		int result = p.printCalc(su1, su2);
		model.addAttribute("su1", su1);
		model.addAttribute("su2", su2);
		model.addAttribute("result", result);
		return "calView2";
	}
	

}
