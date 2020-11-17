package iteration;

public class WhileMyExample {

	public static void main(String[] args) {
////		int i = 0;
////		int sum = 0;
////		while (i <= 10) {
////			sum += i;
////			i++;
//		}
//		System.out.println("1부터 10까지 합: " + sum);

///////////////////////////////////////////////////////		

//		int i=0, sum = 0; 
//		while(true) {
//			sum += i;
//		
//			if(i == 10) {
//				break;
//		}
//		i++;
//	}
//		System.out.println(sum);
//	

/////////////////////////////////////////////////		
		String str = "*";
//		for (int i = 0; i < 5; i++) {
//			System.out.println(str);
//			str += "*";

/////break point 찍고 디버깅모드(f11) -> step over(f6)
		int i=0;
		while(i<5) {
			i++;
			System.out.println(str);
			str += "*";
		}
		
	}

}
