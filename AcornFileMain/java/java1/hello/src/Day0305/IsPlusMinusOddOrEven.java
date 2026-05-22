package Day0305;

import java.util.*;

class Statistics { // public 제거 (같은 파일에 두려면 public 1개만 가능)
    int positiveCount;
    int negativeCount;
    int positiveOddCount;
    int positiveEvenCount;
}

public class IsPlusMinusOddOrEven {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // 1) 입력 10개 받기
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(sc.nextLine());
            list.add(num);
        }

        // 2) 통계 객체 만들고 계산
        Statistics result = new Statistics();

        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);

            if (value > 0) {
                result.positiveCount++;

                if (value % 2 == 0) {
                    result.positiveEvenCount++;
                } else {
                    result.positiveOddCount++;
                }
            } else {
                result.negativeCount++;
            }
        }

        // 3) 출력
        System.out.println(result.positiveCount);
        System.out.println(result.negativeCount);
        System.out.println(result.positiveEvenCount);
        System.out.println(result.positiveOddCount);

        sc.close();
    }
}