package day3prac.collection.stream3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class Movie implements Comparable<Movie> {
	private String title;
	private String director;
	private int year;

	// 생성자
	public Movie(String title, String director, int year) {
		this.title = title;
		this.director = director;
		this.year = year;
	}

	// Getter 메서드
	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public int getYear() {
		return year;
	}

	// toString 메서드 (영화 정보를 출력하기 쉽게)
	@Override
	public String toString() {
		return "Movie{" + "title='" + title + '\'' + ", director='" + director + '\'' + ", year=" + year + '}';
	}

	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return this.year - o.year; //
	}
}

//스트림: 데이터흐름 
//선언식방법으로 데이터를 편리하게 처리하게 해줌 
//filter(필터링), map(변환) , collect(수집)

public class 영화문제 {

	public static void main(String[] args) {

		ArrayList<Movie> movies = new ArrayList<>();

		// Movie 객체 10개 추가
		movies.add(new Movie("기생충", "봉준호", 2019));
		movies.add(new Movie("올드보이", "박찬욱", 2003));
		movies.add(new Movie("신과 함께: 죄와 벌", "김용화", 2017));
		movies.add(new Movie("범죄도시", "강윤성", 2017));
		movies.add(new Movie("관상", "한재림", 2013));
		movies.add(new Movie("암살", "최동훈", 2015));
		movies.add(new Movie("부산행", "연상호", 2016));
		movies.add(new Movie("살인의 추억", "봉준호", 2003));
		movies.add(new Movie("명량", "김한민", 2014));
		movies.add(new Movie("해운대", "윤제균", 2009));

		// 스트림

		// 1. 영화 목록 출력하기
		movies.stream().forEach(System.out::println);

		System.out.println("==========================");

		// 2.2015년 이후 영화 정보 조회 // (item )->{ return item.getYear()>2015 ;}
		List<Movie> moviesAfter2015 = movies.stream().filter(item -> item.getYear() > 2015)
				.collect(Collectors.toList());

		moviesAfter2015.stream().forEach(System.out::println);

		System.out.println("==========================");

		// 3. 영화이름만 List 만들기
		List<String> titleList = movies.stream().map(item -> item.getTitle()).collect(Collectors.toList());

		System.out.println(titleList);
		System.out.println("==========================");

		// 4. 영화이름과 감독을 HashMap( 키:영화이름, 값:감독 )변환
		HashMap<String, String> movieMap = movies.stream().collect(Collectors.toMap(item -> item.getTitle(),
				item -> item.getDirector(), (director1, director2) -> director1, HashMap::new));

		System.out.println(movieMap);
		System.out.println("==========================");

		// 5.정렬 (기본정렬-객체내부에 있는 Comparable)
		List<Movie> sortedMovies = movies.stream().sorted().collect(Collectors.toList());

		sortedMovies.stream().forEach(System.out::println);

		System.out.println("==========================");

		// 6.정렬( Comparator )
		List<Movie> sortedMoviesByTitle = movies.stream().sorted(Comparator.comparing(item -> item.getTitle()))
				.collect(Collectors.toList());

		System.out.println("==========================");

	}

}
