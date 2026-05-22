package Day0311;

public class 실습문제4 {

	public static String food(){
		String[] foods = {
				"삼겹살",
				"족발",
				"보쌈 및 막국수",
				"햄버거",
				"먹지마셈"
		};
		int index = (int)(Math.random() * foods.length);
		return foods[index];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4. 오늘 메뉴 추전해주는 함수 만들기 ( Math.random()  )사용하여  메뉴배열에서 임의의 메뉴를 반환하기
		System.out.print(food());
	}

}
