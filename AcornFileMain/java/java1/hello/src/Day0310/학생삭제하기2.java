package Day0310;

import java.util.Scanner;

public class 학생삭제하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] names = new String[5];
		names[0] ="김민경";
		names[1] ="황스일";
		names[2] ="김건희";
		names[3] ="김민정";
		names[4] ="장해든";
		
		int index = 5;
		
		//전체 조회 학생번호 , 이름 
		for(int i = 0; i<names.length; i++) {
			System.out.println((i+1) + names[i]);
		}
		
		//삭제할 번호 선택
		int deleteNo = sc.nextInt(); //2
		
		//삭제할 index = 삭제할 index  +1;
		for(int i =deleteNo-1; i<names.length;i++) {
			names[i] = names[i+1];
		}
		
		//삭제할 학생번호 : 2
		//삭제할 인덱스 :1
		
		//i = 1
		//i = 2
		//i = 3
		System.out.println("삭제후 조회");
		for(int i = 0; i<names.length; i++ ) {
			System.out.println(names[i]);
		}
		index = index -1;
		
		System.out.println("삭제후 조회, 등록한 학생 이름만 조회하기");
		for(int i = 0; i<index; i++ ) {
			System.out.println(names[i]);
		}
	}

}
