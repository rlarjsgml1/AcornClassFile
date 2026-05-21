package day5prac.di;

public class LGBattery implements Battery{
	
	@Override
	public int getEnergy() {
		// TODO Auto-generated method stub
		System.out.println("lg");
		return 50;
	}

}
