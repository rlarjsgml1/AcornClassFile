package day5prac.애너테이션;

public class Store {
	
	@Count(value = 5)
	private int apples;
	
	@Count(3)
	private int bananas;
	
	@Count
	private int tomatos;
	
	public Store() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Store [apples=" + apples + ", bananas=" + bananas + ", tomatos=" + tomatos + "]";
	}

	public Store(int apples, int bananas, int tomatos) {
		super();
		this.apples = apples;
		this.bananas = bananas;
		this.tomatos = tomatos;
	}

	public int getApples() {
		return apples;
	}

	public void setApples(int apples) {
		this.apples = apples;
	}

	public int getBananas() {
		return bananas;
	}

	public void setBananas(int bananas) {
		this.bananas = bananas;
	}

	public int getTomatos() {
		return tomatos;
	}

	public void setTomatos(int tomatos) {
		this.tomatos = tomatos;
	}
	

}
