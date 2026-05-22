package Day0305;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 고객정보(아이디, 이름,  나이 ,키 )  출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요");
		String id = sc.nextLine();
		
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력하세요");
		int old = sc.nextInt();
		
		System.out.println("키(신장)을 입력해주세요");
		double height = sc.nextDouble();
		
		System.out.println("아이디:" + id);
		System.out.println("이름:" + name);
		System.out.println("나이:" +old+"살");
		System.out.println("키(신장):" +height);
	}

}
