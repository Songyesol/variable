package array;

public class ArrayExample3 { ///// 다시 풀기!!!!!!!!

	public static void main(String[] args) {
		int num1 = 50, num2 = 70, num3 = 90;
		int temp;

		// 세 변수에 들어있는 값 중 가장 큰 값을 temp
		if (num1 > num2) {
			if (num1 > num3)
				temp = num1;
			else
				temp = num3;
		} else {
			if (num2 > num3) 
			temp = num2;
			
			else
				temp = num3;
		} 
	System.out.println("가장 큰 수는 "+temp);

	temp=0;

	int[] intAry = { 34, 25, 57, 39, 55 };for(
	int num:intAry)
	{
		if (temp < num) {
			temp = num;
		}
	}System.out.println("가장 큰 수는 "+temp);
}
	}