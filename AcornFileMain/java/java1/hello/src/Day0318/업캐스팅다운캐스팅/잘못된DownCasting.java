package Day0318.업캐스팅다운캐스팅;

public class 잘못된DownCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal();
		Cat cat = new Cat();
		
		//부모 : Animal
		//자식 : Dog
		
		//UpCasting
		//DownCasting
		
		//DownCasting 시도
		//올바른 DownCasting인가?
		Cat aa = (Cat)animal;
		
		aa.쥐를잡는다();
		aa.짖다();
	}

}
