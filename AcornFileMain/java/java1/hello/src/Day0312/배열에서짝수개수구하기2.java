package Day0312;
//자바에서코드 작성법
//반드시 클래스가 있어야 한다
//실행기능한 클래스가 되려면 반드시 약속된 main 메서드가 있어야한다.
public class 배열에서짝수개수구하기2 {
	//함수를 만들기 힘들면
	//메인에서 동작하는 프로그램으로 작성하기
	public static int extracted() {
		int[] nums = {8, 12, 6, 8 , 15, 3};
		//짝수의 개수 구하기
		int cnt = 0 ;
		for(int i = 0; i< nums.length; i++) {
			if(nums[i] % 2 ==0 ) {
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = extracted();
		int result = cnt;
		System.out.print(result);
	}
}