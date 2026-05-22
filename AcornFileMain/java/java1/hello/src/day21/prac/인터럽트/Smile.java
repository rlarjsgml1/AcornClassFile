package day21.prac.인터럽트;

public class Smile extends Thread{
	@Override
	public void run() {
		/*
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("^__^");
		}
		*/
		//isInterrupted() => 인터럽트가 안걸렸으면 false
		//					 인터럽트가 걸렸으면 true
		while(!isInterrupted()) { //false, true
			
			System.out.println("^__&");
		}
		System.out.println("웃음끝");
	}
}
