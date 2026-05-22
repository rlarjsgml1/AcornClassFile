package Day0319.상속객체실습프로그램;

public class Food extends Product{

	String date; 
	
	public Food(String name, int price, int stock, String date) {
		super(name, price, stock);
		
		this.date = date;
		// TODO Auto-generated constructor stub
	}
	
	public Food() {
        super();
    }

    public void print(String name, int price, int stock, String date, int index) {

    }

}
