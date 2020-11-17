package variable;

public class ReferenceExample { //참조타입

	public static void main(String[] args) {
			String str1 = "Hello";//str1에 Hello가 담겨져있는 주소값이 저장되어있음
			String str2 = "Hello";//문자(리트럴형식)으로 값을 대입하면 같은 단어는 같은 주소값에 저장.
			String str3 = new String ("Hello");//new라는 키워드로 인스턴스를 만든다. 
			
			if(str1.equals(str3)) { 
				/*string은 변수와 변수를 직접 선언하는게 아니고 주소값을 비교하는것
				 '=='는 같다라는 의미가 아니라 대입이기 때문에 리터럴 그 자체를 비교 하고 싶다면 
				 equls를 사용해야 한다.*/
				System.out.println("동일한 값");
			} else {
				System.out.println("다른 값");
			}
				
	}//end of main


} //end of class
