package Day0312;

public class 함수를사용하는이유1_중복코드제거 {
	//함수로 분리하면 중복코드제거, 유지보수가 좋아짐
	//코드의 집중하기 됨
	public static void 양치질하기() {
		for(int i = 0; i<=5; i++) {
			System.out.println("1. 치역을 짠다.");
			System.out.println("2. 이름을 닦는다.");
			System.out.println("3. 행군다.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("1. 치역을 짠다.");
//		System.out.println("2. 이름을 닦는다.");
//		System.out.println("3. 행군다.");
		
		양치질하기();
	}

}
