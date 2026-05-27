package com.acorn.prac.db;

public class 가변인자 {
	public static void printInfo(String ...strings){
		for(String item : strings) {
			System.out.println(item);
		}
	}
	
	public static void main(String[] args) {
		printInfo("hello");
		printInfo("꺼져", "꺼지라고");
		printInfo("hello", "가라고", "누구세요");
	}
}
