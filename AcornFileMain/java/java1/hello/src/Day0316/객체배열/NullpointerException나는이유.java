package Day0316.객체배열;

public class NullpointerException나는이유 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//성적데이터 저장할 배열 만들기
		//객체배열만들기
		//int[] a= new int[3];
		Score[] arr = new Score[3];
		
		//1. 성적객체가 만들어진것이 아니다.
		// =>성적 객체를 참조하는 참조형변수가 배열로 만들어진 것이다
		// => 참조형변수가 배열로 만들어지면 참조형변수의 기본값인 null로 초기화됨
		
		//arr[0].printInfo(); //실행하면 NullpointerException남
		
		arr[0] = new Score(1, 90, 50,30);
		arr[1] = new Score(2, 80, 40,20);
		arr[2] = new Score(3, 70, 30,10);
		
		arr[0].printInfo();
		arr[1].printInfo();
		arr[2].printInfo();
		
		
	}

}
