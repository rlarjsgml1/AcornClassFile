package com.example.day01Prac.ex;

import org.springframework.stereotype.Service;

@Service
public class Ex01Service {

    // 컨트롤러에서 받은 두 숫자를 더해서 반환한다.
    public int calc(int su1, int su2) {
        return su1 + su2;
    }
}
