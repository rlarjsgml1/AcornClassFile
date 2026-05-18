package day2prac.lamda.Day2문제;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ex01MovingSort {

	public static void main(String[] args) {
		ArrayList<Moving> list = new ArrayList<>();
		list.add(new Moving("장주원", "구룡포", 100));
		list.add(new Moving("이미현", "경기", 80));
		list.add(new Moving("김두식", "문산", 90));
		list.add(new Moving("전영석", "봉평", 88));

		Collections.sort(list, new MovingPowerComparator());
		System.out.println("인터페이스를 구현한 클래스 이용 - 파워 오름차순");
		list.forEach(item -> System.out.println(item));

		Collections.sort(list, new Comparator<Moving>() {
			@Override
			public int compare(Moving o1, Moving o2) {
				return o1.getPower() - o2.getPower();
			}
		});
		System.out.println("익명 클래스 이용 - 파워 오름차순");
		list.forEach(item -> System.out.println(item));

		Collections.sort(list, Comparator.comparing(item -> item.getPower()));
		System.out.println("Comparator.comparing 이용 - 파워 오름차순");
		list.forEach(item -> System.out.println(item));
	}
}
