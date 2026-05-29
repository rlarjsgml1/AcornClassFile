package com.example.day01Prac;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloService {
    public String getMessage(){
        return "hello 스프링부트 ^^ 반가워";
    }

    public List<String> getFood(){
        List<String> list = new ArrayList<>();
        list.add("초밥");
        list.add("샌드위치");
        list.add("김치 볶음밥");

        return list;
    }

}
