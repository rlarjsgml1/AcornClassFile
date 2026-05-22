package Day0313;

public class Snack {
	//어떻게 변수가 만들어질지 설계
		String name;
		String company;
		String colories;
		int gram;
		
		//-----------------------
		//이 변수들을 어떻게 사용할지 설계
		//기능
		//이 기능들은 반드시 위에서 설계한 변수가 만들어진 후 부터 사용할 수 있다.
		//입력하기
		//출력하기
		public void 입력하기(Snack s , String name, String company, String colories, int gram) {
			this.name = name;
			this.company = company;
			this.colories = colories;
			this.gram = gram;
		}
		public void 출력하기() {
			System.out.println(this.name);
			System.out.println(this.company);
			System.out.println(this.colories);
			System.out.println(this.gram);
		}
		
}