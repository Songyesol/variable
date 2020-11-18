package array;

public class ArrayExample4 {

	public static void main(String[] args) {
		// 이차원 배열
		int[][] intAry = new int[3][3];
		intAry[0] = new int[] { 11, 12, 13 };
		intAry[1] = new int[] { 21, 22, 23 };
		intAry[2] = new int[] { 31, 32, 33 };

		System.out.println(intAry[0][0]); /* 1행 1열 */
		
		System.out.println(intAry.length); /*첫번째 배열의 크기*/
		System.out.println(intAry[0].length);
		
		for(int i =0; i < intAry.length; i++) {
			for(int j =0; j < intAry[1].length; j++) {
				System.out.println("intAry[" + i + "," + j + "]" + ">" + intAry[i][j]);
			}
		}

		
		int[][] intAry2 = { 
				{ 11, 12, 13 },  // [0]
				{ 21 },          // [1]
				{ 31, 32 }       // [2]
			};
		System.out.println(intAry2[0][2]);
		System.out.println(intAry2.length);
		System.out.println(intAry2[1].length);
		/*숙제
		 *intAry2의 배열의 각 합, 평균
		 * intAry2[0] => 합: ??, 평균: ??
		 * intAry2[1] => 합: ??, 평균: ??
		 * intAry2[3] => 합: ??, 평균: ??*/

	}

}
