package Day0316;


//  AcornStudent s  = new AcornStudent();   //  변수만들기 , 객체생성기



// 에이콘학생정보를 저장하기 위한  자료형 만들기 
//캡슐화 
//데이타+ 매서드(함수) 묶음
//매서드가 하는 역할이 데이터를 사용한다 ( 데이터변경하거나, 단순히 읽기)
public class AcornStudent김건희 {

	
	  //속성
	  private String name;
	  private int 운동량;
	  private int 에너지;
	  private int 클라이밍능력;
	  private int 헬스;
	  private int 복싱;
	  
	
	   
	  //기능(매서드, 함수)
	  //매서드를 통해서 변수를 사용한다	   (데이터를 사용하는 기능)
 	 
	  //입력하기  (기본)  
	  //출력하기  (기본)
	  
	  
	  //배열공부하기

	  public void  입력하기( String name, int 운동량, int 에너지, int 클라이밍능력, int 헬스, int 복싱){
	           this.name  = name;
	           this.운동량 = 운동량;
	           this.에너지 = 에너지;
	           this.클라이밍능력 = 클라이밍능력;
	           this.헬스 =  헬스;
	           this.복싱  = 복싱;
	           
	  }

	//정보 출력하기
	  public void   정보출력하기(){
		 System.out.println("///////////////////");
		 System.out.println("name" + name);
		 System.out.println("운동량" + 운동량);
		 System.out.println("에너지"+ 에너지);
		 System.out.println("클라이밍" + 클라이밍능력);
		 System.out.println("헬스"+ 헬스);
		 System.out.println( "복싱"+ 복싱); 
	 }


	  public void  클라이밍하기(){
	     클라이밍능력  +=20;
	     에너지  -=5;
	     운동량 += 10;
	        
	  }

	  public  void 헬스하기(){
	        헬스 +=30;
	        에너지  -=5;
	        운동량 += 15;
	 } 
	  
	  public void 복싱하기() {
		  복싱 +=30;
		  에너지 -=5;
		  운동량 += 5;
	  }

	  public void 운동하기() {
	        운동량 +=100;
	        에너지 -=5;
	  }
	  
	  public void 밥먹기() {
		  에너지 +=100;
	  }
	  

	  public int  웃는다(){
	        에너지 += 10;
	        return 10;
	  }
 
	  
	  
}
