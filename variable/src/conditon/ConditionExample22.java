package conditon;

public class ConditionExample22 {
	public static void main(String[] args) {
		int randomValue = (int)(Math.random()*6);
		//Math.random이 0< random <1사이의 난수(소숫점 형태)로 만들어주는 것을 
		// int타입의 정수형으로 바꾸기 위해 앞에 형태변환. 
		
		switch(randomValue) {
		case 1:
			System.out.println("1이 나왔습니다");
			break;
		case 2:
			System.out.println("2이 나왔습니다");	
			break;
		case 3:
			System.out.println("3이 나왔습니다");
			break;
		case 4:
			System.out.println("4이 나왔습니다");
			break;
		case 5:
			System.out.println("5이 나왔습니다");
			break;
		default:
			System.out.println("6이 나왔습니다");
		}
		
	}
}
