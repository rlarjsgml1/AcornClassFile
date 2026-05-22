package Day0318.상속;

public class VIPCustomer extends Customer{
	double discountRate;
	
	//생성자
	//자식의 생성자
	//자식의 생성자에서 명시하지 않으면(명시적으로 부모의 생성자를 호출하지 않으면 ) 기본으로 무조건 부모의 기본생성자를 호출한다
	public VIPCustomer(String name, String email, String phoneNumber,double discountRate) {
		super(name, email,phoneNumber);
		this.discountRate =discountRate;
	}
	
	/*
	 public VIPCustomer(String name, String email, String phoneNumber, double discountRate){
	 	this.name = name;
	 	this.email = email
	 	this.phoneNumber = phoneNumber;
	 	this.discountRate = discountRate;
	 }
	  */
	
	//부모의 toString()
	//자식의 toString()
	//이름이 같은 메서드가 있을 때 부모의 메서드를 호출하려면 super.toString();
	public String toString() {
		String str = super.toString();
		return str + " " + discountRate;
	}
	public void printInfo() {
		System.out.println(name);
		System.out.println(email);
		
	}

}
