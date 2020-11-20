package array;

import java.util.Scanner;

public class Exercise09 {
	private static int sum;

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
	
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수| 2. 점수입력 | 3. 점수리스트| 4. 분석| 5. 종료");
			System.out.println("---------------------------------------------");
			System.out.println("선택> ");

			int selectNO = scanner.nextInt();

			if (selectNO == 1) {
				System.out.println("학생수: ");
				studentNum = scanner.nextInt();
				
				scores = new int[studentNum];
			} else if (selectNO == 2) {
				for(int score = 0; score < scores.length; score++) {
					System.out.println("학생["+score+"] 점수는: ");
					scores[score] = scanner.nextInt();
					
				}
				
			} else if (selectNO == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println(scores[i]);
				}
				
			} else if (selectNO == 4) {
				for(int j = 0; j < scores.length; j++) {
					double avg = 0;
					int sum = 0;
					sum += scores[j];
					
				} double avg = (double) sum / scores.length;
				System.out.println();
				System.out.println(avg);
			   
			   
			} else if (selectNO == 5) {
				run = false;
			}
		}

		System.out.println("프로그램 종료");
	}// main
}
