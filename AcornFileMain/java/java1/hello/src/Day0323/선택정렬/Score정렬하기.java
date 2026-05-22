package Day0323.선택정렬;

public class Score정렬하기 {
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

		// Score[] 국어 kor 배열 정렬하기
		for (int i = 0; i < scores.length - 1; i++) { // 기준요소
			for (int j = i + 1; j < scores.length; j++) {
				if (scores[i].kor > scores[j].kor) { // 기준이 크면 두개의 자리를 바꾸기
					Score tmp;
					tmp = scores[i];
					scores[i] = scores[j];
					scores[j] = tmp;
				}
			}
		}

		// 정렬후
		System.out.println("\n 국어 정렬후 ===>");
		for (Score s : scores) {
			System.out.println(s.toString());
		}

		// Score[] 배열 정렬하기
		for (int i = 0; i < scores.length - 1; i++) { // 기준요소
			for (int j = i + 1; j < scores.length; j++) {
				if (scores[i].eng > scores[j].eng) { // 기준이 크면 두개의 자리를 바꾸기
					Score tmp;
					tmp = scores[i];
					scores[i] = scores[j];
					scores[j] = tmp;
				}
			}
		}
		// 정렬후
		System.out.println("\n 영어 정렬후 ===>");
		for (Score s : scores) {
			System.out.println(s.toString());
		}

	}
}
