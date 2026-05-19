package day3prac.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {

		// 중복되지 않는 데이터를 유지하고 싶을 때
		Set<String> set = new HashSet<>();

		set.add("딸기");
		set.add("딸기");
		set.add("딸기");
		set.add("사과");

		// 반복자 Iterator 사용
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}

		Set<Moving> set2 = new HashSet<>();
		set2.add(new Moving("장주원", "구룡포", 100));
		set2.add(new Moving("이미현", "경기", 80));
		set2.add(new Moving("김두식", "문산", 90));
		set2.add(new Moving("장주원", "구룡포", 100));
		set2.add(new Moving("김건희","시흥시", 200));
		
		Iterator<Moving> it2 = set2.iterator();
		while(it2.hasNext()) {
			Moving m = it2.next();
			System.out.println(m);
		}
		
		//eqauls 오버라디잉
		//hashCode 오버라이딩
		
	}
}
