package Day0323.선택정렬;

public class Score implements Comparable {
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
	public int compareTo(Object o) { // 객체자신과 비교객체 => 어떤 기준으로 정렬할 것인지를 결정해 줘야한다.
										// 비교할 속성을 선택하고 그 결과각 양수가 반환되면 => 두 개의 요소의 자리 바꿈이 일어남
										// 음수가 반환되면 => 자리를 바꾸지 않는다.
										// 오름차순을 하고 싶으면 기준이 큰 경우에 양수가 전달 되도록 하기
		Score s = (Score) o;
		return this.kor - s.kor; // 기준이 크면 양수가 자연스럽게 전달된다.
	}

}
