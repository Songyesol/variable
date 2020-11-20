package Method;

public class Math {

	private double pi=3.14;
	
	
	public int sum(int a, int b)/*매개변수*/ { //정의문
		return a+b;
	}
	public double sum(double a, double b){
		return a+b;
	}
	public double getArea(double a) {
		return pi*a*a;
	}
	public double getRectangle(double a) {
		return a*a;
	}
	public double getRectangle(double a, double b) {
		//메소드 이름이 같으면 에러가 나지만 매개변수의 갯수가 다르면 사용가능. 
		return a*b;
	}
	//int 배열의 합 구하는 메소드 
	public int getArySum(int[] ary) {
		int sum=0;
		for( int num:ary) {	
		sum += num;
		}
		return sum;
	}
	
	//사람의 적정 몸무게를 구하는 메소드 (Person)
	public double getProperWeight(Person p1) {
		//(키-100)*0.9
		double properWeight =(p1.height-100)*0.9;
		return properWeight;
	}
	
	public double getProperWeight(double height) {
		double properWeight = (height-100)*0.9;
		return properWeight;
	}
	
}
