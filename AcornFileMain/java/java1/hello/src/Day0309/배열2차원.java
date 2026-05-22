package Day0309;

import java.util.Scanner;

public class 배열2차원 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원배열: 1차원배열의 집합, 1차원배열을 여러개 가지고 있는 배열
		//접근방법 : 
		//배열명[행 인덱스][ 열인덱스]
		//배열을 기준으로 몇번째 1차원배열인지 찾는다.(행 찾기)
		//찾은 1차원 배열에서 몇번째 요소인지 찾는다(열찾기)
		/*
		 조 출력 : 재미있게 해줘
		 손영석 황스일 장해든 이현겸
		 이용찬 박세인 김태준 고지연
		 정철진 엄진희 김민경 여도현
		 이정하 나해수 조아진 장윤성
		 송주창 김민정 김재민 김건희
		  */
		
		//2차원배열 만들고 초기화하기
		String[][] teams = {
				{"손영석", "황스일", "장해든", "이현겸"},
				{"이용찬", "박세인", "김태준", "고지연"},
				{"정철진", "엄진희", "김민경", "여도현"},
				{"이정하", "나해수", "조아진", "장윤성"},
				{"송주창", "김민정", "김재민", "김건희"}
		};
		
		//for중첩문으로 다 행열 출력하기 
				for(int i = 0; i<teams.length; i++) {
					System.out.println("\n" + (i +1) + "조");
					for(int j = 0; j<teams[i].length;j++) {
						System.out.print(teams[i][j]);
					}
				}
		
		//1초 첫번재 팀(다운캐스팅)
		System.out.println("1조 다운캐스팅");
		System.out.print(teams[0][0]);
		System.out.print(teams[0][1]);
		System.out.print(teams[0][2]);
		System.out.print(teams[0][3]);
		
		//2조 두번째팀
		System.out.println("\n2 2조 다운캐스팅");
		System.out.print(teams[1][0]);
		System.out.print(teams[1][1]);
		System.out.print(teams[1][2]);
		System.out.print(teams[1][3]);
		
		//3조 두번째팀
		System.out.println("\n3 3조 다운캐스팅");
		System.out.print(teams[2][0]);
		System.out.print(teams[2][1]);
		System.out.print(teams[2][2]);
		System.out.print(teams[2][3]);
		
		//4조 세번재 팀
		System.out.println("\n4 4조 다운캐스팅");
		System.out.print(teams[3][0]);
		System.out.print(teams[3][1]);
		System.out.print(teams[3][2]);
		System.out.print(teams[3][3]);
		
		//5조 다번째 팀
		System.out.println("\n5 5조 오버라이딩");
		System.out.print(teams[4][0]);
		System.out.print(teams[4][1]);
		System.out.print(teams[4][2]);
		System.out.print(teams[4][3]);
		
		//2차원 배열 -> 중첩반복 해결
		
		//행이 반복
			//열반복
		
		for(int i = 0; i< 5; i++) {
			//i행의 정보 출력하기 행 => 1차원 배열
			System.out.println("\n" + (i +1) + "조");
			for(int j = 0; j<4; j++) {
				///j => 행의 첫번재 요소인지
				System.out.print(teams[i][j]);
			}
		}
		
		//2차원 배열 만들고 사용하기 
		String[][] teams2 = new String[5][4];
		//String은 기본값 null 로 초기화됨
		
		//첫번재 행 
		teams2[0][0] = "손영석";
		teams2[0][1] = "황스일";
		teams2[0][2] = "장해든";
		teams2[0][3] = "이현겸";
		
		//두번째 행
		teams2[1][0] = "이용찬";
		teams2[1][1] = "박세인";
		teams2[1][2] = "김태준";
		teams2[1][3] = "고지연";
		
		//세번째 행
		teams2[2][0] = "정철진";
		teams2[2][1] = "엄진희";
		teams2[2][2] = "김민경";
		teams2[2][3] = "여도현";
		
		//네번째 행
		teams2[3][0] = "이정하";
		teams2[3][1] = "나해수";
		teams2[3][2] = "조아진";
		teams2[3][3] = "장윤성";
		
		//다섯번째 행
		teams2[4][0] = "송주창";
		teams2[4][1] = "김민정";
		teams2[4][2] = "김민재";
		teams2[4][3] = "김건희";
		
		//teams2
		
		Scanner sc = new Scanner(System.in);
		System.out.println("행, 열을 입력해주세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i = 0; i<teams2.length; i++) {
			System.out.println("\n" + (i +1) + "조");
			for(int j = 0; j<teams2[i].length;j++) {
				if(i == a && j == b){
				System.out.print(teams2[i][j]);
				}
			}
		}
		
		
	}

}
