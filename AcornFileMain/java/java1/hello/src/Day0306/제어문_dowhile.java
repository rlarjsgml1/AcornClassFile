package Day0306;

public class 제어문_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		do {
//			while(조건);
//		}
		
		//1~10까지 합구하기
		//do~while 사용하기
		// 1 2 3 4 5 6 7 8 9 10
		int sum = 0;
		int i = 0;
		do {
			i= i+1;
			sum = sum + i;
		}while( i<10);
		System.out.println(sum);
	}

}
