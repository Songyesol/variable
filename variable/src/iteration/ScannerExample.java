package iteration;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// Scanner 사용자가 입력하는 값을 읽어와서 작업하는 클래스
//		Scanner scn = new Scanner(System.in);
//		System.out.println("숫자만 입력");
//		int result = scn.nextInt(); 
//		//next는 문자나 숫자를 문자형태로 인식  (문자형태로 인식하기때문에 클래스 명은 String )
//		//nextInt는 숫자만 반환하기 때문에 클래스명도 int로 바꾸어야함. 
//		
//		System.out.println("입력값: " + result);

		
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int balance = 0; //변수를 0으로 담는 것을 초기화 라고 함.
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("-----------------------------");
			System.out.print("선택>");
			int menu = scn.nextInt();
			if(menu == 1) {
				System.out.println("예금액> ");
				balance += scn.nextInt(); //원래 있던 금액에 누적 
			} else if (menu ==2) {
				System.out.println("출금액> ");
				balance -= scn.nextInt(); //원래 있던 금액에서 제거  
			} else if (menu==3) {
				System.out.println("잔고> " + balance); // balance에 남아있는 금액 

			} else if(menu == 4) {
				run = false;
			}
		}//end of while
			System.out.println("프로그램 종료");
	}//end of main

}//end of class
