package day5prac.스택큐;

 
class Game implements Comparable<Game>{
	String name;
	int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Game(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Game [name=" + name + ", price=" + price + "]";
	}
	
	public Game() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Game o) {
		// TODO Auto-generated method stub
		return this.price - o.price; //o.price = this.price 내림차순 할려면 이렇게 해야함
	}
	 
}