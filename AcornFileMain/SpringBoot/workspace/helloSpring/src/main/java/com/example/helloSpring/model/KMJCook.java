package com.example.helloSpring.model;

//에러나는 이유

//상속고관계에서 자식의 생성자에서는 부모의 생성자(기본생서자를 호출)
//하는 코드가 자동으로 들어감

//해보기
//생성자 해결
//3개 인터페이스 중에서 한 개를 구현한 다음
//제출하기
public class KMJCook extends Cook implements 한식가능한{


	public KMJCook(String name) {
		//부모의 기본생성자를 호출하는 코드가 자동으로 들어감
		//super();
		//super(name);
		
		super(name);
		System.out.println("자식 기본생성자");
		//this.name=name; => 부모값은 부모의 생성자에게 할 수 있도록 함
	}
	

	@Override
	public String toString() {
		return "KMJCook [name=" + name + "]";
	}



	public static void main(String[] args) {
		KMJCook w = new KMJCook("김민정");
	}



	@Override
	public String 비빔밥만들기() {
		// TODO Auto-generated method stub
		return "야채가득비빔밥";
	}

}
