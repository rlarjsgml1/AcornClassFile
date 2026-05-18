package day1prac.라이브러리만들기;

public class MyLIbMain {
	
	public static void main(String[] args) {
		MyLib lib = new MyLib();
		
		lib.printChar('k');
		lib.printStar();
		
		lib.codeRun(new CodeRunnable() {
			@Override
			public void codeRun() {
				System.out.println("실행하고 싶은 코드");
			}
		});
		
		lib.codeRun(new CodeRunnable() {
			@Override
			public void codeRun() {
				System.out.println("저는 한화");
			}
		});
	}
	
}
