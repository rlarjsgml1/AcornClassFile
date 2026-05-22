package Day0318.상속;

public class Customer {
	String name;
	String email;
	String phoneNumber;
	
	//매개변수가 잇는 생성자
	public Customer(String naem , String email, String phoneNumber) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return name + " " + email + " " + phoneNumber;
	}
}
