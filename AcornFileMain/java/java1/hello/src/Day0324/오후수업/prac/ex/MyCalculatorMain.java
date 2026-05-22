package Day0324.오후수업.prac.ex;

public class MyCalculatorMain {
	public static void main(String[] args) {
		MyCalculator cal = new MyCalculator();
		int total = 0;
		try {
			total = cal.add(3, -3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("음수면 다른 처리를 하겠다");
		}
		System.out.println(total);
		
		//int result = cal.add(3, 5);
		try {
			cal.add(5, -2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		System.out.println("종료");
	}
}
