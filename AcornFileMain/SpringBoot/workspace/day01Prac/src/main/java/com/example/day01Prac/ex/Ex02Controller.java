package com.example.day01Prac.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Ex02Controller {

    private final Ex02Service service;

    public Ex02Controller(Ex02Service service) {
        this.service = service;
    }

    // /ex02 요청이 오면 3단 결과를 만들어 ex02View.html로 전달한다.
    @GetMapping("/ex02")
    public String ex02(Model model) {
        String[] result = service.getDan3();

        // ex02View.html에서 ${result}로 반복 출력하므로 이름을 result로 맞춘다.
        model.addAttribute("result", result);

        return "ex02View";
    }
}
