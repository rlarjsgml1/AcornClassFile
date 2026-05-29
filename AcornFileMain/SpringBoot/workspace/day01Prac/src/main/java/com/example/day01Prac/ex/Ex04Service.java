package com.example.day01Prac.ex;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Ex04Service {
    public List<Drama> getDramaList(){
        Drama d1 = new Drama();
        d1.setTitle("모범택시");
        d1.setSeason(1);
        d1.setYear(2021);
        d1.setBroadcaster("SBS");
        d1.setGenre("범죄, 액션");
        d1.setEpisodes(16);
        d1.setMainActor("이제훈");
        d1.setSummary("억울한 피해자들을 대신해 복수하는 무지개 운수의 이야기");

        Drama d2 = new Drama();
        d2.setTitle("선재 업고 튀어");
        d2.setSeason(1);
        d2.setYear(2024);
        d2.setBroadcaster("tvN");
        d2.setGenre("로맨스, 판타지");
        d2.setEpisodes(16);
        d2.setMainActor("변우석, 김혜윤");
        d2.setSummary("최애 아티스트 선재를 살리기 위해 과거로 돌아간 임솔의 이야기");

        Drama d3 = new Drama();
        d3.setTitle("옷소매 붉은 끝동");
        d3.setSeason(1);
        d3.setYear(2021);
        d3.setBroadcaster("MBC");
        d3.setGenre("사극, 로맨스");
        d3.setEpisodes(17);
        d3.setMainActor("이준호, 이세영");
        d3.setSummary("정조와 궁녀 성덕임의 애절한 사랑을 그린 궁중 로맨스");

        List<Drama> dramaList = new ArrayList<>();
        dramaList.add(d1);
        dramaList.add(d2);
        dramaList.add(d3);

        return dramaList;
    }
}
