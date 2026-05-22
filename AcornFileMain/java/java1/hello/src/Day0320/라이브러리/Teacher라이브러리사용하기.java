package Day0320.라이브러리;

public class Teacher라이브러리사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		MyUtilTeacher lib = new MyUtilTeacher();		 
		lib.별출력하기();
		lib.print("*");			 
		//당신의 코드를 세번실행하기 
		//결정할 수 없는 코드는 인터페이스를 활용한다.
		//매서드의 이름만을 약속하는 인터페이스를 작성하고 사용해야 한다 !!		
	  	lib.runThreeTimes( new WJYImp() );	
		//
		 lib.runThreeTimes( new 이현겸Imp() );
		 lib.runThreeTimes( new 김태준Imp() );
		//lib.runThreeTimes( new 황스일Imp());
		 lib.runThreeTimes( new 이용찬Imp() );
		 lib.runThreeTimes( new 여도현Imp());
		 lib.runThreeTimes( new 박세인Imp());
		 lib.runThreeTimes( new 손영석Imp());
		 lib.runThreeTimes( new 송주창Imp());
		 lib.runThreeTimes( new 김민경Imp());
		 lib.runThreeTimes( new 정철진Imp());
		 lib.runThreeTimes( new 이정하Imp());
		 lib.runThreeTimes( new 엄진희Imp());
		 // lib.runThreeTimes(  new TeacherCodeRun() { } ) ;   //익명클래스 작성으로 인터페이스 구현하기
		 lib.runThreeTimes(  new TeacherCodeRun() {

			@Override
			public void codeRun() {
				System.out.println("익명으로 클래스를 만들고 매서드를 오버라이드 할 수 있어요 !!!");
				
			}});
		
		 
		 
		 // lib.runThreeTimes( new TeacherCodeRun() {});    //  TeacherCodeRun이라는 인터페이스를 구현한 
		                                                    //  익명클래스를 작성하는 코드이다
		 
		 lib.runThreeTimes( new TeacherCodeRun() {

			@Override
			public void codeRun() {
				
				 
				System.out.println("Hello 구구단");
				for(int i=1; i<=9; i++) {
					for(int j=1; j<=9; j++) {
						System.out.print(i*j+" ");
					}
					System.out.println();
				}
				
			}}); 
		
	}

}
