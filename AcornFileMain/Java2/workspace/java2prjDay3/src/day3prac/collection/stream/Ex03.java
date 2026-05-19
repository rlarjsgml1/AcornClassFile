package day3prac.collection.stream;

import java.util.ArrayList;
import java.util.Comparator;

public class Ex03 {
	public static void main(String[] args) {

		ArrayList<Acorn> list = new ArrayList<>();

		list.add(new Acorn("고지연", 89));
		list.add(new Acorn("김민정", 89));
		list.add(new Acorn("이현겸", 89));
		list.add(new Acorn("박세인", 89));
		list.add(new Acorn("여도현", 89));

		// 1.정렬하고 출력하기

		// list.stream().soted().forEach(item->System.out.println(item)); => Acorn이
		// Comparable 구현해야함
		list.stream().sorted((o1, o2) -> o1.getScore() - o2.getScore()).forEach(item -> System.out.println(item));
		System.out.println("========================");

		list.stream().sorted(new Comparator<Acorn>() {
			@Override
			public int compare(Acorn o1, Acorn o2) {
				// TODO Auto-generated method stub
				return o1.getScore() - o2.getScore();
			}
		}).forEach(item -> System.out.println(item));

		
		System.out.println("========================");
		// Comparator.comparing
		list.stream().sorted(Comparator.<Acorn, Integer>comparing((item) -> {
			return item.getScore();
		})).forEach(item -> System.out.println(item));

	}

}
