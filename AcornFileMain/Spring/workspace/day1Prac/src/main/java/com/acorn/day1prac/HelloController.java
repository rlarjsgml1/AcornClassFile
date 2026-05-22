package com.acorn.day1prac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//컨트롤러 작성, 순수자바로 작성(POJO)
//애너테이션 사용

@Controller
public class HelloController {

	// 메서드 단위 매핑
	//m -> 모델을 저장하는 Model 객체를 제공함, model 객체에 저장한다
	//v ->jsp view
	//c -> 자바로 작성 @Controller 애너테이션

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(Model model) { // Model 객체 제공 => 모델저장소 제공
		// model = "hello spring"
		String data = "hello Spring ^^";
		model.addAttribute("data", data);
		return "hello"; // view이름
	}

}
