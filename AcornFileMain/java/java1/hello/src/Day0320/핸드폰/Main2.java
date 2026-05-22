package Day0320.핸드폰;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HandPhone phone = new HandPhone();
		
		
		//배터리 주입   injection 
		//phone.setBattery(new SMBattery());
		//phone.setBattery( new LGBattery());
		
		//phone.setBattery( new Battery() {});      // 배터리 인터페이스를 익명클래스로 만드는 코드
		/*phone.setBattery( new Battery() {

			@Override
			public void getEnergy() {
				 System.out.println( "우주연 배터리의 에너지를 얻어오다." );
				
			}});    
		
		*/
		
		phone.setBattery(new Battery() {
			
			// 배터리 인터페이스의 메서드 오버라이드
			@Override
			public void getEnergy() {
				
				System.out.println("이현겸의 배터리를 얻어온다");
				
			}});
		
		
		phone.setBattery(new Battery() {

			@Override
			public void getEnergy() {
				// TODO Auto-generated method stub
				System.out.println("iphone 16pro의 배터리 에너지를 얻어오다");
				
			}});
		
		
		phone.setBattery(new Battery() {

			@Override
			public void getEnergy() {
				System.out.println("송주창 배터리의 에너지를 얻어오다.");
				
			}});
		
		
		
		
		
		//phone.setBattery(  new AppleBattery());
		phone.setBattery(new Battery() {
			@Override
			public void getEnergy() {
				System.out.println("박세인 애플 배터리의 에너지를 얻어오다.");
				
			}});
		
		phone.setBattery(new Battery() {

			@Override
			public void getEnergy() {
				// TODO Auto-generated method stub
				System.out.println("배터리를 많이 얻어온다");
			}
		});	
		
		
		phone.setBattery(new Battery() {

			@Override
			public void getEnergy() {
				// TODO Auto-generated method stub
				System.out.println("xiaomi배터리 에너지 얻어온다");
			}
		});
		
		
		phone.setBattery(new Battery() {
		    @Override
		    public void getEnergy() {
		        System.out.println("이정하 배터리의 에너지를 얻어온다");
		    }
		});
		
		phone.powerOn();
		phone.powerOn();
		
		phone.powerOn();
		phone.powerOn();
		
		//1. Battery  인터페이스를 이름있는 클래스로 구현해서 사용해보기 
		//2. Battery  인터페이스를 익명클래스로 구현해서 사용해보기 
		
		
		
		

	}

}
