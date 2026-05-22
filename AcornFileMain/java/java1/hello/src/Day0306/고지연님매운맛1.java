package Day0306;

public class 고지연님매운맛1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1999년
		//k시인구: 1800000
		//h시인구: 2500000
		//k시의 인구가 h시 인구 보다 많아지는 해는?
		
		//출력
		int result;
		
		//처리
		int year = 1999;
		double rise_k = 1800000; //
		double rise_h = 2500000; //
		
		while(rise_k <= rise_h){
			year = year + 1;
			rise_k = rise_k *(1+0.042); //rise_k * 1.036;
			rise_h = rise_h *(1+0.032); //rise_h * 1.042;
			
			System.out.println(rise_k);
			System.out.println(rise_h);
			System.out.println(year);
		}
		result = year;
		System.out.println(result);
	}

}
