package Day0319.string;

public class 문자열만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//상수영역에 "hello"라는 문자열이 저장되고 공유하면서 사용함
		String str = "hello";
		String str2 = "hell";
		
		//두 문자열의 주소와 내용이 같은 것인가?
		if(str.equals(str2)) {
			System.out.println("내용이 같다");
		}
		
		if(str.equals(str2)) {
			System.out.println("내용이 다르다");
		}
		
		
		
		//예상하기
		//두 문자열은 주소, 내용 같은 것 인가?
		
		String str3 = new String("hell1");
		String str4 = new String("hello1");
		
		//두 문자열의 주소와 내용이 같을 것인가?
		if(str3.equals(str4)) { //equals 문자열을 내용 비교하기 
			System.out.println("내용이 같다");
		}
		//주소
		if(str3 == str4) {
			System.out.println("두 주소가 같다");
		}
	}

}
