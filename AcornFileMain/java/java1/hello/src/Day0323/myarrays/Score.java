package Day0323.myarrays;

public class Score implements MyComparable {
	String name;
	int kor;
	int eng;

	// 기본생성자
	public Score() {
	}

	// 생성자
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	// toString
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
	}

	@Override
	public int compare(Object other) {
		Score s = (Score)other;
		
		return s.eng - s.eng;
	}

}
