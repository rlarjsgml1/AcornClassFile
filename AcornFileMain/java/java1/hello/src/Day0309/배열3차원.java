package Day0309;

public class 배열3차원 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][][] 배열2차원 = {
				{
					{"*1", "*2", "*3"},
					{"*4", "*5", "*6"},
					{"*7", "*8", "*9"}
				},
				{
					{"@10", "@11", "@12"},
					{"@13", "@14", "@15"},
					{"@16", "@17", "@18"}
				}
		};
		//for 3번 중첩해서 i : 층 , j = 행, d = 열 
		for(int i=0; i<배열2차원.length; i++) {
			for(int j = 0; j<배열2차원[i].length; j++) {
				for(int d = 0; d<배열2차원[i][j].length;d++) {
					System.out.print(배열2차원[i][j][d]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
