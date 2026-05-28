package com.acon.prac4.컨트롤러응답;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExController1 {

	// 뷰반환 spring MVC

	// 반환타입 String => 뷰이름
	@RequestMapping(value = "/mvc1", method = RequestMethod.GET)
	public String mvc1(Model model) {
		model.addAttribute("data", "hi~!");
		return "view1";
	}

	// 반환타입 void => 매핑이름을 뷰로 인신
	@RequestMapping(value="/mvc2", method = RequestMethod.GET)
	public void method2(Model model) {
		model.addAttribute("data", "bye");
		
	}

	// 반환타입 ModelAndView 이 객체안에 뷰 정보 사용
	@RequestMapping(value = "/mvc3", method = RequestMethod.GET)
	public ModelAndView method3() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("view3");
		mv.addObject("data","hello~");
		return mv;
	}
}
