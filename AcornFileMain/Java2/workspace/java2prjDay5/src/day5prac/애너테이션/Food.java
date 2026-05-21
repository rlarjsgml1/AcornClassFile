package day5prac.애너테이션;

public class Food {
	String name;

	@MAXCalorie(value = 290)
	int calroie;

	public Food(String name, int calroie) {
		super();
		this.name = name;
		this.calroie = calroie;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", calroie=" + calroie + "]";
	}

}
