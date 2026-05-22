package Day0324.오후수업.prac.ex;

public class Ex03 {
	public static void main(String[] args) {
		
		//unChecked exception  예외처리방법 : try~catch~finally
		try {
		int[] arr = new int[3];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40; //ArrayIndexOutOfBoundsException 발생해서 프로그램은 정상정료 안됨 => unChecked excption
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println(e.getMessage());
			//System.out.println("배열의 길이를 넘어감");
		}
		System.out.println("프로그램 종료");
	}
}
