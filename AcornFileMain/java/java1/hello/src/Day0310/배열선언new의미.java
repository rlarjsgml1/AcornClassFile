package Day0310;

public class 배열선언new의미 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열은 같은자료형 연속적으로 확보하고 사용하는 것
		//배열은 반드시 크기를 지정해야 한다.
		int[] kors = new int[3];
		
		//new의미 : 메모리할당(메모리를 확보해 주세요!! )을 하고 확보인(할당된) 메모리의 시작주소를 반환한다.
		//c언어 malloc(sizeof(int) *3 )
		//-> 할당된 메모리의 주소를 반환하는데 주소를 저장하는 변수가 필요해짐
		//이 변수를 참조형 변수라고 한다
		//참조형변수는 주소를 저장하는 변수를 일한다
	}
}
