package com.acorn.day1prac.modelAttr;

//기본생성자, setter 사용 => 준비
public class User {

	String id;
	String pw;

	public User() {
		// TODO Auto-generated constructor stub
	}

	User(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}
