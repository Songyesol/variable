package array;

public class ArrayExample {

	public static void main(String[] args) {
		int[] intAry = new int[5]; /* 배열 크기만 선언 */
		intAry[0] = 15;
		intAry[4] = 33;
		for (int i = 0; i < 5; i++) {
			System.out.println(intAry[i]);
			/* int 타입의 배열이면 초기값 0이 주어짐 */
			/* String의 초기값 : null, double&float타입 초기값 : 0.0 */
		}

		double[] doubleAry;
		doubleAry = new double[] { 2.4, 2, 4.5, 2.2, 1.6 };
		System.out.println(doubleAry[4]);

		double sum = 0;
		for (int x = 0; x < doubleAry.length; x++) {
			sum += doubleAry[x];
		}
		System.out.println(sum);

		/* enhance for */
		sum = 0;
		for (double dbl : doubleAry) { // doubleAry에 있는 갯수만큼만 반복하세요
			sum += dbl;
			System.out.println(dbl); // 반복되는 요소들을 dbl에 담아서 순서대로 출력
		}
		System.out.println("sum : " + sum);
		
		int sum1 =0;
		for(int dbl2 :  intAry) {
			sum1 += dbl2;
		} 
		System.out.println(sum1);
	}

}
