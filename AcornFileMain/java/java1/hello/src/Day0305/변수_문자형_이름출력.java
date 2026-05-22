package Day0305;

public class 변수_문자형_이름출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 0xC6B0;
		char b = 0xC8FC;
		char c = 0xC5F0;
		
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		
		char d = '딸';
		char e = '기';
		
		System.out.print(d);
		System.out.print(e);
		
		//문자 -> 숫자로 표현
		//유니코드 : 전세계 문자에 대한 코드 표 
		
		char gg = 0xAD00;
		System.out.println(gg);
		
		//"딸기"
		//문자배열
		//char[] fruit = new char [2];
		//fruit[0] = '딸';
		//fruit[1] = '기';
		
		char[] fruit = new char [2];
		fruit[0] = '딸';
		fruit[1] = '기';
		for(int i = 0; i<fruit.length; i++) {
			System.out.print(fruit[i]);
		}
	}

}
