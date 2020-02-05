package com.yedam.yje.interfaces;

public class MorningCode { //10진수 -->2진수

	public static void main(String[] args) {
		String result = getDigiNumber(30);
		System.out.println(result);
	}

	static String getDigiNumber(int num) {
		String result = " ";
		int num2 = 0;
		int num1 = num;
		while (true) {
			num2 = num1 % 2;
			result = num2 + result;
			num1 = num1 / 2;
			if (num1 == 0)
				break;
		}
		return result;
	}

}