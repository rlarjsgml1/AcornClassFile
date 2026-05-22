package com.acorn.param;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@RequestParam
// 요청의 파라미터를 연결할 매개변수에 붙이는 애너테이션
// 기본형 자료형과 String 앞에 붙여 사용할 수 있다.
// view에서는 ${param.id}로 사용할 수 있다.
// 화면에서 데이터가 필요한 경우 param으로 꺼낼 수 있다.

@Controller
public class RequestParamEx {
	@RequestMapping("/rParam")
	public String param1(HttpServletRequest request) {
		String id = request.getParameter("id");
//		http://localhost/day1/rParam          ---->> id=null
//		http://localhost/day1/rParam?id=      ---->> id=""
//		http://localhost/day1/rParam?id       ---->> id=""	
		System.out.println("id=" + id);
		return "view";
	}

	@RequestMapping("/rParam2")
	// public String param2(@RequestParam(value="id", required=false) String id) {
	// 아래와 동일
	public String param2(String id) {
		System.out.println("id=" + id);
		return "view";
	}

	@RequestMapping("/rParam3")
	public String param3(@RequestParam(value = "id2", required = true) String id) { // 아래와 동일
		System.out.println("id=" + id);
//		http://localhost/day1/requestParam3         ---->> id=null   400 Bad Request. required=true라서 
//		http://localhost/day1/requestParam3?id2    ---->>  id=""

		return "view";
	}

	@RequestMapping("/rParam4")
	public String param4(@RequestParam(required = false) String id) {
//		http://localhost/day1/rParam4         ---->> id=null 
//		http://localhost/daty1/rParam4?id      ---->> id=""   
		System.out.println("id=" + id);
		return "view";
	}

	@RequestMapping("/rParam5")
	// public String param5(@RequestParam(required=false, defaultValue="1") int su)
	// { // ?su=7 int로 변환까지 해서 바인딩됨

	public String param5(@RequestParam(required = false, defaultValue = "1") int su) {
		// public String param5( int su) {
		System.out.println("su=" + su);
		return "view";
	}

	@RequestMapping("/rParam6")
	// public String param6(int su) { // Integer로 변경하면 오류가 발생하지 않는다.
	public String param6(Integer su) { // Integer로 변경하면 오류가 발생하지 않는다.
		// 키가 전달되지 않으면 null 정보가 반환된다.
		// int형 변수에는 null을 저장할 수 없어서 오류가 발생한다.
		System.out.println("su=" + su);
		return "view";
	}

	@RequestMapping("/rParam7") //rParam7 => 키가 입력되지 않으면 ?su =5, su키로 꺼내면 null 이 반환됨
								//매개변수는 기본형자료형 int로 되어 있어서 오류 발생
	// public String param6(int su) { // Integer로 변경하면 오류가 발생하지 않는다.
	public String param7(Integer su) { // Integer로 변경하면 오류가 발생하지 않는다.

		System.out.println("su=" + su);
		return "view";
	}

}
