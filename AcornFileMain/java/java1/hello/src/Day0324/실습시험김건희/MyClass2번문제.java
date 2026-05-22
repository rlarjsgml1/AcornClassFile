package Day0324.실습시험김건희;

public class MyClass2번문제 {
	//문제 2번 문제
	public int getTotal(int su) {
        int sum = 0;
        for (int i = 1; i <= su; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        MyClass2번문제 m = new MyClass2번문제();
        int result = m.getTotal(5);
        System.out.println(result);
    }
}
