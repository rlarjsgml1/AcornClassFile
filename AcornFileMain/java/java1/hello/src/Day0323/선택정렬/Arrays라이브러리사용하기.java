package Day0323.선택정렬;

import java.util.Arrays;

public class Arrays라이브러리사용하기 {
	public static void main(String[] args) {
		Score[] scores = new Score[5];

		scores[0] = new Score("김민경", 100, 80);
		scores[1] = new Score("송주창", 70, 85);
		scores[2] = new Score("김민정", 99, 79);
		scores[3] = new Score("김재민", 85, 70);
		scores[4] = new Score("김건희", 88, 89);
		
		Arrays.sort(scores);
		
		//객체의 요소가 Comparable를 구현해야 한다
		//즈 정렬의 기준을 책임져야 한다 
		
		for (Score s : scores) {
			System.out.println(s.toString());
			// System.out.println(s);
		}
		
		//javaprj.day15.선택정렬.Score cannot be cast to class java.lang.Comparable
		
		//Score Comparable 사이가 상속관계가 아니다 
		
	}
}
