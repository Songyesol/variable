//                Operator = 연산자

package variable;

public class OperatorExample {
	public static void main(String[] args) {

		// 문자열을 출력하는 변수 str
		// 같은 변수를 연속해서 입력하면 문장을 연결해서 결과값을 변수에 누적(결과누적)
		String str = "Hello";
		str = str + " World";
		str = str + "!!!";
		System.out.println(str);

		int num1 = 10;
		num1 = num1 + 5;
		num1 = num1+ 15;
		System.out.println(num1);
		
		double num2 = 3.4;
		num2 = num2*10;
		num2 = num2*100;
		System.out.println(num2);
		
		boolean tf = true;
		tf = !tf; //not의 의미인 !를 넣으면 false 나옴  
		tf = !tf;
		System.out.println(tf);
	}

}
