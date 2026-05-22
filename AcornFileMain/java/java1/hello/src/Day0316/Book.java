package Day0316;

public class Book {
	
	String title; 
	String auther;
	int price;
	
	public void 입력하기(String title, String auther, int price) {
		this.title = title;
		this.auther = auther;
		this.price = price;
	}
	public void 출력하기() {
		System.out.println("제목:" + this.title);
		System.out.println("내용:" + this.auther);
		System.out.println("가격:" + this.price + "\n");
	}

}
