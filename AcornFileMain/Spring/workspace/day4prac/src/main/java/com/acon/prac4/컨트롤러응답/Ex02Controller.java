package com.acon.prac4.컨트롤러응답;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex02Controller {

	// 데이터응답하기

	// 에전방식으로 데이터 응답
	// HttplServletResponse.getWriter().print("데이터");
	public void datal(HttpServletResponse response) {
		try {
			response.getWriter().print("data");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// String -> 문자열데이터 응답하기
	@ResponseBody
	@RequestMapping(value = "/data2", method = RequestMethod.GET)
	public String data2() {
		return "data2^^";
	}

	// @ResponseBody
	// 반환타입 Acorn => acorn 객체를 json 응답
	@ResponseBody
	@RequestMapping(value = "/data3", method = RequestMethod.GET)
	public Food data3() {
		Food food = new Food();
		food.setName("짜장면");
		food.setPrice(8000);

		return food;
	}

	// food 정보 여러개 반환하기
	@ResponseBody
	@RequestMapping(value = "/data4", method = RequestMethod.GET)
	public List<Food> data4() {
		List<Food> list = new ArrayList<Food>();
		list.add(new Food("짜장면", 8000));
		list.add(new Food("짬뽕", 9000));
		list.add(new Food("탕수육", 20000));
		return list;
	}
	
	//음식정보 등록하기
	@ResponseBody
	@RequestMapping(value = "/regData/{id}", method = RequestMethod.POST)
	public int regData(@RequestBody Food food, 
			@PathVariable(name="id") String id
			) { //json 데이터 - > 자바객체로 변환 해 줌
		System.out.println(food);
		System.out.println(id);
		return 1;
		
	}

	@ResponseBody
	@RequestMapping(value = "/data5", method = RequestMethod.GET)
	public ResponseEntity<Food> data5() {
		Food food = new Food();
		food.setName("짜장면");
		food.setPrice(8000);

		return ResponseEntity.status(HttpStatus.OK).body(food);
	}

}
