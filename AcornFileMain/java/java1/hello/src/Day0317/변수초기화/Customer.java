package Day0317.변수초기화;

public class Customer { //new에 의해서 변수(객체가 만들어짐)
	//인스턴스 변수
	String name;
	int age; //기본초기화
	int point = 100; //명시적초기화
	
	//생성자
	
	//인스턴스 초기화 블럭
	{
		
	}
	
	public Customer() {}
	
	public Customer(String name, int age, int point) {
		this.name = name;
		this.age = age;
		this.point = point;
	}
	
	//toString
	//getter
	//setter
}
