package day4prac.변경에유리한코드;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 
		
				//Dog 객체   =>Cat객체 변경
		        //객체를 생성하기를 매서드 사용하기 
				
				
				Animal   animal  =  getAnimal();			 
				Animal   animal2=   getAnimal(); 
				
				
				animal.bark();
				animal2.bark();
		

	}
	
	
	public static Animal  getAnimal() {
		//return new Dog();
		 return new Cat();
	}

}
