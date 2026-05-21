package day5prac.스택큐;

import java.util.List;
import java.util.Stack;

public class 스택 {

	public static void main(String[] args) {
		
		//스택 : 데이터저장 : push, 꺼내기 (맨위에서 부터, 마지막에 있는 내용부터) pop
		
		Stack<String> list = new Stack<String>();
		
		list.push("파란접시");
		list.push("빨강접시");
		list.push("초록접시");
		
		
		//현재위치의 데이터 꺼내기
		String current = list.peek();
		System.out.println(current);
		
		
		/*
		String pop1 = list.pop();
		System.out.println(pop1);
		
		pop1 = list.pop();
		System.out.println(pop1);
		
		pop1 = list.pop();
		System.out.println(pop1);
		*/
		
		while(! list.isEmpty()) {
			String pop1 = list.pop();
			System.out.println(pop1);
		}
		System.out.println("스택은 마지막에 넣은 값이 먼저 나오는 LIFO 구조합니다");
	}

}
