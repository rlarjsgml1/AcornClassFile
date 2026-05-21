package day5prac.di;

public class HandPhone {
	Battery battery;
	
	
	
	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public void power() {
		System.out.println("에너지 얻어오기");
		int erergy = battery.getEnergy();
		if(erergy > 0) System.out.println("전원이 켜집니다");
	}
}
