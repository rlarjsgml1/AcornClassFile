package Day0309;

import java.util.Scanner;

public class 배열문제_입력받고출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//좋아하는 음식 5개 입력받아서 출력하기
		//입력
		//출력의 단계를 구분해서 실행하기
		
		Scanner sc = new Scanner(System.in);
		
		String[] foods = new String[5];
		//foods[0] = "마카롱";
		//System.out.println(food[0]);
		
		//입력
		System.out.println("좋아하는 음식 입력하세요 5개");
		
		for(int i = 0; i< foods.length; i++) {
			foods[i] = sc.nextLine();
		}
		
		//출력
		System.out.println("당신이 좋아하는 음식은 아래와 같아요 !!!");
		for(int i = 0; i< foods.length; i++) {
			System.out.println(foods[i]);
		}
		
	}
}
