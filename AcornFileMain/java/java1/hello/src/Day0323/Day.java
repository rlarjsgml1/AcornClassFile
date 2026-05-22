package Day0323;


//일정정보 한 개를 저장할 수 있는 type 설계
//public class Day extends Object 
public class Day {
	
	private  String name;
	private  String time;
	
	
	//생성자
	public Day(String name, String time) {
		//super();
		this.name = name;
		this.time = time;
	} 

	//기본생성자
	public Day() {
		// TODO Auto-generated constructor stub
	}

	
	//매서드
	//현재 객체의  정보를 올바르게 제공 
	// toString  오버라이드 
	
	@Override
	public String toString() {
		return "Day [name=" + name + ", time=" + time + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}  
	
	
	
	
}

