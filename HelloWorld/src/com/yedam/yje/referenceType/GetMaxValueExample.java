package com.yedam.yje.referenceType;

public class GetMaxValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intAry = { 8, 7, 10, 5, 9 };
		System.out.println("최대값은: " + getMaxValue(intAry));
	}

	public static int getMaxValue(int[] ary) {
		int max = 0;
		for (int i = 0; i < ary.length; i++) {
			if (max < ary[i]) {
				max = ary[i];
			}
		}
		return max;
	}
}
