package Day0323.선택정렬;

import java.util.Arrays;

public class Arrays라이브러리사용하기2 {
	public static void main(String[] args) {
		Score[] scores = new Score[5];

		scores[0] = new Score("김민경", 100, 80);
		scores[1] = new Score("송주창", 70, 85);
		scores[2] = new Score("김민정", 99, 79);
		scores[3] = new Score("김재민", 85, 70);
		scores[4] = new Score("김건희", 88, 89);
		
		for (Score s : scores) {
			System.out.println(s.toString());
			// System.out.println(s);
		}
		
		//정렬하기
		Arrays.sort(scores, new ComparatorImp());
		
		
	}
}
