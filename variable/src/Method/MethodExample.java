package Method;

public class MethodExample {

	public static void main(String[] args) {
		Math m1 = new Math(); //실행문
			double sum = m1.sum(10.5,20)/*매개값*/;
			System.out.println("결과: "+sum);
			
		double area = m1.getArea(5.5); //원 넓이 pi*r*r;
			System.out.println("원 넓이: " + area);
			
		//정사각형 넓이 :getRectangle, 매개변수(4.2)	
			area = m1.getRectangle (4.2);
			System.out.println("정사각형 넓이: "+ area);
			
		//직사각형 넓이: getRectangle , 4.2, 2,4	
			area=m1.getRectangle(4.2, 2.4);
			System.out.println("직사각형 넓이: "+area);
		
			
		int[] array1= {5,10,15,20};
		int arySum=m1.getArySum(array1);
		System.out.println("배열의 합: "+arySum);
		/*System.out.println(m1.getArySum(array1));*/
		
		
		//사람의 적정 몸무게를 구하는 메소드 활용
		Person p1 =new Person("이창호", 10,135.5,32.5);
		double d1 = m1.getProperWeight(p1.height);
		if(p1.weight >d1) {
			System.out.println("체중과다...");
		} else if(p1.weight==d1) {
			System.out.println("적정체중...");
		}else {
			System.out.println("체중미달...");
		}
		
		
		
		
		
	}

		
}
