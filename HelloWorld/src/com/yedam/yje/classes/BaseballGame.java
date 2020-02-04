package com.yedam.yje.classes;//야구게임

import java.util.Scanner;

public class BaseballGame {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] answer = new int[3];
		int temp = 0;
		for (int i = 0; i < answer.length;) {
			temp = (int) (Math.random() * 9) + 1;
			int j = 0;
			for (; j < i; j++) {
				if (i != 0 && answer[j] == temp) {
					System.out.println("동일 숫자 존재.");
					break;
				}
			}
			if (i != j)
				continue;
			answer[i++] = temp;
		}
		System.out.println("completed.");
		for (int i = 0; i < answer.length; i++) {
			System.out.print("[" + answer[i] + "] ");
		}
//		int[] input = new int[3];
//		while (true) {
//			for (int i = 0; i < input.length; i++) {
//				System.out.println("숫자 입력.");
//				input[i] = scn.nextInt();
//			}
//			int strike = 0, ball = 0;
//			for (int i = 0; i < input.length; i++) {
//				for (int j = 0; j < input.length; j++) {
//					if (answer[i] == input[j]) {// 값이 같으면
//						if (i == j) // 위치같고
//							strike++;
//						else // 위치다르고
//							ball++;
//					}
//				}
//			}
//			System.out.println("스트라이크: " + strike + " 볼:" + ball);
//			if (strike == 3) {
//				System.out.println("결과: " + answer[0] + " " + answer[1] + " " + answer[2]);
//				break;
//			}
//			// 3strike 종료.
//		}
		System.out.println("프로그램 종료.");
		// answer배열에 들어 있는 값을 맞추도록.
	}
}