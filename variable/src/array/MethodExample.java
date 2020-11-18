package array;

public class MethodExample {

	public static void main(String[] args) {
		// 두 수를 더해서 2로 나누고 50을 더하고 다시 10으로 나누는 프로그램이 있다고 가정
		int num1, num2, result;
		num1 = 34;
		num2 = 55;
		result = sumMethod(num1, num2);
		System.out.println(result);

		int val1 = 22, val2 = 55;
		result = sumMethod(val1 , val2);
		System.out.println(result);
		
		int val3 = 23 , val4 = 56; 
		result = sumMethod(val3 , val4);
		System.out.println(result);
	}
/*복잡한 연산값을 method로 정의하여 method를 사용하여 연산대체*/
	
	public static int/*타입선언*/ sumMethod/*변수명*/(int numb1, int numb2)/*sumMethod드를 호출했을때 나오는 매개변수*/  { 
		
		int result = numb1+numb2;
		result = result/2;
		result = result+ 50;
		result = result/10;
	return result;
	} 
	
}
