package Day0324.실습시험김건희;

public class Score {
	String name;
	int kor;
	int eng;
	char grade;

	public Score(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		calcGrade();
	}

	public void calcGrade() {
		int avg = (kor + eng) / 2;

		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else {
			grade = 'F';
		}
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", grade=" + grade + "]";
	}	
}