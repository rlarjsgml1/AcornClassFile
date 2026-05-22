package Day0306;

public class 제어문_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//반복문에서 특정조건일 대 아래코드를 수행하지 않고 다음반복으로 넘어가게 해 줌
		//홀수합구하기 continue를 사용해서 구하기
		
		//1 3 5 7 9....
		
		int oddSum = 0;
		
		for(int i = 1; i<10; i+=2) {
			
			if(i%2 == 0) continue;
			System.out.println(i);
			oddSum = oddSum +i;
			//System.out.println(oddSum);
		}
		System.out.println(oddSum);
		
	}

}
