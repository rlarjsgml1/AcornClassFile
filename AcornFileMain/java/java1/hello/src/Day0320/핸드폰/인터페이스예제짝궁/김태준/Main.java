package Day0320.핸드폰.인터페이스예제짝궁.김태준;

import java.util.Scanner;

public class Main {
	
	Newsfetcher news;
	
	
	//쎄터 주입
	public void setFetcher(Newsfetcher 원하는기사데이터) {
		this.news = 원하는기사데이터;
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 키워드를 입력해 기사를 찾아보세요");
		String keyword = sc.nextLine();
		
		String result = news.searchNews(keyword);
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		Main a = new Main();
		
		a.setFetcher(new ItNewsFetcher());
		
		a.run();
		
	}
	
	
}
