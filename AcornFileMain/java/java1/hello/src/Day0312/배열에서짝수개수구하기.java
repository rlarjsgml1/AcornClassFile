package Day0312;
//자바에서코드 작성법
//반드시 클래스가 있어야 한다
//실행기능한 클래스가 되려면 반드시 약속된 main 메서드가 있어야한다.
public class 배열에서짝수개수구하기 {
	//기능:인사하기
	//입력(매개변수)
	//반환
	public static void hi() {
		System.out.print("hello java");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//코드작성 => 함수(메서드)로 분리하기
		//System.out.print("hello java");
		int result = 배열에서짝수개수구하기(new int[] {12, 8, 6, 5, 3});
		System.out.println(result);
	}
	/*
	 기능 : 배열에서짝수개수구하기
	 입력(매개변수) : 배열(정수배열)
	 반환 : 짝수의 개수
	 */
	public static int 배열에서짝수개수구하기(int[] nums) {
		int cnt = 0;
		for(int i = 0; i< nums.length; i++) {
			if(nums[i] % 2 == 0) {
				cnt++;
			}
		}
		return cnt;
	}
}