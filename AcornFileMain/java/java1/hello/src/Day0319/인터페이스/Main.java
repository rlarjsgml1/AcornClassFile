package Day0319.인터페이스;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		Dog dog = new Dog();
		Cook cook = new Cook();
		AcornStudent s = new AcornStudent();
		전투가능한[] list = new 전투가능한[] {
				cat, dog, cook, s
		};
//		list[0] = cat;
		for(int i = 0; i<list.length; i++) {
			list[i].싸운다();
		}
	}

}
