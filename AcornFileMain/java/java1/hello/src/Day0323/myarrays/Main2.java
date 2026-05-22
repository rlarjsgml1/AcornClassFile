package Day0323.myarrays;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Score[] scores = new Score[5];

		scores[0] = new Score("남민경", 100, 80);
		scores[1] = new Score("송주창", 70, 85);
		scores[2] = new Score("김민정", 99, 79);
		scores[3] = new Score("부재민", 85, 70);
		scores[4] = new Score("정건희", 88, 89);
		
		//MyArrays.sort(scores, null);
		
		//인터페이스를 구현하는 방법
		//이름있는 클래스로 만들기 
		//익명클래스로 만들기
		//functional 인터페이스 (구현해야할 메서드가 한 개인 인터페이스) => 람다식으로 표현 가능  => 경험
		
		//MyArrays.sort(scores new MyComparator() {}); //인터페이스를 상속받은 익명클래스 만들기
													   // 익명클래스는 바로 객체를 생성해야 함
		
		
		MyArrays.sort(scores, new MyComparator() { //MyArrays 결과 비교 코드 사용 scores를 정렬하는 의미

			@Override
			public int compare(Object o1, Object o2) { //다운 캐스팅사용
				// TODO Auto-generated method stub
				Score s1 = (Score) o1;
				Score s2 = (Score) o2;
				return s1.eng - s2.eng; //양수- 음수로 비교
			}});
		
		System.out.println("영어점수 오름차순");
		for(Score s : scores) { //Score에 배열안에 하나씩 꺼내서 출력하는 코드
			System.out.println(s.toString());
		}
		
		//지역내부클래스(메서드 안에서 클래스를 만들고 사용할 수 있다)
		class A implements MyComparator{ //이것도 A랑 클래스를 MyComparator랑 비교를 한다

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Score s1 = (Score) o1;
				Score s2 = (Score) o2;
				return s1.kor - s2.kor;
			}
			
		}
		MyArrays.sort(scores, new A());
		System.out.println("국어점수 오름차순");
		for(Score s : scores) {
			System.out.println(s.toString());
		}
		
		System.out.println("이름 가나다라순");
		
		MyArrays.sort(scores, new MyComparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Score s1 = (Score) o1;
				Score s2 = (Score) o2;
				return s1.name.compareTo(s2.name); //compareTo는 이름 비교해주는 코드
			}});
		
		for(Score s : scores) {
			System.out.println(s.toString());
		}

	}

}
