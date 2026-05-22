package Day0310;

import java.util.Scanner;

public class 학생이름등록하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//5명 학생이름을 저장할 배열 준비
		String[] names = new String[5]; //String은 null로 초기화
		int index=0;//배열의 index
		
		//학생등록하기
		
		//등록할 학생이름 입력하세요
		System.out.println("학생이름 입력: ");
		String name = sc.nextLine();
		names[index] = name;
		index++;
		
		System.out.println("학생이름 입력: ");
		name = sc.nextLine();
		names[index] = name;
		index++;
		
		System.out.println("학생이름 입력: ");
		name = sc.nextLine();
		names[index] = name;
		index++;
		
		System.out.println("학생이름 입력: ");
		name = sc.nextLine();
		names[index] = name;
		index++;
		
		//학생조회하기(등록한 개수만큼 조회하기)
		for(int i = 0; i<index; i++) {
			System.out.println(names[i]);
		}
		
		
		
	}

}
