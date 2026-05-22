package Day0319.arraylist;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		ArrayList<Score> list = new ArrayList();
		list.add(new Score("김민경", 50, 60)); //Object로 저장
		list.add(new Score("김건희", 90, 80));
		list.add(new Score("김재민", 100, 90));
		list.add(new Score("황스일", 90, 89));
		
		for(int i = 0; i<list.size(); i++) {
			Score score = list.get(i);
			System.out.println(score.toString());
			score.printInfo();
		}
	}
}
