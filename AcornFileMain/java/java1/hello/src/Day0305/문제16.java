package Day0305;

import java.util.Scanner;

public class 문제16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//15. 연산자를 입력받아      "+", "-", "*", "/", "%", "=", "<", ">", "!", "&&", "||"   (해당되면 연산자이다, 연산자가 아니다 출력) 연산자 여부를 출력하는 프로그램을 작성하시오
		Scanner sc = new Scanner(System.in);
		String result = "";
		System.out.println("연산자를 입력해주세요");
		String operator = sc.nextLine();
		if(operator.equals("+")||operator.equals("-") || operator.equals("/")||operator.equals("*")||operator.equals("%")||operator.equals("=")||operator.equals("<")||operator.equals(">")||operator.equals("!")||operator.equals("&&")||operator.equals("||")) {
			result = "연산자가 맞습니다";
			System.out.print(result);
		} else {
			result = "연산자가 아닙니다";
			System.out.print(result);
		}
	}

}