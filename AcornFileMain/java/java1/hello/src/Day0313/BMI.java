package Day0313;

public class BMI {
	String name;
	double hi;
	double wi;
	
	public void 정보입력(String name, double hi, double wi) {
		this.name = name;
		this.hi = hi;
		this.wi = wi;
	}
	public double 계산하기() {
	    double meter = hi / 100;
	    double result = wi / (meter * meter);
	    return result;
	}
	public void 출력하기() {
		System.out.println("이름:" + name);
		System.out.println("키:" + hi);
		System.out.println("몸무게:" + wi);
		System.out.println("BMI:" + 계산하기());
	}

}
