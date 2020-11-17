package iteration;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int balance = 0;

		while (run) {
			System.out.println("-------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("-------------------");
			System.out.print("선택> ");
			int menu = scn.nextInt();
			System.out.println(menu + "번 메뉴를 선택했습니다.");
			if (menu == 1) {
				System.out.print("예금액> ");
				balance += scn.nextInt();
				
			} else if (menu == 2) {
				System.out.print("출금액> ");
				balance -= scn.nextInt();
				
			} else if (menu == 3) {
				System.out.println("잔고: " + balance);
				
				
			} else if (menu == 4) {
				run = false;
			}
		} // end of while
		System.out.println("프로그램 종료.");
		/*
		 * Scanner scn = new Scanner(System.in); System.out.println("숫자만 입력."); int
		 * result = scn.nextInt();
		 * 
		 * System.out.println("입력값: " + result);
		 */} // end of main

} //end
