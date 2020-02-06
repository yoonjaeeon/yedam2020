package com.yedam.yje.collection;

import java.util.Arrays;

public class CompareExample {
	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);
		if (i1 > i2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		String s1 = "hello";
		String s2 = "good";
		String[] sAry = { s1, s2 }; // 배열
		Arrays.sort(sAry);
		for (int i = 0; i < sAry.length; i++) {
			System.out.println(sAry[i]);
		}
	}
}
