package Day0316;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 책정보 (title,  author, price )를   생성자를 이용하여 저장하고 출력하기
		Book b = new Book();
		
		b.입력하기("해리포터", "아브라카다브라이얍!", 300000);
		
		b.출력하기();
		
	}

}
