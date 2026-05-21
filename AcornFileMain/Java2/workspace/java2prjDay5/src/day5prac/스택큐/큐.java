package day5prac.스택큐;

import java.util.LinkedList;
import java.util.Queue;

public class 큐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
		
		//데이타 넣기
		q.offer("김건희");
		q.offer("고지연");
		q.offer("황스일");
		
		//데이타꺼내기
		
		String o = q.poll();
		System.out.println(o);
	}

}
