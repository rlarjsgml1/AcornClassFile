package hello;

public class Test1{ 

    public static void main( String[] args){ 
         // 1  2  3  4  5  6   7      8    =>항의 순번
         // 1  1  2  3  5  8   13   21    =>항

         //자료명세  =>변수찾기
         int  다음항;
         int  이전항=1, 중간항=1;  

         System.out.println( 이전항);
         System.out.println( 중간항);
         for( int i=3 ; i<=8; i++ ){
                  다음항 = 이전항+ 중간항;
                  System.out.println(다음항);
                 // 
                  이전항= 중간항 ;
                  중간항= 다음항 ;
         }  
    }
}