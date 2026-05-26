package com.acorn.prac2.태준건희문제;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

// XML 지시서를 읽어서 Spring 컨테이너가 객체 생성과 주입을 처리하는 예제
public class SpringProgramMain {

	public static void main(String[] args) {
		// setting.xml 안의 bean 정보를 읽어 Spring 컨테이너를 만든다.
		ApplicationContext ac = new GenericXmlApplicationContext("com/acorn/prac2/태준건희문제/setting.xml");
		// 컨테이너가 생성하고 주입까지 끝낸 Program 객체를 꺼낸다.
		Program program = ac.getBean(Program.class);
		program.printResult(7, 8, 8, 7, 9);
	}

}
