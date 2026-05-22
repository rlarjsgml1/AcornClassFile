package Day0312구조화된데이터;

public class foodE {
	public static void input(Food Food) {
		Food.foods = "맛동산";
		Food.price = 3000;
	}
	public static void result(Food Food) {
		System.out.println(Food.foods);
		System.out.println(Food.price);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food food = new Food();
		
		input(food);
		result(food);
	}

}
