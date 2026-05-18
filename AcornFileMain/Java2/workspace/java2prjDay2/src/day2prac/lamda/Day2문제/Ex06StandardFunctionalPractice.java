package day2prac.lamda.Day2문제;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex06StandardFunctionalPractice {

	public static void main(String[] args) {
		Runnable bucketList = () -> {
			System.out.println("[Runnable] 버킷리스트");
			System.out.println("1. 자바 프로젝트 완성하기");
			System.out.println("2. 여행 가기");
			System.out.println("3. 운동 꾸준히 하기");
		};
		bucketList.run();

		Consumer<List<String>> shopping = items -> {
			System.out.println("[Consumer] 3만원으로 장보기");
			items.forEach(item -> System.out.println("- " + item));
		};
		shopping.accept(List.of("계란 7,000원", "두부 3,000원", "김치 8,000원", "돼지고기 12,000원"));

		Supplier<String> cooking = () -> {
			System.out.println("[Supplier] 요리 만들기");
			System.out.println("1. 돼지고기를 볶는다.");
			System.out.println("2. 김치를 넣고 같이 볶는다.");
			System.out.println("3. 물과 양념을 넣고 끓인다.");
			return "김치찌개";
		};
		String myFood = cooking.get();
		System.out.println("완성 요리: " + myFood);

		Predicate<String> isMyFood = food -> food.equals(myFood);
		System.out.println("[Predicate] 김치찌개는 내가 만든 요리인가? " + isMyFood.test("김치찌개"));
		System.out.println("[Predicate] 라면은 내가 만든 요리인가? " + isMyFood.test("라면"));

		Function<Integer, Integer> square = number -> number * number;
		System.out.println("[Function] 6의 제곱 = " + square.apply(6));

		Function<Integer, Integer> randomRange = range -> (int) (Math.random() * range) + 1;
		System.out.println("[Function] 1부터 10 사이 난수 = " + randomRange.apply(10));

		Function<Integer, String> moneyCount = money -> {
			int man = money / 10000;
			money %= 10000;
			int chun = money / 1000;
			money %= 1000;
			int baek = money / 100;
			return "10000원권 " + man + "장, 1000원권 " + chun + "장, 100원권 " + baek + "개";
		};
		System.out.println("[Function] 37600원 화폐매수 = " + moneyCount.apply(37600));
	}
}
