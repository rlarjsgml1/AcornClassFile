package Day0324.오후수업.prac.ex;

public class MyCalculator {
	/*
	public int add(int sul,int su2) {
		if(su1 < 0 || su2) {
			return -1;
		}
		int total;
		total = su1+ su2;
		return totao;
				
	} */
	
	public int add(int su1, int su2) throws Exception {
		if(su1< 0 || su2 < 0) {
			throw new Exception("응수예");
		}
		int total;
		total = su1 + su2;
		return total;
	}
}
