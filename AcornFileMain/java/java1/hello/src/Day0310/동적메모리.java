package Day0310;

import java.util.Scanner;

public class 동적메모리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] =sc.nextInt();
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
