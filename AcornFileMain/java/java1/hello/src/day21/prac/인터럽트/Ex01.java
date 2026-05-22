package day21.prac.인터럽트;

public class Ex01 {
	public static void main(String[] args) {
		Smile smile = new Smile();
		smile.start();
		
		try {
			Thread.sleep(5000);
			System.out.println("메인작업 수행");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		smile.interrupt();
		System.out.println("메인스레드 종료");
	}
}
