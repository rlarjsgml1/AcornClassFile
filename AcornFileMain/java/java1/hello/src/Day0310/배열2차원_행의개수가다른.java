package Day0310;

import java.util.Scanner;

public class 배열2차원_행의개수가다른 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9},
		};
		
		arr[0][0] = 11;
//		System.out.print(arr[0][0]);
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		//행의 개수가 다른 2차원 배열 만들기
		//3행, 각행의 열의 개수 다르게 하기
		int[][] arr2 = new int[3][];
		arr2[0]= new int[3]; // 첫번째 행은 3열
		arr2[1]= new int[5]; //두번재 행은 5열
		arr2[2] = new int[2]; //세번째 행은 2열
		
		//1행
		arr2[0][0] =2;
		arr2[0][1] =4;
		arr2[0][2] =6;
		
		//2행
		arr2[1][0] = 8;
		arr2[1][1] = 7;
		arr2[1][2] = 9;
		arr2[1][3] = 1;
		arr2[1][4] = 3;
		
		//3행
		arr2[2][0] = 13;
		arr2[2][1] = 14;
		
		//반복문으로 출력하기
		for(int i =0 ; i< arr2.length; i++) {
			for(int j =0; j<arr2[i].length;j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
