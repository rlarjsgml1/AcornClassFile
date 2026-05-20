/**
 * Day4 리플렉션(reflection) 실습 패키지.
 *
 * <p>공부 순서</p>
 * <ol>
 *   <li>{@code Member.java}: 리플렉션으로 다룰 대상 클래스 구조 확인</li>
 *   <li>{@code 객체생성하기1.java}: 평소처럼 {@code new}로 객체 생성</li>
 *   <li>{@code 객체생성하기2.java}: {@code Member.class}로 클래스 정보 얻기</li>
 *   <li>{@code 객체생성하기3.java}: 이미 만든 객체의 {@code getClass()}로 클래스 정보 얻기</li>
 *   <li>{@code 객체생성하기4.java}: 문자열 클래스명과 {@code Class.forName()}으로 클래스 정보 얻기</li>
 *   <li>{@code 객체생성하기5.java}: 생성자 정보를 얻고 {@code newInstance()}로 객체 생성</li>
 *   <li>{@code 객체생성하기6.java}: {@code config.txt}에서 클래스명을 읽어 객체 생성</li>
 *   <li>{@code 매서드정보가져오기.java}: 클래스가 가진 메서드 목록 확인</li>
 *   <li>{@code 매서드호출하기.java}: 매개변수 없는 메서드를 {@code invoke()}로 호출</li>
 *   <li>{@code 매서드호출하기2.java}: 매개변수가 있는 생성자와 메서드 호출</li>
 *   <li>{@code 속성정보얻어오기.java}: 클래스가 가진 필드 목록 확인</li>
 *   <li>{@code ReflectTest.java}: 위 내용을 한 번에 모아 본 종합 예제</li>
 * </ol>
 *
 * <p>핵심 흐름</p>
 * <pre>
 * 클래스명 문자열 또는 .class 또는 객체.getClass()
 *          -> Class 객체
 *          -> Constructor / Method / Field 정보
 *          -> 객체 생성 또는 메서드 호출
 * </pre>
 *
 * <p>수업에서 말한 "변경에 유리한 코드"는 소스 안에 {@code new Member()}처럼
 * 특정 클래스를 직접 박아두지 않고, 외부 설정({@code config.txt})이나 인터페이스를
 * 통해 바꿀 수 있게 만드는 방향이다.</p>
 */
package day4prac.reflect;
