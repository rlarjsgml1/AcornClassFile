package Day0320.핸드폰.인터페이스예제짝궁.김태준;

public class ItNewsFetcher implements Newsfetcher{

	String[] NewsArr = new String[] {
			"[IT신문] 자바(Java) 객체지향 프로그래밍의 핵심, 다형성과 인터페이스 완벽 가이드",
		    "[개발자 동향] 자바 컬렉션 프레임워크(Collections Framework) 완벽 분석: ArrayList와 LinkedList의 차이점",
		    "[테크뉴스] 가비지 컬렉터(Garbage Collector)가 자바 메모리 관리에 미치는 영향",
		    "[프로그래밍 가이드] 자바 예외 처리(Exception Handling)의 정석: try-catch 블록과 throws의 올바른 사용법",
		    "[자바 트렌드] 익명 클래스(Anonymous Class)에서 람다식(Lambda Expression)으로의 진화와 코드 간결화",
		    "[백엔드 기초] 자바 가상 머신(JVM)의 구조와 크로스 플랫폼 호환성의 원리",
		    "[아키텍처 설계] 추상 클래스(Abstract Class)와 인터페이스(Interface)의 실무적 차이와 적절한 활용 시기",
		    "[자바 심화] 스트림 API(Stream API)를 활용한 데이터의 효율적 처리 방법",
		    "[실전 코딩] 객체 간의 결합도를 낮추는 의존성 주입(DI)과 인터페이스의 역할",
		    "[IT 트렌드] 클라우드 네이티브 환경에서 자바 스프링 부트(Spring Boot)의 활용도 증가"
	};
	
	@Override
	public String searchNews(String keyword) {
		
		String result = "";
		
		for(int i=0;i<NewsArr.length;i++) {
			
			if(NewsArr[i].contains(keyword)){
				result += NewsArr[i] + "\n";
			}
			
		}
		if(result.equals("")) { // result.isEmpty() 를 써도 된다.
			return "일치하는 기사가 없습니다";
		}
		
		return result;
	}
	
	
	
}
