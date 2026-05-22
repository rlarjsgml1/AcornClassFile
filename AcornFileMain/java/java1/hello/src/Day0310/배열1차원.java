package Day0310;

public class 배열1차원 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[] {
				"김건희","고지연","김민정","황스일","이현겸",
                "이용찬","여도현","장해든","박세인","나해수",
                "손영석","송주창","정철진","김재민","엄진희",
                "이정하","김민경","조아진","장윤성","김태준"
		};
		String[] names2 = {
				"김건희","고지연","김민정","황스일","이현겸",
                "이용찬","여도현","장해든","박세인","나해수",
                "손영석","송주창","정철진","김재민","엄진희",
                "이정하","김민경","조아진","장윤성","김태준"	
		};
		
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		for(int i = 0; i<names2.length; i++) {
			System.out.println(names2[i]);
		}
	}

}
