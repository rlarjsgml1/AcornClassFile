package Day0309;

public class 배열1차원사용하기_좋아하는음식5개저장하고출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] food = {"토마토스파게티", "돼지국밥", "돈까스", "김밥", "대방어회"};
		
		System.out.println("좋아하는 음식 5개");
		for(int i = 0; i<food.length; i++) {
			System.out.print(food[i] + " ");
		}
	}

}
