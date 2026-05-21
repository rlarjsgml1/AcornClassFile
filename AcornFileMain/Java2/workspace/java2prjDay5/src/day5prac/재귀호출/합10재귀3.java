package day5prac.재귀호출;

public class 합10재귀3 {
	public static void main(String[] args) {
		int result = getSumR(10);
		System.out.println(result);
	}

	// 재귀 함수
	// 탈출 조건을 명시

	public static int getSumR(int su) {
		if (su == 1) {
			return 1;
		} else {
			return su + getSumR(su - 1);
		}
	}
	//getSumR(10)
	//		 10+getSumR(9)
				// 9 + getSumR(8)
					//8+ getSumR(7)
						//7+ getSumR(6)
							//6+ getSum(5)
								//5+ getSum(4)
									//4+ getSum(3)
										//3+ getSum(2)
											//2+ getSum(1)
												//1
	
	//getSumR(10)
		//		 10+45
					// 9+36
						//8+28
							//7+21
								//6+15
									//5+ 10
										//4+ 6
											//3+3
												//2+1
													//1
}
