package Day0319.equals;

public class Score {
	String name;
	int kor;
	int eng;
	
	public Score() {
		
	}
	public Score(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
	}
	
	//eqauls 오버라이드 하기
	public boolean equals(Object obj) { //업캐스팅 되어 있음. 성적정보에 대한 것을 알 수 없다 
		//라이브러리는 대부분 Object 타입을 대상으로 한다.
		boolean result = false;
		
		//instanceof로 확인하기
		Score other = (Score)obj; //Score객체는 다 확인 가능
								  //DownCasting
		if(this.kor == other.kor && this.eng == other.eng) {
			return true;
		}
		return result;
		
	}
	

}
