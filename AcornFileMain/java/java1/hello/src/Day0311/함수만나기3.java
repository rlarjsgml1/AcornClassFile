package Day0311;

public class 함수만나기3 {
	/*
	 * 기능 : 한 달 단어 출력하기
	 * 입력 : x
	 * 반환 : x
	 */
	
	/*
	 * 기능 : 한 달 단어 제공하기
	 * 입력 : x
	 * 반환 : 단어2차원배열
	 */
	
	/*
	 * 기능 : 일주일 단어 출력하기
	 * 입력 : 원하는 주 : weeek int 1 
	 * 반환 : 단어2차원배열
	 */
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//한달 단어정보
		String[][] word = {
				{"apple", "book", "cat", "dog", "egg"},
				{"fish", "game", "home", "ice", "juice"},
				{"key", "lion", "moon", "name", "orange"},
				{"pen", "queen", "rain", "sun", "tree"}
			};
		System.out.println("한 달동안 외워야 하는 단어");
		for(int i =0; i< word.length; i++) {
			System.out.println((i+1) + "주");
			for(int j =0; j<word[i].length; j++) {
				System.out.print(word[i][j] + " ");
			}
			System.out.println();
		}
	}
}
