package variable;

public class OperatorExample2 {
	public static void main(String[] args) {
		int num1 = 3;
		
//		int result = 0; // 짝수 : 0, 홀수 : 1;
		boolean result = true; // 짝수 : ture, 홀수 : false 
		
		//  1)if 구문
		if (num1 % 2 == 0) {
			System.out.println(result);
		} else {
			System.out.println(!result);
	}

		// ? : 구문
		result = (num1 % 2) == 0 ? true : false ; 
		System.out.println(result);
		
	}
}
