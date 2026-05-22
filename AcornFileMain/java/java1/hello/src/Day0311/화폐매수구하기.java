package Day0311;

public class 화폐매수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 50000;
		int[] 화폐매수배열 = new int[8];
		int[] 화폐단위배열 = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		
		for(int i=0; i<화폐매수배열.length; i++) {
			화폐매수배열[0] = money / 화폐단위배열[i];
			money = money % 화폐단위배열[i];
		}
		
		for(int i =0; i<화폐매수배열.length; i++) {
			System.out.print(화폐매수배열[i] + " ");
		}
	}

}
