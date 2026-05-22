package com.acorn.day1prac.param;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamExController {

	@RequestMapping(value = "/param1", method = RequestMethod.GET)
	public String paramEx1(String search) { // @RequestParam
		System.out.println(search);
		return "paramEx1";
	}

	@RequestMapping(value = "/param2", method = RequestMethod.GET)
	public String paramEx2(@RequestParam(value = "search2") String search) { // @RequestParam
		System.out.println(search);
		return "paramEx2";
	}

	@RequestMapping( value="/param3"  ,method= RequestMethod.GET )
	public String paramEx3( int num) { //@RequestParam
		System.out.println(num);
		//int a = null; 기본형변수는 null을 저장 할 수 없다.
		return "paramEx3";
	}

	//param3에서 키가 전달 되지 않는 경우의 오류를 대비하려면
	//int -> integer
	//기본값 설정

	@RequestMapping(value = "/param4", method = RequestMethod.GET)
	public String paramEx4(@RequestParam(defaultValue = "1",required = false) int num) { // @RequestParam
		System.out.println(num);
		// int a = null; 기본형변수는 null을 저장 할 수 없다.
		return "paramEx4";
	}

	@RequestMapping(value = "/param5", method = RequestMethod.GET)
	public String paramEx5(int su1, int su2, int su3) { // @RequestParam //키로 전달된 값이 없으면
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
		// int a = null; 기본형변수는 null을 저장 할 수 없다.
		return "paramEx5";
	}
}
