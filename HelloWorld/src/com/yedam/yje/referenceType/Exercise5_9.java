package com.yedam.yje.referenceType;

import java.util.Scanner;

public class Exercise5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------");
			System.out.println("1.학생수|2.점수이력|3.점수리스트|4.분석|5.종료");
			System.out.println("-------------------------");
			System.out.print("선택>");
			int selectNo = scn.nextInt();
			if (selectNo == 1) {
				System.out.print("학생수>");
				studentNum = scn.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					int score = scn.nextInt();
					scores[i] = score;
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>: " + scores[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0, cnt = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					cnt++;
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("최고점수: " + max);
				System.out.println("평균점수: " + ((double) sum / cnt));
			} else if (selectNo == 5) {
				run = false;
			}
		} // end of while
		System.out.println("프로그램 종료.");
	}
}
