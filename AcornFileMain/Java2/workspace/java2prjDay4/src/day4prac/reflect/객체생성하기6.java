package day4prac.reflect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * [공부 순서 7]
 * config.txt에서 클래스명을 읽어 객체 생성하기
 *
 * 이 예제의 목적은 "소스 코드 변경 없이 클래스 교체하기"이다.
 * 코드 안에 Member 클래스를 직접 적는 대신 config.txt의 값을 읽는다.
 *
 * config.txt 예:
 * member=day4prac.reflect.Member
 */
public class 객체생성하기6 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		
		// 전체 흐름:
		// 1. 설정 파일 읽어오기
		// 2. "member=클래스명" 형식에서 클래스명만 분리하기
		// 3. 클래스명으로 Class 객체 얻기
		// 4. 생성자 정보로 객체 생성하기
		
		
		String className="";		

		// 프로젝트 기준 상대 경로로 config.txt를 읽는다.
		BufferedReader  br =	new BufferedReader( new  FileReader("src/day4prac/reflect/config.txt"));
		
		String line  =br.readLine();
		System.out.println(line);
		
		// line은 "member=day4prac.reflect.Member" 형태이다.
		// split("=") 결과: result[0]은 member, result[1]은 실제 클래스명
		String[] result  = line.split("=");
		className = result[1];
		
		System.out.println(className);
		
		// 문자열 클래스명을 이용해 런타임에 클래스 정보를 얻는다.
		Class clazz  =Class.forName(className);

		// 기본 생성자를 찾고, 그 생성자로 객체를 만든다.
		Constructor  c=clazz.getDeclaredConstructor( );
		
		Member m  = (Member)c.newInstance();
		m.printSquare(5);
		
		
		
		
		
		
		
		
		

	}

}
