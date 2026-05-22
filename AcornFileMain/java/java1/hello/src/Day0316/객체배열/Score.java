package Day0316.객체배열;

public class Score {
	int no;
	int kor;
	int eng;
	int tot;
	
	//넣기
	public Score() {
		
	}
	public Score(int no, int kor, int eng, int tot) {
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.tot = tot;
	}
	//출력
	public void printInfo() {
		System.out.println(this.no);
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.tot);
	}
}
