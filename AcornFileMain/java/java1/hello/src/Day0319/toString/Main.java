package Day0319.toString;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score s = new Score("홍길동", 100, 50);
		
		System.out.println(s);
		//System.out.println(s.toString()); //같은 의미
		
		Object o = s;//업캐스팅
		
		System.out.println(o.toString());
		System.out.println(o);
		
		//Object - toString()
		//Score -toString() 오버라이드(무조건 부모의 메서드와 완벽히 일치) @Override (체크해주는 역할) 
		//Object로 다뤄도 실제생성된 객체의 toString()
		
	}

}
