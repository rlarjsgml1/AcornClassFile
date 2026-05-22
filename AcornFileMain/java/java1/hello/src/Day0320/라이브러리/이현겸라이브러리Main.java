package Day0320.라이브러리;


class  AA   extends 원하는코드 {
     public void 구구단(int dan) {
                 System.out.println("즐거운 금요일  ^^ !!" );
     } 
}


public class 이현겸라이브러리Main {

	public static void main(String[] args) { 
		MyUtil_이현겸  a= new MyUtil_이현겸();		
		//a.코드세번실행하기(new AA()); //익명클래스  
		//a.코드세번실행하기( new 원하는코드 () {} );  // 클래스를 상속해서 익명으로 
		                                    //클래스를 만드는거  
		a.코드세번실행하기( new 원하는코드 () {
			  @Override
			 public void 구구단(int dan) {
                 System.out.println(" 익명 클래스 ^^ 즐거운 금요일 !!" );
            }			
		});
		
		
		
	}

}
