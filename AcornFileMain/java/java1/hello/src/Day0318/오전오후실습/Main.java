package Day0318.오전오후실습;

public class Main {
	public static void main(String[] args) {
		Employee[] el = new Employee[3];
		el[0] = new Manager("김건희");
		el[1] = new Developer("김재민");
		el[2] = new Designer("황스일");
		
		System.out.println("팀관리자, 개발자, 프론트");
		for (int i = 0; i < el.length; i++) {
			el[i].work();
		}
		
		
		System.out.println("다운캐스팅 예제");
		Employee e = new Developer("김건희");
		Developer d = (Developer) e;
		d.coding();
		
		//잘못된
		Employee a = new Developer("아고당"); //a 
		((Developer)a).coding();
		Employee aa = new Employee("아무");
		((Developer)aa).coding(); 
		
	}
}