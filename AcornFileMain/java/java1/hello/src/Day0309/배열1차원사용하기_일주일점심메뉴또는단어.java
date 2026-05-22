package Day0309;

public class 배열1차원사용하기_일주일점심메뉴또는단어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] food = {"한우국밥", "돼지국밥", "순대국밥", "선지해장국", "제육"};
		
		for(int i= 0; i<food.length; i++) {
			System.out.println((i+1)+"일");
			System.out.println(food[i]);
		}

	}

}
