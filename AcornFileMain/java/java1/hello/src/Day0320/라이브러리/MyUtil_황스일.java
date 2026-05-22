package Day0320.라이브러리;

class MyUtil_황스일 {

    // 1. 별을 3개 출력하기
    public void printThreeStars() {
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // 2. 원하는 문자를 3개 출력하기
    public void printThreeString(String c) {
        for (int i = 0; i < 3; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    // 3. 원하는 코드를 3번 실행하기  , 라이브러를 만들 때 결정할 수 없는 코드는 모두 인터페이스로 만들어서 제공한다.
    //                           라이브러리를 사용하는 사람(개발자)이 구현해서 책임져야 한다 !!
    // 원하는코드  => 매서드   => 미완성의매서드    ->  추상클래스(x), 인터페이스 (o)     
    public void runThreeTimes(Runnable action) {
        for (int i = 0; i < 3; i++) {
            action.run();
        }
    }
}