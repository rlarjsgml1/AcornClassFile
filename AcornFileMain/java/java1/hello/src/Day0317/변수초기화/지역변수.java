package Day0317.변수초기화;

public class 지역변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a; //지역변수 메서드안에서 만들어지는 변수 지역변수
		
		int result = add(5,3);
		System.out.println(result);
	}
	/*
	 * add에서 만든 지역변수는 add 호출될 때 만들어졌다가 return될 때 모두 정리 됨
	 * 
	 * */
	public static int add(int su1, int su2) {
		int total;
		total = su1 + su2;
		return total;
	}

}
