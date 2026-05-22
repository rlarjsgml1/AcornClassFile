package Day0309;

import java.util.Scanner;

public class 문제2_현겸 {

	public static void main(String[] args) {
		
		int[] lottoNum = new int[6];
		boolean flag = false;	// 중복을 검사할 플래그
		
		Scanner sc = new Scanner(System.in);
		
		// 여섯 개의 숫자 입력 받기
		int i = 0;
		while(i < 6) {
			System.out.println("\n" + (i + 1) + "번째 예상 로또 번호를 입력하세요.");
			lottoNum[i] = sc.nextInt();
			
			// 유효성 검사
			if(lottoNum[i] < 1 || lottoNum[i] > 45) {
				System.out.println("1~45의 값 중에 입력해 주세요.");
				continue; // 다시 입력 받기
			} else { // 정상 흐름
			
			// 중복 검사
			int j = 0;
			while(j < i) {
				if(lottoNum[i] == lottoNum[j]) {
					System.out.println("중복 숫자입니다.");
					flag = true;
					break;
				} else {
					flag = false; // 정상일 때 false
					j++;
				}
			}
			if(flag == true) { // 중복일 시 다시 입력 받기
				continue;
			}else if(flag == false) { // 정상 흐름
				i++;
			}
		}
		}
		
		// 출력
		System.out.print("예상 로또 번호는");
		for(int k = 0; k < 6; k++) {
			System.out.print(lottoNum[k] + " ");
		}
		System.out.println("입니다.");
		
	}

}
