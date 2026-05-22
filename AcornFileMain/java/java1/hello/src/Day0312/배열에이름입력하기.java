package Day0312;

import java.util.Scanner;

public class 배열에이름입력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] names = new String[5]; //null로 초기화
		//이름배열에 등록하기
		for(int i = 0; i<names.length; i++) {
			names[i] = sc.nextLine();
		}
		//이름배열출력하기
		for(int i =0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
