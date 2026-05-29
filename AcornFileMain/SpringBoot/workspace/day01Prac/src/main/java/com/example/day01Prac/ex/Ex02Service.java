package com.example.day01Prac.ex;

import org.springframework.stereotype.Service;

@Service
public class Ex02Service {

    // 3단 구구단 1~9까지의 문자열 배열을 만든다.
    public String[] getDan3() {
        String[] dan = new String[9];

        for (int i = 0; i < dan.length; i++) {
            dan[i] = "3*" + (i + 1) + "=" + (3 * (i + 1));
        }

        return dan;
    }
}
