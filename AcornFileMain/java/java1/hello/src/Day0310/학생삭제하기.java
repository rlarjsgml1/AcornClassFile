package Day0310;

import java.util.Scanner;

public class 학생삭제하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] names = new String[5];
		names[0] ="김민경";
		names[1] ="황스일";
		names[2] ="김건희";
		names[3] ="김민정";
		names[4] ="장해든";
		
		//전체 조회 학생번호 , 이름 
		for(int i = 0; i<names.length; i++) {
			System.out.println((i+1) + names[i]);
		}
		
		//삭제할 번호:
		System.out.println("삭제할 번호 입력:");
		int deletNo = sc.nextInt();
		
		//삭제할 이름에 "x" 빈문자열 저장(임의의 문자열);
		names[deletNo -1] = "x";
		System.out.println("삭제되었습니다");
		
		//전체조회하기
		
		//문자열의 비교는 equals() 제공, 같으면 true, false 반환됨
		for(int i = 0; i<names.length; i++) {
			if(!names[i].equals("x")) {
				System.out.println(names[i]);
			}
		}
		
	}

}
