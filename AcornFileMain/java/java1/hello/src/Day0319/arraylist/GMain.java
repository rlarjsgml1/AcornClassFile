package Day0319.arraylist;

public class GMain {
	public static void main(String[] args) {
		
		//제네릭은 
		//컴파일타임에 타입을 체크해준다.
		//DownCasting의 불편함을 해소해 준다.
		GList<Score> list = new GList<>();
		list.add(new Score("박세인",91,99)); //Object 로 저장
		list.add(new Score("여도현",92,89));
		list.add(new Score("이용찬",95,79));
		
		for(int i=0; i<list.size(); i++) {
			Score s = list.get(i);
			System.out.print(s);
			s.printInfo();
		}
	}
}
