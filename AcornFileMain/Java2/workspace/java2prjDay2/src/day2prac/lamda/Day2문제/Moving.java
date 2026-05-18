package day2prac.lamda.Day2문제;

public class Moving {

	private String name;
	private String alias;
	private int power;

	public Moving(String name, String alias, int power) {
		this.name = name;
		this.alias = alias;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public String getAlias() {
		return alias;
	}

	public int getPower() {
		return power;
	}

	@Override
	public String toString() {
		return "Moving [name=" + name + ", alias=" + alias + ", power=" + power + "]";
	}
}
