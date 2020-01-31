package com.yedam.yje.classes;

import java.util.Scanner;

// 2,3 배수 이외의 경우는 기타.
// 종료 999 입력

public class MultiplesExample {
	public static void main(String[] args) {
		int num1;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("정수 입력 : 999:종료");
			num1 = scan.nextInt();
			if (num1 == (999)) {
				break;
			} else if (num1 % 2 == 0 && num1 % 3 != 0) {
				System.out.println("2의 배수");
			} else if (num1 % 3 == 0 && num1 % 2 != 0) {
				System.out.println("3의 배수");
			} else if (num1 % 2 == 0 && num1 % 3 == 0) {
				System.out.println("2와3의 배수");
			} else if (num1 % 2 != 0 && num1 % 3 != 0) {
				System.out.println("기타");
			}
		}
		System.out.println("종료");
	}
}
