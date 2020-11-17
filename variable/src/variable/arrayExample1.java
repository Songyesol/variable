package variable;

public class arrayExample1 {
//1,3,5,7,9 (홀수 위치에만 있는 값만 합하는 프로그램)
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int sum = 0;
		for (int i = 0; i <10; i++) {
			if (i % 2 == 1) {
				sum += numbers[i];
			}
		} System.out.println(sum);

	}


}