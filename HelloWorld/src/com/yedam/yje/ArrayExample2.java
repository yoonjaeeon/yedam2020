package com.yedam.yje;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] intAry = new int[5];
//
//		for (int i = 0; i < 5; i++) {
//			intAry[i] = i * 10 + 10;
//		}
//		System.out.println("_______________");
//		for (int i = 0; i < 5; i++) {
//			System.out.println(intAry[i]);
//		}
	    int[] intAry2 = new int[100];
	    for (int i = 0; i < 100; i++) {
	       intAry2[i] = (i+1) * 5;
	       System.out.print(intAry2[i]+ " ");
	       if(intAry2[i]%25 ==0)
	          System.out.println();	}
	}

}
