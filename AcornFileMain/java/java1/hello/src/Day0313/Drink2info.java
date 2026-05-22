package Day0313;

public class Drink2info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//drink 변수 => 참조형
		Drink2 drink = new Drink2();
			//객체라고 부른다()
		
		//1.input을 통해서 위에서 만든변수에 값 넣기
		drink.input("초코젤라또 말차라떼", 4000, true, "150칼로리");
		//input 메서드가 호출될때 drink정보가 제공됨
		//print라고 메서드를 호출하면 drink 정보(위치정보)가 제공된다
		//2.print를 통해서 위에서 만든변수의 내용출력하기
		drink.print();
		
		Drink2 drink2 = new Drink2(); //변수가 만들어짐, 구조가 있는 변수가 만들어짐
		drink2.input("라이트 바닐라 아몬드", 3900, true, "200칼로리");
		drink2.print();
	}
//객체 메서드 -> 구조화된변수를 사용하는 메서드
//				변수를 만드는후부터 사용할 수 있다ㄴ
}