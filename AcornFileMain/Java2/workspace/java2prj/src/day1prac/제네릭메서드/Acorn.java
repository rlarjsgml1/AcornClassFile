package day1prac.제네릭메서드;

public class Acorn {
	
	String id;
	String name;

	public Acorn() {
	}

	public Acorn(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Acorn [id=" + id + ", name=" + name + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
