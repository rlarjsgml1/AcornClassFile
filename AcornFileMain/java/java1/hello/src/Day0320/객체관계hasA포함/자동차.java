package Day0320.객체관계hasA포함;


//자동차가 부품을 가진다
//헬스장이 회원을 가진다

public class 자동차 {

	타이어   tire;  //멤버로 타이어  객체를 가진다  => has a 
	
	
	public 자동차() {   //강한 결합 
		this.tire = new 타이어();
	}
	
	/*
	public 자동차( 타이어 tire) {  //약한 결합
		this.tire  = tire;
	}
	*/
	
	
	
	public void 전진하다() {
		System.out.println("코드 실행");
		tire.굴러간다();
		
	}
}
