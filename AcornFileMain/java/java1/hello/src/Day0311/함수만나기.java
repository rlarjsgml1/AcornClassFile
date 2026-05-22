package Day0311;

import java.util.Scanner;

public class 함수만나기 {
	
	//반환타입type 기능명(함수명
	public static int[] 화폐매수구하기(int money) {
		int[] result = new int[8];
		int a = money / 50000;     //오만원권
		money = money % 50000;     //잔액
		
		int b = money / 10000;    //만원권
		money = money % 10000;    //잔액
		
		int c = money / 5000;
		money = money % 5000;
		
		int d = money / 1000;
		money = money % 1000;
		
		int e = money / 500;
		money = money % 500;
		
		int f = money / 100;
		money = money % 100;
		
		int g = money / 50;
		money = money % 50;
		
		int h = money / 10;
		money = money % 10;
		
		System.out.println("오만원 = " + a);
		System.out.println("만원 = " + b);
		System.out.println("오천원 = " + c);
		System.out.println("천원 = " + d);
		System.out.println("오백원 = " + e);
		System.out.println("백원 = " + f);
		System.out.println("오십원 = " + g);
		System.out.println("십원 = " + h);
		
		result[0]=a;
		result[1]=b;
		result[2]=c;
		result[3]=d;
		result[4]=e;
		result[5]=f;
		result[6]=g;
		result[7]=h;
		//int[] result = {a, b, c, d, e, f, g, h};
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//지역변수는 그 함수안에서만 사용가능하다.
		int[] 화폐매수배열 = 화폐매수구하기(365120);
		for(int i=0; i<화폐매수배열.length; i++) {
			System.out.print(화폐매수배열[i] + " ");
		}
	}

}
