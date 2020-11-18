package variable;

public class Morningcode {

	public static void main(String[] args) {
		int[] intNumbers = { 23, 56, 34, 65, 28, 21 };
		int sum = 0;
		int avg= 0;
		for (int i = 0; i < intNumbers.length; i++) {
			if (intNumbers[i] % 2 == 1) {
				sum += intNumbers[i];
				avg = sum/intNumbers.length;
			}
		}
		System.out.println("홀수 숫자의 합계 : " + sum);
		System.out.println("홀수 숫자의 평균 : "+ avg);
		
		int[] intNumbers1 = { 23, 56, 34, 65, 28, 21 };
		int sum1 = 0;
		int avg1 = 0;
		for (int x = 0; x < intNumbers1.length; x++) {
			sum1 += intNumbers1[x];
			avg1 = sum1 / intNumbers1.length;
		}
		System.out.println("전체평균 : "+avg1);

	}

}
