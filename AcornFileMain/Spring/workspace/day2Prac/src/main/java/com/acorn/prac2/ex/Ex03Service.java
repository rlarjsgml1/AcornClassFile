package com.acorn.prac2.ex;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

//@Service, @Repository => 의미한 의미적 이름이다.
@Component
public class Ex03Service {
	
	//사용자 원하는 단 정보 응답하기
	public List<String> getDan(int dan) {
		System.out.println(dan);
		List<String> list = new ArrayList<String>();
		for(int i = 1; i <= 9; i++) {
			list.add(dan + "*" + i + "=" + dan * i);
		}
		return list;
	}
	
	public static void main(String[] args) {
		Ex03Service serivce = new Ex03Service();
		List<String> result = serivce.getDan(0);
		 System.out.println(result);
	}

}
