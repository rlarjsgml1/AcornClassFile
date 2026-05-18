package day2prac.lamda.Day2문제;

import java.util.function.Consumer;

public class MovingNameConsumer implements Consumer<String> {

	@Override
	public void accept(String name) {
		System.out.println(name);
	}
}
