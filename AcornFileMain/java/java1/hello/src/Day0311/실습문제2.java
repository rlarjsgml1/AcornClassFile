package Day0311;

public class 실습문제2 {
	public static String[] weather() {
		String[] weather = {
				"날씨: 내일의 최고 기온은 12도로 , 더 높은 기온이 예상됨니다",
				"지금 현재 날씨는 3도 입니다",
				"미세먼지는 나쁨입니다 마스크를 끼고 나가주세요",
				"최저 온도 0도 입니다 여러분 좋은 하루되세요"
				};
		return weather;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] result = weather();
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
