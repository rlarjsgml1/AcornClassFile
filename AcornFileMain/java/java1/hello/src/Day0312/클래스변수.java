package Day0312;

public class 클래스변수 {
	static int  index = 0; //클래스 전역변수가 됨, 클래스내의 있는 모든 메서드에서 접근 가능
	public static void 수증가하기() {
		// TODO Auto-generated method stub
		index++;
	}
	
	public static void 출력하기() {
		// TODO Auto-generated method stub
		System.out.println(index);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int index = 0; //index를 메인에서 만들면 계속 전달하고 증가된 값은 반환받아서 사용해야함
		//int index = 0; // => 클래스내애 있는 모든 메서드가 함께 사용할 수 있는 클래스 전역변수로 만들 수 있다 => main 위 클래스 안쪽
		수증가하기();
		
		출력하기();
		
		
	}

}
