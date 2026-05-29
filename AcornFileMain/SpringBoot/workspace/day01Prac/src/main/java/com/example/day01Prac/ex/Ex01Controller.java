package com.example.day01Prac.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Ex01Controller {

    private final Ex01Service service;

    public Ex01Controller(Ex01Service service) {
        this.service = service;
    }

    // /ex01 GET 요청: 숫자 2개를 입력하는 화면을 보여준다.
    @GetMapping("/ex01")
    public String ex01Form() {
        return "ex01Form";
    }

    // /ex01 POST 요청: 입력받은 su1, su2를 더한 뒤 결과 화면으로 전달한다.
    @PostMapping("/ex01")
    public String ex01Calc(
            @RequestParam(name = "su1", defaultValue = "1", required = false) int su1,
            @RequestParam(name = "su2", defaultValue = "1", required = false) int su2,
            Model model
    ) {
        int result = service.calc(su1, su2);

        // ex01Result.html에서 ${data}로 출력한다.
        model.addAttribute("data", result);

        return "ex01Result";
    }
}
