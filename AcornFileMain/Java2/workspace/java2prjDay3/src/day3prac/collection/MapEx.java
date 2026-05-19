package day3prac.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapEx {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		
		map.put("카카오", "카카오비밀번호");
		map.put("NAVER", "NAVER비밀번호");
		map.put("Google", "Google비밀번호");
		
		String 비밀번호1 = map.get("카카오");
		System.out.println(비밀번호1);
		
		//Key
		Set<String> keys = map.keySet();
		
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
		
		//keys.forEach((item)->{System.out.println(item);});
		keys.forEach(item->System.out.println(item));
		
		//값만
		
//		Set<String> values = (Set<String>) map.values();
		Collection<String> values = map.values();
		values.forEach((item)->{System.out.println(item);});
		values.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		});
		
		//Key, 값 -> 세트
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
		}
	}
}
