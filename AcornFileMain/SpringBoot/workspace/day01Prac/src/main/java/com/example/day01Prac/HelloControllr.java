package com.example.day01Prac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HelloControllr {

    @Autowired
    HelloService service;

    @GetMapping("/hello")
    public String hello(Model model){
        String result = service.getMessage();
        model.addAttribute("data", result);
        return "helloView";
    }

    @GetMapping("/hello2")
    public String hello2(Model model){
        List<String> list = service.getFood();
        model.addAttribute("list", list);
        model.addAttribute("foodImage", "food2.jpg");
        return "hello2View";
    }


}
