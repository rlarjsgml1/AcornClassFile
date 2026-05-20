package day4prac.reflect;

/*
 * [공부 순서 1]
 * Member는 리플렉션으로 분석하고 생성하고 호출해 볼 대상 클래스이다.
 *
 * 뒤 예제들은 이 클래스를 기준으로 다음을 연습한다.
 * - 생성자 정보 얻기: Member(), Member(String, String)
 * - 메서드 정보 얻기: printInfo(), printSquare(int)
 * - 필드 정보 얻기: id, pw
 */
public class Member {
	 
	// 리플렉션의 Field 예제에서 확인할 멤버 변수들이다.
	String id;
	String pw;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	// 매개변수가 없는 기본 생성자이다.
	// 리플렉션에서 getDeclaredConstructor()로 찾을 수 있다.
	public Member() {
		 this("기본아이디" , "기본비번");
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + "]";
	}  
	
	//public void printInfo( Member this ) {
	
	// 매개변수가 없는 메서드이다.
	// 리플렉션에서 getDeclaredMethod("printInfo")로 정보를 얻고 invoke(객체)로 호출한다.
	public void printInfo() {
		System.out.println( "id=" +  id);
		System.out.println( "pw=" + pw);
	}
	
	
	// int 매개변수 하나가 있는 메서드이다.
	// 리플렉션에서 getDeclaredMethod("printSquare", int.class)로 찾아야 한다.
	public void  printSquare( int su) {		
		System.out.println( su*su);
	}
	
}
