package variable;

public class arrayExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int[] numbers = { 10, 20, 30, 40, 50 }; // []배열타입 선언 (인덱스 순서가 0부터 시작)
		numbers[1] = 200; /* numbers의 2번째 자리에 200을 넣어라. */
		System.out.println(numbers[0]); // numbers배열의 첫번째 값을 가져오세요

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(numbers[i]);
			sum += numbers[i];
		}
		System.out.println("합: " + sum);

		int sum1 = 0;
		String[] strings = { "Hello ", "World ", "Nice ", "to ", "Meet " };
		for (int i = 0; i < strings.length; i++) {// .length 배열의 수
			strings[2] = "Good ";
			strings[4] = "See "; 
			System.out.print(strings[i]);
			
		}
		
	}

}
