package com.acorn.day1prac.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Ex02Controller {

	@RequestMapping(value = "/dan3", method = RequestMethod.GET)
	public String dan3(Model model) {
		//3단
		String[] dan3 = new String[9];
		dan3[0]= "3*1=" + 3*1;
		dan3[1]= "3*2=" + 3*2;
		dan3[2]= "3*3=" + 3*3;
		dan3[3]= "3*4=" + 3*4;
		dan3[4]= "3*5=" + 3*5;
		dan3[5]= "3*6=" + 3*6;
		dan3[6]= "3*7=" + 3*7;
		dan3[7]= "3*8=" + 3*8;
		dan3[8]= "3*9=" + 3*9;


//		for(int i = 0;)

		model.addAttribute("data", dan3);

		return "ex02";
	}

}
