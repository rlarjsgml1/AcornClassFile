package day3prac.collection;

import java.util.Objects;

public class Moving implements Comparable<Moving> {
	String name;
	String code;
	int power;

	public Moving(String name, String code, int power) {
		super();
		this.name = name;
		this.code = code;
		this.power = power;
	}

	public Moving() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Moving [name=" + name + ", code=" + code + ", power=" + power + "]";
	}

	@Override
	public int compareTo(Moving o) {
		return this.name.compareTo(o.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moving other = (Moving) obj;
		return Objects.equals(code, other.code) && Objects.equals(name, other.name) && power == other.power;
	}

}
