package day5prac.enumEx;

public class Ex01 {
	public static void main(String[] args) {
		
		//상수
		String mode = "DARK";
		mode = "abc"; // 지정된 값 이외의 값을 막을 수 없다
		
		//enum 사용하기
		Mode enummode = null;
		enummode = Mode.DARK;
		enummode = Mode.LIGHT;
		
	}
}
