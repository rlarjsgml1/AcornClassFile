package com.acorn.prac2.ex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Ex03Controller {

	Ex03Service service;

	public Ex03Controller() {
	}

	@Autowired
	public Ex03Controller(Ex03Service service) {
		this.service = service;
	}

	@Autowired
	public void setService(Ex03Service service) {
		this.service = service;
	}

	// 사용자가 원하는 단 정보 응답하기
	@RequestMapping(value = "/ex03", method = RequestMethod.GET)
	public String ex03(@RequestParam(defaultValue = "2", required = false) int dan, Model model) {
		List<String> danList = service.getDan(dan);
		model.addAttribute("dan", dan);
		model.addAttribute("danList", danList);
		return "ex03View";
	}

}
