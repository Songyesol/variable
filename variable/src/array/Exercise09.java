package array;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);


		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("---------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = scanner.nextInt(); //값을 읽어서 정수타입의 값을 저장
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]>" + scores[i]);	
					}
				
			} else if (selectNo == 4) {
				int sum = 0;
				double avg = 0;
				int max = 0;
				
				for(int i=0; i<scores.length; i++) {
				if(max<scores[i]){
					max=scores[i];
				} 
				sum += scores[i];
				avg = (double)sum/scores.length;  
				}
					
				System.out.println("최고점수: " + max);
				System.out.println("평균점수: " + avg);

			} else if (selectNo == 5) {
				run = false;

			}
		}
	}

}
