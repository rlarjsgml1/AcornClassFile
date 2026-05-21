package day5prac.애너테이션;

public class 사원 {

	 
	public 사원(String name, String 쉬는요일) {
		super();
		this.name = name;
		this.쉬는요일 = 쉬는요일;
	}

	@MaxLen(lenght = 3)
	String name;

	@WeekDaysAvail({ "Monday", "wendesday", "Friday" })
	String 쉬는요일;
	
	
	
	

}
