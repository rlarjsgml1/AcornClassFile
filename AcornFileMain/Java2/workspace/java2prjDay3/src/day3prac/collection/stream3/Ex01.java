package day3prac.collection.stream3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList<Acorn> list = new ArrayList<>();

		list.add(new Acorn("고지연", 85));
		list.add(new Acorn("김민정", 72));
		list.add(new Acorn("이현겸", 91));
		list.add(new Acorn("박세인", 68));
		list.add(new Acorn("여도현", 80));
		
		//1. 80이상인 학생 출력하기
		list.stream().filter(item -> item.getScore()>=80).forEach(item -> System.out.println(item));
		
		//1-1 80 이상인 학생 리스트 만들기
		
		List<Acorn> list2  = list.stream().filter(item -> item.getScore()>= 80).collect(Collectors.toList());
		System.out.println(list2);
		
		//2. 80이상인 인원수 구하기
		long cnt = list.stream().filter(item-> item.getScore()>=80).count();
		
		System.out.println(cnt);
		
		
	}

}
