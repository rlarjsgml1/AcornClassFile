package day4prac.변경에유리한코드;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Ex04 {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, IOException {
		// TODO Auto-generated method stub
		
	 
		
				//Dog 객체   =>Cat객체 변경
		        //객체를 생성하기를 매서드 사용하기  
				
				Animal   animal  =  getAnimal();			 
				Animal   animal2=   getAnimal(); 
				
				
				animal.bark();
				animal2.bark();
		

	}
	
	
	public static Animal  getAnimal() throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		
		
		Properties    p = new Properties();
		p.load( new FileReader("src/day4prac/변경에유리한코드/config.txt"));
		String name =p.getProperty("animal");
		
		
		Class clazz  = Class.forName(name);
		Animal  animal =  (Animal) clazz.getDeclaredConstructor().newInstance();
		 		
		return animal;
		//return new Dog();
		// return new Cat();
		
		
	}

}
