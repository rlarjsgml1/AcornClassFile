package Day0309;

public class 배열2차원사용하기_한달점심메뉴또는단어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] food =  {
				{"돼지국밥","제육", "선지해장국", "햄버거", "그녀의밥상(보쌈)"},
				{"순대국밥", "회", "봉골레파스타", "맥도날드", "막국수"},
				{"보쌈", "된장찌개", "삼겹살", "쭈꾸미", "참이슬"},
				{"족발", "김치찌개", "떡볶이", "막걸리", "맥주"}
		};
		System.out.println("한달 점심메뉴");
		for(int i = 0; i<food.length; i++) {
			System.out.println((i+1) + "주일");
			for(int j =0; j<food[i].length; j++) {
				System.out.print(food[i][j] + " ");
			}
			System.out.println();
		}
	}

}
