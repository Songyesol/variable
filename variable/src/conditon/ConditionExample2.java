
//swich ~ case 구문 

//package conditon;
//
//public class ConditionExample2 {
//	public static void main(String[] args) {
//		int score = 90;
//		score /= 10;
//		String grade = "";
//		
//		switch(score) {
//		case 9:
//			grade = "A";
//			break; // 이 케이스를 만족하면 빠져나오라
//		case 8:
//			grade = "B";
//			break;
//		case 7:
//			grade = "C";
//			break;
//		case 6:
//			grade = "D";
//			break;
//		default: 
//			grade = "F";
//		}
//
//		System.out.println((score*10) + "점은 " + grade + "입니다.");

package conditon;

public class ConditionExample2 {
	public static void main(String[] args) {
		int score = 90;
		score /= 10;
		String grade = "";
		
		switch(score) {
		case 9:
		case 8:
			grade = "양호";
			break;
		case 7:
		case 6:
			grade = "보통";
			break;
		default: 
			grade = "미흡";
		}

		System.out.println((score*10) + "점은 " + grade + "입니다.");

	}
}
