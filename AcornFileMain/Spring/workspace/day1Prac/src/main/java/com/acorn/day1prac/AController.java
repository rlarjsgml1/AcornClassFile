package com.acorn.day1prac;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//인터페이스를 구현하는, 방법으로 컨트롤러 만들기 !!
//요청매핑 url ---- 컨트롤러

public class AController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		String data = "hello spring 인터페이스 컨트롤러 만들기"; //모델

		ModelAndView mv = new ModelAndView();
		mv.setViewName("aView");
		mv.addObject("data", data);
		return mv;
	}

}
