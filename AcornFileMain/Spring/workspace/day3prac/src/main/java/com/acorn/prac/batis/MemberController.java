package com.acorn.prac.batis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	@Autowired
	MemberService service;
	
	
	//전체조회
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String getMember(Model model) throws Exception {
		model.addAttribute("list", service.getMemberList());
		return "list";
	}
	
	//등록하기
	
	//등록화면
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String regForm() {
		return "regForm";
	}
	
	//등록처리하기
	@RequestMapping(value="/regPross", method = RequestMethod.POST)
	public String regPross(Member member) {
		//
		System.out.println(member);
		int result = service.registerMember(member);
		System.out.println(result);
		return "redirect:/list";
	}
}
