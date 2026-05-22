package Day0316.객체배열;

public class 학생정보만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AcornStudent2 김건희  = new AcornStudent2("김건희", 1000,30,50,100);
		AcornStudent2 김건희 = new AcornStudent2("김건희",1000,30,50, 100);
		AcornStudent2 김민정 = new AcornStudent2("김민정", 100, 50, 20, 50);	 
		AcornStudent2 장해든 = new AcornStudent2 ("장해든", 1000, 30, 50, 100);		 
		AcornStudent2 여도현 = new AcornStudent2("여도현", 1000, 30, 50, 100);		 
		AcornStudent2 이현겸 = new AcornStudent2("이현겸", 1000, 190, 1, 2);		 
		AcornStudent2 박세인 = new AcornStudent2("박세인",1000,30,50,100);		 
		AcornStudent2 엄진희 = new AcornStudent2("엄진희",1000,30,50,100);		 
		AcornStudent2 나해수 = new AcornStudent2("나해수", 1000, 30, 50, 100);		 
		AcornStudent2 송주창 = new AcornStudent2("송주창", 1000, 50, 50, 50);		 
		AcornStudent2 조아진 = new AcornStudent2("조아진", 1000, 30, 50, 100);		 
		AcornStudent2 이정하 = new AcornStudent2("이정하", 1000, 30, 50, 100);		 
		AcornStudent2 김태준 = new AcornStudent2("김태준",50,10,100,100);		 
		AcornStudent2 이용찬 = new AcornStudent2("이용찬", 1000, 30, 50, 100);		 
		AcornStudent2 정철진 = new AcornStudent2("정철진", 1000, 30, 50, 100);		 
		AcornStudent2 김재민 = new AcornStudent2("김재민",1000,30,50, 100);		 
		AcornStudent2 고지연 = new AcornStudent2("고지연", 800, 10, 20, 30);		 
		AcornStudent2 장윤성 = new AcornStudent2("장윤성", 1000,30,50,100);		 
		AcornStudent2 손영석 = new AcornStudent2("손영석", 700,50,50,50);
		AcornStudent2 황스일 = new AcornStudent2("황스일", 700,50,50,50);
		
		//여러 에이콘객체를 편리하게 다루려면??
		//배열, 객체배열로 다뤄야 한다
		//배열은 크기를 반드시 알아야 한다(20개)
		AcornStudent2[] list = new AcornStudent2[19];
		//객체를 참조할 수 있는 참조형변수를 배열로 만든 것이다
		//객체가 만들어진것이 아니다
		list[0] = 김건희;
		list[1] = 김민정;
		list[2] = 장해든;
		list[3] = 여도현;
		list[4] = 이현겸;
		list[5] = 박세인;
		list[6] = 엄진희;
		list[7] = 나해수;
		list[8] = 송주창;
		list[9] = 조아진;
		list[10] = 이정하;
		list[11] = 김태준;
		list[12] = 이용찬;
		list[13] = 정철진;
		list[14] = 김재민;
		list[15] = 고지연;
		list[16] = 장윤성;
		list[17] = 손영석;
		list[18] = 황스일;
		
		//반복문
		//에이콘학생의 정보 출력하기
		for(int i=0; i<list.length; i++) {
			list[i].정보출력하기();
		}
		
		AcornStudent2[] list2 = {
				김건희, 김민정,장해든,여도현, 이현겸,
				박세인,엄진희, 나해수, 송주창, 조아진, 
				이정하, 김태준, 이용찬, 정철진, 김재민
				,고지연, 장윤성, 손영석, 황스일};
		for(int i=0; i<list2.length; i++) {
			list2[i].정보출력하기();
		}
		
		//int[] list3 = new int[19];
		AcornStudent2[] list3=new AcornStudent2[19];
		//list3이라는 배열은 참조형변수가 연속적으로 확보되고  null로 초기화됨
		
		list3[0] = new AcornStudent2("김건희",1000,30,50,100);
		list3[1] = new AcornStudent2("김민정",100,50,20,50);
		list3[2] = new AcornStudent2("장해든",1000,30,50,100);
		list3[3] = new AcornStudent2("여도현",1000,30,50,100);
		list3[4] = new AcornStudent2("이현겸",1000,190,1,2);
		list3[5] = new AcornStudent2("박세인",1000,30,50,100);
		list3[6] = new AcornStudent2("엄진희",1000,30,50,100);
		list3[7] = new AcornStudent2("나해수",1000,30,50,100);
		list3[8] = new AcornStudent2("송주창",1000,50,50,50);
		list3[9] = new AcornStudent2("조아진",1000,30,50,100);
		list3[10] = new AcornStudent2("이정하",1000,30,50,100);
		list3[11] = new AcornStudent2("김태준",50,10,100,100);
		list3[12] = new AcornStudent2("이용찬",1000,30,50,100);
		list3[13] = new AcornStudent2("정철진",1000,30,50,100);
		list3[14] = new AcornStudent2("김재민",1000,30,50,100);
		list3[15] = new AcornStudent2("고지연",800,10,20,30);
		list3[16] = new AcornStudent2("장윤성",1000,30,50,100);
		list3[17] = new AcornStudent2("손영석",700,50,50,50);
		list3[18] = new AcornStudent2("황스일",700,50,50,50);
		
		for(int i = 0; i<list3.length; i++) {
			list3[i].정보출력하기();
		}
		
	}

}
