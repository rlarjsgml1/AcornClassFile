package day4prac.reflect;

 
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/*
 * [공부 순서 12]
 * 리플렉션 종합 예제
 *
 * 앞에서 나눠서 연습한 내용을 한 파일에서 다시 확인한다.
 * 1. Class.forName()으로 Class 객체 얻기
 * 2. Constructor로 객체 생성하기
 * 3. Method로 메서드 정보 얻고 invoke()로 호출하기
 * 4. Field로 필드 정보 얻기
 * 5. Method 배열로 전체 메서드 목록 확인하기
 */
public class ReflectTest {
	public static void main(String[] args) 
	throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 1. 클래스 객체 얻어오기
		// Class 객체는 "클래스 정보를 담은 객체"이다.
		// 문자열로 클래스명을 넘기기 때문에, 나중에 이 문자열을 설정 파일에서 읽어오도록 바꿀 수 있다.
		Class clazz1 = Class.forName("day4prac.reflect.Member");
		System.out.println("\n==========매개변수가 없는 생성자 정보 가져오기==============\n"); 

		// 2. 매개변수가 없는 기본 생성자 정보를 가져온다.
		Constructor constructor = clazz1.getDeclaredConstructor();		
		System.out.println("Constructor: " + constructor.getName());
		
		
		System.out.println("\n==========매개변수가 없는 생성자 정보로 객체 생성하기==============\n");
		// 3. 생성자 정보를 얻어온 다음 객체를 생성할 수 있다.
		// 아래 코드는 new Member()와 비슷하지만, 리플렉션을 통해 생성한다는 점이 다르다.
		Member m =(Member) constructor.newInstance();
		m.printSquare(5);
		
		
		System.out.println("\n==========매개변수가 있는 생성자 정보로 객체생성하기=============\n");
		// 4. 매개변수가 있는 생성자는 매개변수 타입을 정확히 적어야 찾을 수 있다.
		 Constructor constructor2 = clazz1.getDeclaredConstructor(String.class,String.class);
		
		System.out.println("Constructor(String,String): " + constructor2.getName());

		// 5. 생성자 호출 시 실제 인자값을 넘긴다.
		Member m2 =(Member) constructor2.newInstance("victoai","1234");
		System.out.println( m2 ); 
		
		
		System.out.println("\n==========클래스정보로 부터 매서드 정보가져오기==============\n");

		// 6. printSquare(int) 메서드 정보를 가져온다.
		// 메서드 이름과 매개변수 타입을 함께 적어야 정확한 메서드를 찾는다.
		Method printSquare = clazz1.getDeclaredMethod("printSquare", int.class);
		System.out.println( printSquare);
		
		
		System.out.println("\n==========클래스정보로 부터 매서드 정보가져온 다음 호출하기=============\n");
		// 7. Method 객체는 정보만 담고 있으므로 invoke()로 실제 실행해야 한다.
		// 첫 번째 인자: 메서드를 실행할 객체
		// 두 번째 인자부터: 실제 메서드에 전달할 값
		printSquare.invoke( clazz1.getDeclaredConstructor().newInstance() ,6);
		
		
		System.out.println("\n=======매소드를 객체를 이용하여 매소드 실제 호출, invoke==================\n");

		// 8. 매개변수가 없는 printInfo() 메서드 정보를 가져온다.
		Method method1 = clazz1.getDeclaredMethod("printInfo");
		System.out.println( method1);
		
		
		// 9. String, String 생성자로 객체를 만든 뒤 그 객체의 printInfo()를 호출한다.
		method1.invoke( clazz1.getDeclaredConstructor(String.class,String.class).newInstance("hong","5678") );
		System.out.println("\n=======클래스객체로 부터 필드정보 얻어오기====================\n");
		
		
		// 10. Member 클래스에 선언된 필드(id, pw) 정보를 가져온다.
		Field fields[] = clazz1.getDeclaredFields();
		for (Field field : fields) {
			System.out.println( field);
		}
		
		
		// 11. Member 클래스에 선언된 메서드 목록을 전부 출력한다.
		Method[] methods = clazz1.getDeclaredMethods();
		for (Method method : methods) {
		    System.out.println("Method name: " + method.getName());		   
		}

		
		
	}
}
