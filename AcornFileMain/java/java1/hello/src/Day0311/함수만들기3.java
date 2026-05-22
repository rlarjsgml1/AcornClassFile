package Day0311;

import java.util.Arrays;

public class 함수만들기3 {
	//입력 : x 반환 : o
	//예상로또번호
	public static int[] 예상로또번호추천하기() {
		//return new int[] {15, 8, 9, 10 ,44, 36};
		int[] lotto = {15, 8, 9, 10 ,44, 36};
		return lotto;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result = 예상로또번호추천하기();
		//직접반복하기
		//라비브러리사용하기 - Arrays.toString(result);
		System.out.println(Arrays.toString(result));
	}

}
