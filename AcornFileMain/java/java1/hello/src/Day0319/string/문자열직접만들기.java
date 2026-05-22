package Day0319.string;

public class 문자열직접만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'h';
		char b = 'e';
		char c = 'l';
		char d = 'l';
		char e = 'o';
		
		char[] word = {a, b, c, d, e};
		
		//word[0] = 'h';
		
		//반복문
		
		for(int i = 0; i<word.length; i++) {
			System.out.println(word[i]);
		}
		
		printCharArray(word);
		String resultStr=myToString(word);
		System.out.println(resultStr);
		
		String str = "hello"; //char[] 배열 + 메서드로 제공한다
		System.out.println(str.toString());
		System.out.println(str);
		
		char result = str.charAt(5);
		System.out.println(result);
	}
	
	public static void printCharArray(char[] arr) {
		for(int i = 0 ; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static String myToString(char[] arr) {
		String str= "";
		for(int i = 0; i<arr.length; i++) {
			str += arr[i];
		}
		return str;
	}
}
