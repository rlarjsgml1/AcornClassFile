package day21.prac.join;

public class ThreadA extends Thread {
	private int sum;

	public int getSum() {
		return sum;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			sum += i;
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}