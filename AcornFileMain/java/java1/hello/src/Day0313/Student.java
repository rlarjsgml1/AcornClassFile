package Day0313;

public class Student {

	String name;
	int kor;
	int eng;
	int avg; //평균구하기
	
	//기능(입력, 성적처리, 출력) 
	public void input(String name, int kor, int eng) {
		//객체의 정보를 전달받는다. 객체에서 메서드()를 호출할 때 객체의 정보를 전달 받는다. this라는 키워드애
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		calc();
	}
	//성적처리하기
	private void calc() {
		int total = this.kor + this.eng;
		this.avg =total/2;
	}
	public void print() {
		System.out.println(this.name);
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.avg);
		
	}

}
