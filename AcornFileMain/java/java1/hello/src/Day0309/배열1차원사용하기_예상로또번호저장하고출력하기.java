package Day0309;

public class 배열1차원사용하기_예상로또번호저장하고출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[] {
				4, 9, 11, 23, 31, 39
		};
		
		System.out.println("이번주 로또 번호");
		for(int i = 0;i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
