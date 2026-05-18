package day1prac.myarrays;

// Acorn 학생 한 명의 정보를 담는 클래스
// MyComparable을 구현해서 "정렬 기준"을 직접 정한다.
public class Acorn implements MyComparable {
	String id;
	String names;
	int age;

	@Override
	public String toString() {
		return "Acorn [id=" + id + ", names=" + names + ", age=" + age + "]";
	}

	// id, 이름, 나이를 받아서 객체를 만들 때 사용하는 생성자
	public Acorn(String id, String names, int age) {
		super();
		this.id = id;
		this.names = names;
		this.age = age;
	}

	// 값을 나중에 따로 넣고 싶을 때 사용할 수 있는 기본 생성자
	public Acorn() {
	}

	public String getId() {
		return id;
	}

	public String getNames() {
		return names;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Object other) {
		// Object로 받은 비교 대상을 Acorn으로 형변환한다.
		Acorn o = (Acorn) other;

		// 나이를 기준으로 오름차순 정렬한다.
		// 현재 객체가 더 크면 양수, 작으면 음수, 같으면 0이 나온다.
		return this.age - o.age;
	}
	
}
