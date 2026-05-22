package Day0309;

public class 배열1차원_문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//영화이름 5개 출력하기
		String[] movie = new String[5];
		
		movie[0] = "왕과사는남자";
		movie[1] = "기생충";
		movie[2] = "앨빈과 슈퍼밴드";
		movie[3] = "그린북";
		movie[4] = "왕의 남자";
		//movie[5]="새로운 영화"; 배열은 반드시 선언한 만큼 사용한다.
		
		for(int i = 0; i<movie.length;i++) {
			System.out.println(movie[i]);
		}
		
		//배열선언 및 초기화
		String[] strs = new String[] {"행복", "나쁨", "슬픔", "우울", "자상"};
		
		for(int i = 0; i<strs.length; i++) {
			System.out.println(strs[i]);
		}
		
		String[] strss = {"자","상", "해", "누", "가"};
		for(int i = 0; i<strss.length; i++) {
			System.out.print(strss[i]);
		}
		
	}

}
