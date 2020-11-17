package variable;

public class DataTypeExample {

	public static void main(String[] args) {
		byte num1 = 12; // -128 ~ +127
		short num2 = 128;
		int num3 = 1000000000;
		long num4 = 1000000000000L;//끝에 L로 표시해서 long형임을 알려주기 

		byte val1=10;
		num3 = val1; 
		//자동 형변환 promotion (byte타입을 int형으로 자동변환) 
		
		int result=(byte)(num1+val1); 
		System.out.println(result);
		//계산식(+,-,*,/)은 int타입으로만 가능. 강제 형변환 casting
		
		num1 =120;
		for( int i=0; i<20; i++) {
				System.out.println(num1++); 
		}
		//byte타입에 증감연산자를 썼을 때 정수타입으로 바꾸지 않고 형 유지. 
		//byte문은 -128~127 사이 루프 반복이기 때문. 
		
		char char1= 97; //정수 65에 해당하는 문자값을 출력해줌.
		for (int i=0; i<24 ; i++)
		System.out.println(char1++); 
		// 정수형타입의 문자를 하나씩 증가시키면서 문자값 출력
		
		float floatVal = 4.567F;
		//실수형일때는 아무 표시가 없으면 double타입으로 인식하기 때문에 뒤에 F를 붙여 float형임을 표시해야함.
		double doubleVal = 3.1425;
		
	}// end of maim

}// end of class
