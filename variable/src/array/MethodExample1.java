package array;

public class MethodExample1 {
	public static void main(String[] args) {
		showInfo("45"); // 큰따옴표안에 있는 것은 문자열이 됨
		int result = showDouble(45);
		System.out.println("반환값: " + result);
		System.out.println(showDouble(33.2));
		
		double result1 = divide1(1.5,0.5);
		System.out.println(result1);
	}

	public static void/* 반환값(return)이 없다 */ showInfo(String name) {
		System.out.println("안녕하세요. " + name + "입니다.");
	}

	public static int showDouble(int num) {
		return num * 2;
	}

	public static double showDouble(double num) {
		return num * 2; /* 메소드 반복해서 사용 가능 */
	}

	// 정수형 변수2개를 받아서 두수의 합을 반환해주는 메소드 (sum)
	public static int Sum(int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}

	// 정수형 변수 3개를 받아서 세 수의 곱을 반환 하는 메소드 (multi)
	public static int multi(int c, int d, int e) {
			int result = 0;
			result = c*d*e;
			return result;
	}
	
	//double타입의 실수 두개를 받아서 첫번째 매개변수/두번째 매개변수 (divide)
	public static double divide (double f, double g) {
		double result = 0;
		result = f / g;
		return result;
	}
	
	public static double divide1 (double f, double g) {
		double result = 0;
		if(f>g) {
			result = f / g;
		} else {
			result = g / f;
		}
		return result;
}
}
