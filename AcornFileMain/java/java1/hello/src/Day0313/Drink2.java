package Day0313;


// 
public class Drink2 {
	
    String drinkName;  /*  drinkName => 변경 */
    int price;
    boolean isCold;
    String  칼로리;  /* 추가적인 요구사항*/
    
    
    //구조화된변수를 다루는 함수들이 들어옴
    //input, print 두 개의 함수는  Drink2   type을 사용하는 함수들이다 
    //1. 데이터 + 데이터를 다루는 함수를 하나의 단위로 설계한다 
    //2. static을 제거한다 ( => 우리가 설계한 타입의 변수가 만들어진 다음부터 사용가능하다) 
    //3. 구조화된 변수을 정보를 제공받는 매서드에서  변수의 정보를 제공받는것을 생략된 형태로 사용할 수 있다
    //4. this를 키워드 제공함 
    
    //입력하기 
    //   public static void input(Drink2 drink, String drinkName, int price, boolean isCode  ,String 칼로리){

    public  void input( String drinkName, int price, boolean isCode  ,String 칼로리){
        this.drinkName = drinkName;
        this.price = price;
        this.isCold = isCode;
        this.칼로리=칼로리;  /* 입력하기 함수가 변경되었음  - 추가요구사항 */
    } 
    
    //출력하기
  //  public static void print( Drink2 drink) {
    public   void print( ) {
    	System.out.println( this.drinkName);
    	System.out.println( this.price);
    	System.out.println( this.isCold);
    	System.out.println( this.칼로리);  /* 출력하기 함수가 변경되었음 - 추가요구사항*/
    	
    	
    }
    
}
