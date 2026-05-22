package com.acorn.day1prac.modelAttr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ModelAttrExController {
	//메서드단위 요청
	@RequestMapping(value = "/modelAttr1", method = RequestMethod.GET)
	public String modelAttr1(User user) {
		System.out.println(user.getId());
		System.out.println(user.getPw());
		return "modelAttr1";
	}

	@RequestMapping(value = "/modelAttr2", method = RequestMethod.GET)
	public String modelAttr2(@ModelAttribute("nUser") User user) {
		System.out.println(user.getId());
		System.out.println(user.getPw());
		return "modelAttr2";
	}

	//mvc패턴에서 user 정보를 모델로사용해서 뷰 응답하기
	@RequestMapping(value = "/test3", method = RequestMethod.GET)
	public String test3(Model model) {
		User s = new User("test","123");
		model.addAttribute("kkk", s);

		return "test3";
	}
}
