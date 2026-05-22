package Day0310;

public class 약수구하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력:어떤수 su
		//출력 : 약수배열 약수(su)
		int su = 6;
		int[] 약수 = new int[su];
		
		
		int index=0; //약수발견시 카운트 증가 => 배열의 index
		
		for(int i = 1; i<=su; i++) {
			if(su% i==0) {
				약수[index] = i;
				index ++;
			}
		}
		//약수출력하기
		for(int i = 0; i<index; i++) {
			System.out.println(약수[i]);
		}
	}

}
