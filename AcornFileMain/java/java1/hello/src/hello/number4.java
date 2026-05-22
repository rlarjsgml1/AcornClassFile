package hello;

import java.util.Scanner;

public class number4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("학수 수 입력해주세요 : ");
		int N = sc.nextInt();
		sc.nextLine();
		
		int sumKor = 0, sumEng = 0, sumMath = 0;
		for(int i = 1; i<=N; i++) {
			System.out.println(i + "번째 학생");
			System.out.print("이름: ");
			String name = sc.nextLine();
			
			System.out.print("국어: ");
			int kor = sc.nextInt();
			
			System.out.print("영어: ");
			int eng = sc.nextInt();
			
			System.out.print("수학: ");
			int math = sc.nextInt();
			sc.nextLine();
			
			double avg = (kor + eng + math)/3.0;
			
			sumKor += kor;
			sumEng += eng;
			sumMath += math;
			
			String grade;
			if(avg >=90) {
				grade = "EXCELLENT";
			} else if(avg < 60) {
				grade = "FAIL";
			} else {
				grade = "FASS";
			}
			System.out.printf("이름:%s 국어:%d 영어:%d 수학:%d 평균:%.2f 평가:%s%n",
			          name, kor, eng, math, avg, grade);
			
		}
		// 과목별 평균 출력
	    double avgKor = sumKor / (double) N;
	    double avgEng = sumEng / (double) N;
	    double avgMath = sumMath / (double) N;

	    System.out.println("\n=== 과목별 평균 ===");
	    System.out.printf("국어 평균: %.2f%n", avgKor);
	    System.out.printf("영어 평균: %.2f%n", avgEng);
	    System.out.printf("수학 평균: %.2f%n", avgMath);

	    sc.close();
	}

}
