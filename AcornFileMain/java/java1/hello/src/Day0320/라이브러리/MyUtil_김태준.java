package Day0320.라이브러리;



public class MyUtil_김태준 {
	
	
	
	//1.   별을 3개 출력하기         :   무조건 별을 3개 출력해 드릴께요
	public void a() {
		for(int i=0;i<3;i++){
				System.out.print("*");
		}
		System.out.println();
	}
	

	//2.  원하는 문자를 3개 출력하기 ( 매개변수 활용)  :   당신이 원하는 문자를 3번 출력해 드릴께요
	
	public void b(String aa) {
		for(int i=0;i<3;i++){
			System.out.print(aa);
		}
		
	}

	//3.  원하는 코드를 3번 실행하기  ( 매개변수 활용) :   당신의 코드를 3번 실행해 드릴께요
	
	public void c(Object a) {  // 모든 객체를 받을 수 있다. 참조할 수 있다. 그렇지만 Object만큼으로만 해석되기 때문에 
		                       //                                 객체에 대해서 올바른 메시지를 줄 수 없다
		for(int i=0;i<3;i++){
			//?????  불가능 !!!!!!
			//a.실행();  부모타입만큼으로만 해석된다   
			
		}
	}
	// 모르겠는데용
	


	
}
