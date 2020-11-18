package array;

public class ArrayExample2 {

	public static void main(String[] args) {
		double result = 0;
		double[] dAry = { 23.2, 55.3, 52.8, 62.8 };
		result = doubleSum(dAry);
		System.out.println("sum: " + result);

		result = doubleAvg(dAry);
		System.out.println("avg: "+ result);

	}

	/*
	 * double[] => 23.2, 55.3, 52.8, 62.8 : dAry method : doubleSum(), 매개변수 :double
	 * 반환해주는 값 : double
	 */
	public static double doubleSum(double[] ary) {
		double result = 0;
		for (double dbl : ary) {
			result += dbl;

		}
		return result;

	}

	public static double doubleAvg(double[] ary) {
		double result = 0;
		double sum=0;
		for (double dbl : ary) {
			sum += dbl;
			result = sum / ary.length;
		}
		return result;
	}
}