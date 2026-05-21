package day5prac.애너테이션;

import java.lang.reflect.Field;

public class FoodMain {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Food food = new Food("비빔밥", 560);
		검증하기(food);
		
		Food food2 = new Food("된장찌개", 160);
		검증하기(food2);
	}

	private static void 검증하기(Food food) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub

		Class clazz = food.getClass();

		Field field = clazz.getDeclaredField("calroie");

		int value = (int) field.getInt(food);
		System.out.println(value);

		MAXCalorie annotation = field.getAnnotation(MAXCalorie.class);
		if(annotation != null) {
			int  에너테이션설정값 = annotation.value();
			
			if(value > 에너테이션설정값) {
				System.out.println("다이어트 식품이 No");
			} else {
				System.out.println("다이어트 식품 Ok");
			}
		}
	}

}
