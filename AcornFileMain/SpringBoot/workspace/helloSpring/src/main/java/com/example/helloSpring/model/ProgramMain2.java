 package com.example.helloSpring.model;

import java.util.ArrayList;

public class ProgramMain2 {

	public static void main(String[] args) { 	 

		//Cook형을 담을 수 있는 ArrayList를 준비한다
		ArrayList<Cook> list = new ArrayList<Cook>();
		                             
		// Cook을 상속받았으므로 각 각의 요리사 클래스를 담을 수 있다
		 list.add ( new  CAJCook("조아진"));
		 list.add ( new  LHKCook("이현겸"));
		 list.add ( new  DHYCook("여도현"));
		 list.add ( new  JCJCook("정철진"));
		 list.add ( new  EJHCook2("엄진희"));
		 list.add ( new  JHDCook("장해든"));
		 list.add ( new  HSICook("황스일"));
		 list.add ( new  JYSCook("장윤성"));
		 list.add ( new  KJYCook("고지연"));
		 list.add ( new  KMJCook("김민정"));
		 list.add ( new  KMKCook("김민경"));
		 list.add ( new  NHSCook("나해수"));
		 list.add ( new  PSICook("박세인"));
		 list.add ( new  SJCCook("송주창"));
		 list.add ( new  SYSCook("손영석"));
		 list.add ( new  KKHCook4("김건희"));
		 list.add ( new  LJHCook("이정하"));
		 list.add ( new  LHKCook("김재민"));
		 list.add ( new  KTJCOOK("김태준"));
				 
		 
		

		// 요리사별로 ArrayList 준비하기
		ArrayList<한식가능한> 한식요리사 = new ArrayList<한식가능한>();
		ArrayList<중식가능한> 중식요리사 = new ArrayList<중식가능한>();
		ArrayList<일식가능한> 일식요리사 = new ArrayList<일식가능한>();

		
		// 요리사종류별로 목록을 구성한다.
		for (Cook cook : list) {
			if (cook instanceof 한식가능한) {
				한식요리사.add((한식가능한) cook);
			} else if (cook instanceof 중식가능한) {
				중식요리사.add((중식가능한) cook);
			} else if (cook instanceof 일식가능한) {
				일식요리사.add((일식가능한) cook);
			}
		}

		System.out.println("--한식 요리사 입니다--");
		System.out.println(한식요리사);

		System.out.println("--중식 요리사 입니다--");
		System.out.println(중식요리사);

		System.out.println("--일식 요리사 입니다--");
		System.out.println(일식요리사);

		
		// 랜덤한 값 얻어오기
		int random = (int) (Math.random() * 3); // 0~2; 
		
		
		//선택한 요리사종류 출력하기
		String[] kinds = { "한식가능한", "중식가능한", "일식가능한" };
		String selectedKind = kinds[random];
		System.out.println("==========>선택된 요리사 kind  ====>" + selectedKind);

		 
		//선택된 요리사종류  중에서 한 명의 요리사 선택하기 
		int randomRange = 0;
		int finalOne;
		Cook finalCook = null;

		switch (selectedKind) {
		case "한식가능한":
			 
			randomRange = 한식요리사.size();
			System.out.println("randomRange="+ randomRange);
			finalOne = (int) (Math.random() * randomRange);
			finalCook = (Cook) 한식요리사.get(finalOne);
		
			break;

		case "중식가능한":
			 
			randomRange = 중식요리사.size();
			System.out.println("randomRange="+ randomRange);
			finalOne = (int) (Math.random() * randomRange);
			finalCook = (Cook) 중식요리사.get(finalOne);
			 
			break;

		case "일식가능한":			 
			randomRange = 일식요리사.size();
			System.out.println("randomRange="+ randomRange);
			finalOne = (int) (Math.random() * randomRange);
			finalCook = (Cook) 일식요리사.get(finalOne);			 
			break;
		}
		
			
	
		
		try {
			Thread.sleep(5000);  // 1000 =>1초
			
			System.out.println("====>최종선발   축하합니다  😄 🎉🎉🎉  ");
			System.out.println(finalCook);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		 

	}

}
