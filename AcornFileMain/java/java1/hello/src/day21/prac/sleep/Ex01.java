package day21.prac.sleep;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("3초후 공개");
		//sleep
		//자신의 스레드만 sleep할 수 있다
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 1초 1000 임
		System.out.println("ㅊㅊㅊㅊㅊ 공개합니다 ^^");
	}
}
