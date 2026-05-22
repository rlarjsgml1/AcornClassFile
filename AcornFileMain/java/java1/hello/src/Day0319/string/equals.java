package Day0319.string;

public class equals {
	public static void main(String[] args) {
		
		String str = "hello";
		String str2 = "hellw";
		
		boolean result = str.equals(str2);
		
		System.out.println(result);
		
		char[] str3 = {'h', 'e', 'l', 'l', 'o'};
		char[] str4 = {'h', 'e', 'l', 'l', 'w'};
		
		boolean flag =true;
		
		for(int i = 0 ; i< str3.length; i++) {
			if(str3[i] != str4[i]) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
	}

}
