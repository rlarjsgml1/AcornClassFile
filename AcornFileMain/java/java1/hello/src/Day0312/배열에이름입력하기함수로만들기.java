package Day0312;

import java.util.Scanner;

public class 배열에이름입력하기함수로만들기 {
	//입력하기
	public static void 입력하기(String[] names) {
		//이름배열에 등록하기
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<names.length; i++) {
			names[i] = sc.nextLine();
		}
	}
	public static void 출력하기(String[] names) {
		for(int i =0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[5]; //names는 참조형변수입니다. 위치정보를 저장한다(배열의 위치정보)
		
		입력하기(names); //call by reference
		
		출력하기(names); 
	}

}
