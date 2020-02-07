package com.yedam.yje.classes;

public class Exam04 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		i = 1;
		while (i <= 100) {
			if (i % 2 == 0 && i % 3 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("1~100 숫자 중에서 2의배수와 3배수의 합은: " + sum);
	}
}
