package Day0324.오후수업.prac.ex;

public class Ex01 {
	public static void main(String[] args) {
		//예외 만나기
		int[] arr = new int [3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40; //.ArrayIndexOutOfBoundsException
		
		System.out.println("종료");
	}
}
