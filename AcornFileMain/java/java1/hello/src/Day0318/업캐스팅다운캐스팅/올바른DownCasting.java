package Day0318.업캐스팅다운캐스팅;

public class 올바른DownCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Animal 부모
		//Cat 자식
		Cat cat = new Cat();
		
		//1.new에 의해서 Cat type 대로 메모리할당
		//2.new가 반환한 메모리의 주소를 cat이라는 참조형변수가 위치정보를 저장하고 사용함
		//3.참조형변수의 Type은 가르키는 대상에 대한 해석 정보이다
		
		//UpCasting
		//부모로 참조한다는 것은 부모타입으로 해석하겠다는 것임
		//해석의 도구가 부모만큼으로 줄어듬
		Animal a = cat;
		
		//해석의 도구 부모만큼으로 줄어들었다 확인
		a.짖다(); //쥐잡는기능은 사용할 수 없다 ... 
		
		
		//cat의 고유기능, 쥐를 잡는 기능을 사용하려면 
		//DownCasting을 해야한다.
		//올바른 다운캐스팅이라는 것은 반드시 UpCasting된 후에 다시 자식타입으로 바꿀때 만 올바른 DownCasting 된다.
		((Cat)a).쥐를잡는다(); // ok
		
		//또는
		
		Cat cc = (Cat)a; //ok
		cc.쥐를잡는다();
		
	}
}