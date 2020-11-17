package conditon;

public class ConditionExample {
	public static void main(String[] args) {
		int score = 76;
		String grade = "";

		// 정렬 ctrl + shift + h
		// 중첩if문 중첩문을 사용 할 때에는 원래 설정한 값이 나올 수 있도록 다시 if ~else 구문으로 지정해주기 (대괄호 신경쓰기)
		
		if (score >= 90) { 
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(score + "점은 " + grade + "입니다.");
	}
}
