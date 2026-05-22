package Day0313;

public class SnackInfo {
	//입력하기
	public static void 입력하기(Snack s, String name, String company, String colories, int gram) {
		s.name = name;
		s.company = company;
		s.colories = colories;
		s.gram = gram;
	}
	//출력하기
	public static void 출력하기(Snack s) {
		System.out.println(s.name);
		System.out.println(s.company);
		System.out.println(s.colories);
		System.out.println(s.gram);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스낵정보 출력하기
		Snack s = new Snack(); //구조화된변수 만들기
		입력하기(s, "맛동산", "해태", "500", 200);
		출력하기(s);
		
	}

}
