package Day0320.라이브러리;

public class 이용찬Imp implements TeacherCodeRun {

	@Override
	public void codeRun() {
		// TODO Auto-generated method stub
		
		System.out.println("Hello 구구단");
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}

}
