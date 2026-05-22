package Day0320.계산기인터페이스.실습;

import java.util.Scanner;

public class 계산기프로그램2 {

	
	 //멤버로 가짐
	 //의존성 (dependency)
	 Calculator cal ; 
	 
	 //외부에서 생성된 계산기 객체 받아오기 
	 
	 //생성자를 통해서 (생성자 주입)
	 //setter를 통해서 ( setter 주입)

	public void setCal(Calculator cal) {
		this.cal = cal;
	}
 
	
	public void run() {
		
		//두 수 입력하고 계산해 주기 실행하기
		Scanner sc  = new  Scanner(System.in);
		System.out.println(" 두 수 입력");
		int su1= sc.nextInt();
		int su2= sc.nextInt();
		
		
		int result  = cal.add(su1, su2);
		
		System.out.println(result);
		
	}
	 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		계산기프로그램2   p  = new 계산기프로그램2();
		//p.setCal( new WJYCalculator());
		//p.setCal( new SMCalculator());
		//p.setCal( new LGCalculator());
		//p.setCal( new  Calculator() {});  //익명클래스 작성하는 것 
		p.setCal( new  Calculator() {

			@Override
			public int add(int su1, int su2) {
				// TODO Auto-generated method stub
				System.out.println("익명 주연 add");
				return su1+su2;
			}

			@Override
			public int sub(int su1, int su2) {
				// TODO Auto-generated method stub
				System.out.println("익명 주연 sub");
				return su1+su2;
			}});
		p.run();
		

	}



}
