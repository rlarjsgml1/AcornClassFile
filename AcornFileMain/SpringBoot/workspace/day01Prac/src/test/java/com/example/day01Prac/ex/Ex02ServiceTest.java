package com.example.day01Prac.ex;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
class Ex02ServiceTest {

    @Autowired
    Ex02Service service;

    @Test
    void getDan3() {
        String[] result = service.getDan3();

        assertArrayEquals(new String[]{
                "3*1=3",
                "3*2=6",
                "3*3=9",
                "3*4=12",
                "3*5=15",
                "3*6=18",
                "3*7=21",
                "3*8=24",
                "3*9=27"
        }, result);
    }
}
