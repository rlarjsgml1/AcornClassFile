package Day0310;

import java.util.Scanner;

public class 학생변경하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//학생이름5개 등록되어 있다고 생각하자
		String[] names = new String[] {"이용찬", "이현겸", "김민정", "황스일", "고지연"};
		
		//전체조회
		for(int i = 0; i<names.length; i++) {
			System.out.println((i + 1) + names[i]);
		}
		
		System.out.println("변경할 학생번호 입력:");
		int updateNo = sc.nextInt();
		sc.nextLine(); //남아 있는 엔터키 값 제거하기
		
		System.out.println("변경할 이름 입력");
		String newName = sc.nextLine();
		names[updateNo-1] = newName;
		
		System.out.println("변경이완료되어있습니다");
		
		for(int i =0; i<names.length; i++) {
			System.out.println((i + 1) + names[i]);
		}
		
		
	}

}
