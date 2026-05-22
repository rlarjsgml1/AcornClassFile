package Day0320.계산기인터페이스.실습;

public class WJYCalculator  implements  Calculator {

	@Override
	public int add(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("주연이의 더하기 기능");
		return  su1+su2;
	}

	@Override
	public int sub(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("주연이의 빼기 기능");
		return su1-su2;
	}

}
