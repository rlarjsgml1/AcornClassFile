package Day0310;

public class 약수구하기1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//어떤 수 -> 약수를 출력하세요
		//약수를 구하면서 출력하기
		//약수 6약수 : 1~6사이의 수 주에서 6 나눠떨어트리는 수
		//6 -> 1, 2,3 6
		
		int su =6 ;
		for(int i = 1; i<=su; i++) {
			if(su % i ==0) {
				System.out.println(i);
			}
		}
	}

}
