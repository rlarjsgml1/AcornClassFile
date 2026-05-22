package hello;

import java.util.Scanner;

public class 여도현성적처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력
		String name;
		int kor,eng,math;
		//출력
		double avg;//개인평균
		String grade;//개인평가
		double avgKor,avgEng, avgMat;
		//처리
			//과목별 합계
		int totalKor = 0,totalEng=0,totalMat = 0;
		final int MAX =3;
		
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=MAX;i++) {
			name = sc.nextLine();
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			sc.nextLine();
			
			avg =(kor+eng+math)/3.0; 
			totalKor = totalKor + kor;
			totalEng = totalEng + eng;
			totalMat = totalMat + math;
			
			if(avg>=90) {
				grade = "Excellent";
			} else if( avg < 60) {
				grade = "Fail";
			} else {
				grade = "";
			}
			System.out.println(name + kor + " " + eng + " " + math);
			
		}
		avgKor = totalKor/MAX;
		avgEng = totalEng/ MAX;
		avgMat = totalMat/MAX;
		
		System.out.println(avgKor);
		System.out.println(avgEng);
		System.out.println(avgMat);	
	}
}
