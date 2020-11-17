package variable;

public class OperatorExample1 {

	public static void main(String[] args) {
		String str = "Hello";
		str += " world"; // += 기존에 있던 타입이 연결 
		System.out.println(str);
		
		int num1 = 10;
		num1 += 5;
		num1 -= 3;
		num1 *= 5;
		num1 /= 6;
		System.out.println("num1 : " + num1);
		
		int num2 = 10;
//		num2 = num2  +1;
		num2++; //원래 있던 값에 1을 증가시킴 
		num2--; //원래 있던 값에 1을 감소시킴
		num2--;
		num2--;
		num2--;
		System.out.println("num2 : " + num2);
		
		int num3 = 10;
		num3 -= 5;
		num3 -= 5;
		num3 -= 5;
		num3 += 15;
		
		if (num3 > 0) {
			System.out.println("num3은 0보다 큽니다.");
		} else if(num3 < 0){
			System.out.println("num3은 0보다 작습니다.");
		} else { 
			System.out.println("num3은 0입니다.");
		}
		
		int num4 = 30;
		num4 /= 2; // 슬러쉬(/)는 나누기, 퍼센트(%)는 나머지! 헷갈리지 말것.  
		
		if(num4 % 2 == 0) {
			System.out.println("num4는 짝수입니다.");
		} else {
			System.out.println("num4는 홀수입니다.");
	}

		//할당 연산자 if~else 구문을 간단하게 줄이고 싶을때 사용 
		// 
		boolean result = true;
		result = (num4 % 2) == 0 ? true : false;
//		result = (num4 % 2) == 0 ? 0 : 1; 
//		String result = (num4 % 2) == 0 ? "True" : "False";
		System.out.println(result);
		
		
	}
}