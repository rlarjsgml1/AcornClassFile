package Day0320.라이브러리;

public class 정철진Imp implements TeacherCodeRun{
	@Override
	public void codeRun() {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " × " + j + " = " + (i*j));
			}
			System.out.println();
		}
	}
}
