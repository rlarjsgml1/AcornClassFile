package day5prac.애너테이션;

import java.lang.reflect.Field;

public class CusmterMain {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		Customer c = new Customer("010-1234");
		검증하기(c);

	}

	private static void 검증하기(Customer c) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub

		// ? extends Object

		Class<?> clazz = c.getClass();
		// Field[] fields = clazz.getDeclaredFields();

		/*
		 * for(Field fields : fields) { System.out.println(fields); }
		 */

		Field field = clazz.getDeclaredField("tel");
		
		field.setAccessible(true);
		
		//필드의 실제 값
		String value = (String) field.get(c);
		
		
		System.out.println(value);
		
		MaxLen annotation =  field.getAnnotation(MaxLen.class);
		
		if(annotation != null) {
			int 에너테이션값 = annotation.lenght();
			
			//비교하기
			if(value.length() > 에너테이션값) {
//				System.out.println(에너테이션값 + "이내여야 한다!!");
				throw new RuntimeException(에너테이션값 + "이내여야 한다!!");
			}
		}
		//에너테이션에 설정된 값 얻어오기
		
		

	}

}
