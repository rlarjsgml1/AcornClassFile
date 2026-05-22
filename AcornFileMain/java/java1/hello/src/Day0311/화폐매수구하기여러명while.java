package Day0311;
import java.util.Scanner;
public class 화폐매수구하기여러명while {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열은 자료형이 같고, 배열선언시 크기를 정해야한다
		int[][] 화폐매수배열 = new int[3][8];
		int[] 화폐단위배열 = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		//반복(while) - 돈이 0이면 종료하기
		//출장비입력
		//화폐매수 구하기
		Scanner sc = new Scanner(System.in);
		int index = 0; //행의 index
		while(true) {
			int money = sc.nextInt();
			System.out.print(money);
			if(money == 0) break;
			//화폐매수구하기
			for(int i = 0; i<화폐단위배열.length; i++) {
				화폐매수배열[index][i] = money / 화폐단위배열[i];
				money = money%화폐단위배열[i];
			}
			index++;
			//00 01 02 03 04 05 06 07
			//10 11 12 13 14 15 16 17
		}
		//화폐매수 출력하기(2차원배열 출력하기) //index 행만큼 출력하기(index : 사람 인원수만큼)
		for(int i =0; i<index; i++) {
			for(int j=0; j<8; j++) {
				System.out.print(화폐매수배열[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("bye");
	}
}
