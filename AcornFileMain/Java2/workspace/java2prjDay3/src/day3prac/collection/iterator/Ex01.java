package day3prac.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("딸기");
		list.add("포도");
		list.add("사과");

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String item = it.next();
			System.out.println(item);

		}
		
	}
}
