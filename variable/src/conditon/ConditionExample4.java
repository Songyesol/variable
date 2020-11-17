package conditon;

public class ConditionExample4 {
	public static void main(String[] args) {
		int num1 = 15;

		if (num1 % 5 == 0 && num1 % 3 == 0) { // 논리연산자 && (2개가 모두 TRUE일때 TRUE)
			System.out.println("3과 5의 공통배수 입니다.");
		} else if (num1 % 5 == 0) {
			System.out.println("5의 배수 입니다.");
		} else if (num1 % 3 == 0) {
			System.out.println("3의 배수 입니다. ");
		} else {
			System.out.println("기타입니다.");
		}

	}
}