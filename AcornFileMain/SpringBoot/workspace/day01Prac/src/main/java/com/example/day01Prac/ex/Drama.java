package com.example.day01Prac.ex;

import lombok.Data;

@Data
public class Drama {
    private String title;        // 드라마명
    private int season;          // 시즌
    private int year;            // 방영년도
    private String broadcaster;  // 방송사
    private String genre;        // 장르
    private int episodes;        // 회차
    private String mainActor;    // 주연
    private String summary;      // 줄거리
}
