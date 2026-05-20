package day4prac.오후실습_건희민정;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;


public class 음식추천프로그램 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Properties pp = new Properties(); // key=value 형태의 설정파일을 읽을 때 사용
		
		//설정파일 내용을 메모리로 읽음
		pp.load( new FileReader("src/day4prac/오후실습_건희민정/config.txt")); 
		int random = (int)(Math.random()*3)+1;
		
		String key ="food" + random;
		String className = pp.getProperty(key); //food의 값 즉 txt 파일의 우항값 가져옴
		System.out.println(className);
		
		Class clazz = Class.forName(className);
		Food food = (Food) clazz.getDeclaredConstructor( ).newInstance( );
		
		
		food.recommend();

	}

}
