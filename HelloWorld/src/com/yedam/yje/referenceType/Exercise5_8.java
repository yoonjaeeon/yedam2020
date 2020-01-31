package com.yedam.yje.referenceType;

public class Exercise5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ary = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		for (int i = 0; i < ary.length; i++) {
			//cnt += ary[i].length;
			for (int j = 0; j < ary[i].length; j++) {
				sum += ary[i][j];
				count++;
			}
		}
		
		avg = (double) sum / count;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
