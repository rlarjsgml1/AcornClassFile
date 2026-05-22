package Day0324.실습시험김건희;

public class Book {

	String bookCode;
	String bookTitle;
	String author;

	public Book(String bookCode, String bookTitle, String author) {
		this.bookCode = bookCode;
		this.bookTitle = bookTitle;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookCode=" + bookCode + ", bookTitle=" + bookTitle + ", author=" + author + "]";
	}

}
