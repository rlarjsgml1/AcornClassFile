package Day0324.실습시험김건희;

public class 문제8번 {
	public static void main(String[] args) {
        Book b1 = new Book("AA1001", "SpringMVC", "최작가");
        Book b2 = new Book("BB1001", "JSP/Servlet 웹프로그래밍", "이작가");
        Book b3 = new Book("CC1001", "MVC2모델", "박작가");

        System.out.println("[ 책정보 ]");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
