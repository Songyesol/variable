package variable;

public class VariableExample {

	public static void main(String[] args) {
// 내가 푼 방식
//		int num1 = 40;
//		int num2 = 5;
//		int result1 = num1 - num2;
//		int result2 = num2 - num1;
//		String resultStr = "결과값은 ";
//		if (num1 > num2) {
//			System.out.println(resultStr + result1);
//		} else {
//			System.out.println(resultStr + result2);
//		}

// 교수님 풀이 !! 		
		int num1, num2, result;
		String resultStr = "결과값은 ";

		num1 = 20;
		num2 = 10;

		if (num1 > num2) {
			result = num1 - num2;
		} else {
			result = num2 - num1;
		}
		System.out.println(resultStr + result);
	}

}
