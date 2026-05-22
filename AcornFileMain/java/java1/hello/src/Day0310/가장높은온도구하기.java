package Day0310;

public class 가장높은온도구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temperatures = {33, 35, 32, 35 ,36, 35 ,34};
		
		int max = temperatures[0];
		for(int i = 0;i<temperatures.length; i++) {
			if(temperatures[i]>max) {
				max = temperatures[i];
			}
		}
		System.out.println(max);
	}

}
