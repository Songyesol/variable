package array;

public class MorningCode {

	public static void main(String[] args) {
		int[][] intAry = new int[5][5];
		int num = 1;
		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {
				intAry[i][j] = num++;
			}
			
			String[] strAry = {"Hello", "World"};
			for (String str:strAry) {
				System.out.println(str);
			}
		}
		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry.length; j++) {
				System.out.print(intAry[i][j] + " ");
			}
			System.out.println();
		}

	}
}
