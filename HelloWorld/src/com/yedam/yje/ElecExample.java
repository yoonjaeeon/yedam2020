package com.yedam.yje;

import java.util.Scanner;

public class ElecExample {
	public static void main(String[] args) {
		int result = 0;
		int input_Num;

		Scanner scan = new Scanner(System.in);

		System.out.println("전기 사용량을 입력하세요.");
		input_Num = scan.nextInt();

		if (input_Num == 0) {
			System.out.println("사용한 적이 없음.");
		} else if (input_Num <= 100) {
			result = (input_Num * 100);
		} else if (input_Num <= 200 && input_Num >= 101) {
			result = ((input_Num - 100) * 150 + 10000);
		} else if (input_Num <= 300 && input_Num >= 201) {
			result = ((input_Num - 200) * 230 + 25000);
		} else {
			result = ((input_Num - 300) * 300 + 48000);
		}
		System.out.println(result + "원");
	}
}