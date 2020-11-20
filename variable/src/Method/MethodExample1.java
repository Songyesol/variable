package Method;

public class MethodExample1 {

	public static void main(String[] args) {
		
		Rectangle r1=new Rectangle();
		//new라는 키워드로 렉텡글 클래스의 인스턴스를 생성하여 r1이라는 참조변수에 담는다.
		r1.drawRectanle();
		
		String result = r1.getRectangle();
		System.out.println(result);
		
		r1.drawShape("ooo"/*변수 매개값*/);
		
		
		
	}
	
	
}
