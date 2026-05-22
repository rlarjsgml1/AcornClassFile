package Day0317;

public class Student3 {
	String name;
	int kor;
	int eng;
	double avg;
	char grade;
	
	//생성자 => 변수(객체)의 초기화 담당
	//toString () :현재 객체의 정보를 하나의 문자열로 제공하기
	
	//getter(속성의 값을 반환) : 작성법 규칙 : get속성명 get + 속성명 첫글자대문자 규칙 getName, getKor, getEng, getAvg, getGrade
	//setter(속성의 값을 변경) : 작성법 규칙 : set속성명 set + 속성명 첫글자대문자 규칙 setName, setKor, setEng, setAvg, setGrade
		//setter 변경이 필요한 속성의 한에서 만든다.
	
	//생성자
	public Student3() {}
	
	public Student3(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	//toString : 객체의 정보를 하나의 문자열로 제공하기
	public String toString() {
		return this.name + this.kor + " " + this.eng + " " + this.avg + " " + this.grade;
	}
	//get
	public String getName() {
		return this.name;
	}
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	public double getAvg() {
		return this.avg;
	}
	public double getGrade() {
		return this.grade;
	}
	
	//set
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	//평균구하기
	private void calcAvg() {
		int total = this.kor + this.eng;
		this.avg = total/2.0;
	}
	
	//학점구하기
	public void calcGrade() {
		calcAvg();
		if(this.avg>=90) {
			this.grade = 'A';
		} else if(this.avg >= 80) {
			this.grade = 'B';
		} else if(this.avg >= 70) {
			this.grade = 'C';
		} else {
			this.grade = 'F';
		}
	}
}
