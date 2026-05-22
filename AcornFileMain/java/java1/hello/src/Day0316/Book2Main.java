package Day0316;

public class Book2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. 책정보 (title,  author, price ) 를  담을 수 있는 Book클래스를 정의하고 책정보 객체 3개를 만들고 출력하기 
		Book2 b1 = new Book2();
		Book2 b2 = new Book2();
		Book2 b3 = new Book2();
		
		b1.Book1input("해리포터", "해리포터는 너무 재미있어서 즐거워요", 30000);
		b2.Book1input("디자이너의 꿈", "정말로 너무 디자이너가 꿈꾸싶으면 이거를 읽으세요", 10000);
		b3.Book1input("우리들의 일그러드진 악당", "악당이 되고싶으면 읽으세요", 25000);
		
		b1.Book1Save();
		b2.Book1Save();
		b3.Book1Save();
		
		//3. 책정보 (title,  author, price ) 를  담을 수 있는 Book클래스를 정의하고 책정보  3개를 객체 배열로 만들고 출력하기
		Book2[] books = new Book2[3];
		books[0] = b1;
		books[1] = b2;
		books[2] = b3;
		
		for(int i = 0; i < books.length; i++) {
			books[i].Book1Save();
		}
		
	}

}
