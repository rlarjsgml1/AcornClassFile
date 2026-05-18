package day2prac.lamda.Day2문제;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Ex02ForEachPractice {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("장주원");
		names.add("이미현");
		names.add("김두식");
		names.add("전계도");
		names.add("프랭크");
		names.add("김봉석");
		names.add("장희수");
		names.add("이강훈");

		System.out.println("인터페이스를 구현한 클래스 사용");
		names.forEach(new MovingNameConsumer());

		System.out.println("익명 클래스 사용");
		names.forEach(new Consumer<String>() {
			@Override
			public void accept(String name) {
				System.out.println(name);
			}
		});

		System.out.println("람다식 사용");
		names.forEach(name -> System.out.println(name));
	}
}
