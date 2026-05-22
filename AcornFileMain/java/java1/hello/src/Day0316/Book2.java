package Day0316;

public class Book2 {
	String title;
	String author;
	int price;
	
	public void Book1input(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public void Book1Save() {
		System.out.println("제목:" + this.title);
		System.out.println("내용:" + this.author);
		System.out.println("가격:" + this.price + "\n");
		
	}
}
