package Day0319.상속객체실습프로그램;

public class Product {

	String name;
	int price;
	int stock;
	
	public Product() {};
	
	public Product(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
		
	}
	
	public void setStock(int Stock) {
		this.stock = stock;
	}
}
