package Day0319.object;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스가 상속을 받지 않으면 자바는 무조건 Object를 상속받게 된다.
		A a1 = new A();
		B b1 = new B();
		
		//두 개의 객체는 부모타입으로 다룰 수 있다. 업캐스팅
		Object[] arr = new Object[] {a1, b1};
		for(int i= 0; i<arr.length; i++) {
			System.out.println(arr[i]); //toString메서드는 생략한 상태로 사용할 수 있따
			//System.out.pritnln(arr[i].toString());
		}
		//객체의 정보를 반환하는 멧더ㅡ(해석: 객체의 정보를 반환)
		//toString 메서드는 부모에 있는 메서드를 상속 받은 것임 클래스 
		
		//객체가 최소한 자신의 올바른 정보를 제공할 수 있또록해야한다
		//상속받은 toString을 오버라이드 해야 한다!!
		
	}

}
