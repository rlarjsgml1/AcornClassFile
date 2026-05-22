package Day0311;

public class 실습문제3 {

	public static String[] weather() {
		String[] weather = {
				"월요일: 맑음",
				"화요일: 비",
				"수요일: 흐림",
				"목요일: 맑음",
				"금요일: 비",
				"토요일: 맑음",
				"일요일: 눈"
		};
		return weather;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. 주간날씨정보를  반환하는 함수 만들기
		String[] result = weather();
		for(int i = 0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
