package Day0309;

public class 변수와배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//기억장소가 연속적이야한다
		//배열은 만들때는 반드시 크기를 알아야한다
		
		// int, dobule, char, boolean
		//String : 문자열
		//변수 5개 : 변수 5개는 개별적으로 공간에 확보됨 , 변수이름으로 접근한다, 반복문 사용 못함
		//배열(5개) : 연속적으로 공간확보, 기준(배열이름)으로부터 인덱스로 접근한다.
		//인덱스의 의미:  기준으로부터 크기(자료형)만큼 떨어진 위치
		
		//문자열 5개 사용하기
		String name1 = "장윤성";
		String name2 = "엄진희";
		String name3 = "이정하";
		String name4 = "정철진";
		String name5 = "김재민짱";
		
		System.out.println(name1); //변수 5개를 출력할때는 반복문을 사용할 수 있다.
		System.out.println(name2); //변수는 접근시 반드시 변수 이름으로만 접근가능하다.!!!!
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		
		//배열을 사용하여 이름 출력하기
		String[] names = new String[5]; //1차원배열
		names[0] = "장윤성"; //배열명[인덱스] = 값 , 기억장소에 값을 저장
		names[1] = "엄진희";
		names[2] = "이정하";
		names[3] = "정철진";
		names[4] = "김재민짱";
		
		//String[] names = {"장윤성", "엄진희", "이정하", "정철진", "김재민짱"}; //배열선언 및 초기화
		//String[] names new String[] {"장윤성", "엄진희", "이정하", "정철진", "김재민짱"};
		
		System.out.println("배열 출력하기");
		System.out.println( names[0]); //배열명[인덱스] 이용(가져와서 출력하기)
		System.out.println( names[1]);
		System.out.println( names[2]);
		System.out.println( names[3]);
		System.out.println( names[4]);
		
		//인덱스(청자)는 변수를 사용할 수 있다.
		//배열을 출력한은 코드는 반복문을 사용할 수 있다.
		
		System.out.println("배열 반복문으로 출력하기");
		for(int i = 0; i<5; i++) { //i=> 반복제어변수, 배열의 첨자 index
			System.out.println(names[4]); 
		}
	}
}
