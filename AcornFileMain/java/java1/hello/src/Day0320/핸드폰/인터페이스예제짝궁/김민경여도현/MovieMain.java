package Day0320.핸드폰.인터페이스예제짝궁.김민경여도현;

import java.util.Scanner;

public class MovieMain {

	Reserve movieReserve; // 인터페이스 의존

	Payment p;

	public void setReserve(Reserve reserveService) {
		this.movieReserve = reserveService;
	}

	public void setP(Payment p) {
		this.p = p;
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

//		p = new CardPayment();
		
		Movie[] movies = new Movie[3];

		for (int i = 0; i < movies.length; i++) {
			movies[i] = new Movie();
		}

		movies[0].inputMovie("Interstellar", "SF", 10000, 10);
		movies[1].inputMovie("Avengers", "Action", 20000, 5);
		movies[2].inputMovie("LaLaLand", "Musical", 30000, 8);

		int totalSales = 0;

		while (true) {

			System.out.println("\n===== Movie List =====");

			for (int i = 0; i < movies.length; i++) {
				System.out.print((i + 1) + ". ");
				movies[i].printInfo();
			}

			System.out.println("0. Exit");

			System.out.print("Select movie: ");
			int choice = sc.nextInt();

			if (choice == 0)
				break;

//			if (choice >= 1 && choice <= 3) {
//				p.pay(movieReserve.reserve(movies[choice - 1]));
//				totalSales += movieReserve.reserve(movies[choice - 1]);
//			}
			if (choice >= 1 && choice <= 3) {

				int price = movieReserve.reserve(movies[choice - 1]);

				// 🎯 매출 증가
				totalSales += price;

			}
		}

		System.out.println("총 매출: " + totalSales);
		sc.close();
	}

	public static void main(String[] args) {

		MovieMain m = new MovieMain();

		// 일반 객체 주입
		m.setReserve(new MovieReserve());

		// 익명 클래스
//		m.setReserve(new Reserve() {
//
//			@Override
//			public int movieReserve(Movie movie) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		});

		m.run();
	}
}