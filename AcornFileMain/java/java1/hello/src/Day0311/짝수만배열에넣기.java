package Day0311;

import java.util.Scanner;

public class 짝수만배열에넣기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10개의 수가 입력될 때 짝수만 배열에 담아서
		//출력하라
		//출력 : 짝수만 담긴 배열 : 짝수배열(10)
		//입력 : 어떤 수 (입력되는 수) : num
		//처리 : 반복제어변수 : i
				//짝수배열의 인덱스 : index
		
		int [] su = new int[10];
		int num;
		int index =0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i< 10; i++) {
			num = sc.nextInt();
			if(num %2==0) {
				su[index] = num;
				index++;
			}
		}
	}

}
