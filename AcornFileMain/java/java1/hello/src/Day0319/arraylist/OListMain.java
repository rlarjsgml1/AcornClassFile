package Day0319.arraylist;

public class OListMain {
	public static void main(String[] args) {
		OList list = new OList();
		list.add(new Score("박세인",90,99));
		list.add(new Score("여도현",90,99));
		list.add(new Score("이용찬",90,99));
		
		for(int i = 0; i<list.size(); i++) {
			Object o = list.get(i);
			System.out.println(o);
			
			//score 객체의 고유메서드 사용하려면 ==> DownCasting 필수
			
			((Score)o).printInfo();
		}
	}
}
