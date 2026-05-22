package Day0312;

public class 설날음식만들기실습_함수로분리 {
	//만두
	public static String 만두만들기() {
		String 음식1;
		System.out.println("만두만들기1");
		System.out.println("만두만들기2");
		System.out.println("만두만들기3");
		System.out.println("만두만들기4");
		음식1 = "김치만두";
		return 음식1;
	}
	//떡국
	public static String 떡국만들기(String 음식1) {
		System.out.println("떡국만들기1");
		System.out.println("떡국만들기2" + 음식1 + "넣는다");
		String 음식2 = "떡국";
		return 음식2;
	}
	
	//산적
	public static String 산적만들기(String 음식2) {
		System.out.println("산적만들기1");
		System.out.println("산적만들기2");
		System.out.println("산적만들기3");
		System.out.println("산적만들기4");
		String 음식3 = "오색산적";
		return 음식3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//만두
//		String 음식1;
//		System.out.println("만두만들기1");
//		System.out.println("만두만들기2");
//		System.out.println("만두만들기3");
//		System.out.println("만두만들기4");
//		음식1 = "김치만두";
		String 음식1 = 만두만들기();
		
		//떡국
//		System.out.println("떡국만들기1");
//		System.out.println("떡국만들기2" + 음식1 + "넣는다");
//		String 음식2 = "떡국";
		String 음식2 = 떡국만들기(음식1);
		
		//산적
//		System.out.println("산적만들기1");
//		System.out.println("산적만들기2");
//		System.out.println("산적만들기3");
//		System.out.println("산적만들기4");
//		String 음식3 = "오색산적";
		String 음식3 = 산적만들기(음식2);
		
		//상차리기
		System.out.println("상차리기");
		System.out.println(음식1 + 음식2 + 음식3);
	}

}
