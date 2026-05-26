package com.acorn.prac2.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ProgramMain {
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("com/acorn/prac2/spring/setting.xml");

		// 스프링컨테이너로부터 얻어오는 두 가지 방법
		// 1.bean의 클래스 type
		// 2.bean의 id 값

		Program program = ac.getBean(Program.class); //클래스 타입
		program.printCalc(7, 7);
		
		Program program2 = (Program)ac.getBean("b2");
		program2.printCalc(5, 1);
		
		if(program == program2) {
			System.out.println("스프링컨테이너는 하나의 객체를 관리한다");
		}
	} 
}
