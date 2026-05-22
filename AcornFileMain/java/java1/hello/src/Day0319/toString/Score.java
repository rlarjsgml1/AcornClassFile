package Day0319.toString;

//학생성적정보를 만들어내기 위한 툴 작성(객체를 만들기 위한 틀)
//속성 + 메서드 => 객체 
//메서드 => 객체

public class Score {
	String name;
	int kor;
	int eng;
	double avg;
	
	//별도로 기본생성자
	public Score() {}
	
	//생성자
	public Score(String name, int kor, int eng) {
//		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		calc();
	}

	private void calc() {
		int total = kor + eng;
		this.avg = total/2.0;
	}
	
	//toString()을 Overrid를 해야함
	@Override
	public String toString() {
		//평균 구하기 되기는 되는데 안좋음
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", avg=" + avg + "]";
	}
	
}
