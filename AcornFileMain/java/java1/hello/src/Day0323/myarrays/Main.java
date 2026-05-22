package Day0323.myarrays;

public class Main {

	public static void main(String[] args) {
		Score[] scores = new Score[5];

		scores[0] = new Score("김민경", 100, 80);
		scores[1] = new Score("송주창", 70, 85);
		scores[2] = new Score("김민정", 99, 79);
		scores[3] = new Score("김재민", 85, 70);
		scores[4] = new Score("김건희", 88, 89);

		MyArrays.sort(scores, new MyComparatorImp());

		// MyComparator 인터페이스 구현하기
		// 이름있는 클래스
		// 익명클래스
		
		System.out.println("\n 정렬후");
		for(Score s : scores) {
			System.out.println(s.toString());
		}
		
		MyArrays.sort(scores); //객체의 각각에서 찾음
		
		System.out.println("\n 정렬후");
		for(Score s : scores) {
			System.out.println(s.toString());
		}
		
		

	}

}
