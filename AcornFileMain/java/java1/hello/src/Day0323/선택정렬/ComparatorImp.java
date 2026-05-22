package Day0323.선택정렬;

import java.util.Comparator;

public class ComparatorImp implements Comparator{

	@Override
											   //앞 객체(기준), 뒤 객체(비교대상)
	public int compare(Object o1, Object o2) { //두 객체를 제공할테니 두 객체의 속성값을 선택해서 그 결과를 int 값을 반환하는 것을 책임져야함
											   //기준이 크면 양수를 양수전달, 적으면 음수전달
											   // => 정렬라이브러리에서는 양수가 전달되면 두 객체의 자리를 교환한다(정렬이 일어난다)
		
		//다운캐스팅
		Score s1 = (Score)o1;
		Score s2 = (Score)o2;
		return s1.eng - s2.eng; //if문,상환연산자가 있을 수 있음
	}

}
