package day5prac.di;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandPhone h = new HandPhone();
//		h.setBattery(new SMBattery());
		h.setBattery(new LGBattery());
		h.power();

	}

}
