package Day0312;

public class 수증가하기함수2 {
	//기능 : 수증가 시키기
	//입력 : 수
	//반환 : 증가된 수
	public static int 수증가하기(int index) {
		index++;
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = 0;
		//수증가 
		수증가하기(index);
		//수증가
		수증가하기(index);
		
		System.out.print(index);
		
	}
}
