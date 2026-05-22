package Day0305;

public class Variable1 {
    public static void main(String[] args) {
        /*변수 : 하나의 값을 저장하기 위한 메모리공간(일정크기 메모리byte 가짐)
        주소 + 크기 (특정 주소로부터 몇 바이트 크기를 갖는 공간)
        메모리의 특정 주소에 개발자가 이름을 붙여서 사용하는 것*/

        /*변수 선언 방법 -> 변수 사용 알림
        자료형 변수명;

        자료형     - 크기(byte) + 해석 정보
                  - 변수에 저장할 수 있는 값의 종류, 크기(몇바이트) 그리고 그 값을 해석하는 방법을 정의
        * */

        int a= 2; //integer형(정수) 변수
        double b=1.2; // double(실수)형 변수
        char ch = 'A'; // character(문자)형 변수
        boolean flag = true; // true, false
        String str = "asdf"; // String(문자열) = 문자집합(문자배열) index로 접근, 길이 비교 가능

      /*  변수이름 영문 소문자, 의미있게
        camelCase, underScore(snake case)
        mathScore, math_score
        */

        /*정수
        * byte : 1byte(8bit, sign bit 1, 7bit(자료)) -128~127
        * short : 2byte (-32768 ~ 32767)
        * int : 4byte (-21억 ~ 21억 정도) -> 주로 사용
        * long : 8byte (-920경 ~ 920겅 정도) > 정수형 중 가장 큰 단위
        * */

        byte by1 = 12;
        short sh1 = 323;
        int int1 = 210000;
        long long1 = 222222222;

        /*실수
        * float : 4byte (소수점 이하 7자리)
        * double : 8byte (소수점 이하 15자리*/
        float fl1 = 35.3f;
        double do1 = 35.3;

        /*문자
        * char : 2byte(영문(한글) 한글자, 0~65535) */
        char ch1 = 'g';

        /*논리
        * boolean : 1byte(true or false 만 저장가능)*/
        boolean boo1 = (a > int1); //false

        /*컴퓨터가 음수를 표현하는 방법 : 2의 보수*/


        /*
        int a = 3; // variable a, literal 3
        * 값(literal) :  저장되고 사용된다.
        정수형 literal
                - int로 저장되고 크기를 가짐(자료형을 가짐).
                - int로 처리(크기와 관계없이)
                - long으로 변수 선언 후 literal로 초기화 할 때에
                    - long long1 = 10L; // 이런식으로 literal 뒤에 L

                - 작은 자료형에 큰 리터럴 초기화 x (overflow)
                - 큰 자료형에 작은 리터럴 초기화 o

        */

        /* 실수

        float literal
        float f = 35.4f; // float literal - 뒤에 f, 또는 F 붙여야
        double d = 35.4; // default literal - double

        * */

        /*문자 : 문자도 ASCII CODE로 다뤄짐
        *
        * char = ASCII CODE
        * 'a' = 97 => 대문자로 변환 시에 32 더하면 변환가능
        * 'A' = 65
        *
        * java : Integer.parseInt("128") -> 128 // 문자열을 숫자로 변환
        * */

        /* 상수 (ex. final int MAX = 10)
        용도 - 기억장소(메모리블럭)을 값의 초기화 후 이용만 할 때에 이용
        특징 - 한번 초기화 이후 다시 초기화 x
            - 무조건 선언과 동시에 초기화

        목적 - 가독성, 유지보수 좋음

        */




    }
}
