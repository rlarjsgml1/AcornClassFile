package com.example.day01Prac.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class Ex04Controller {

    final Ex04Service service;

    public Ex04Controller(Ex04Service service) {
        this.service = service;
    }


    @GetMapping("/ex04")
    public String ex04(Model model) {
        List<Drama> list = service.getDramaList();
        model.addAttribute("list", list);
        return "ex04View";
    }


}
