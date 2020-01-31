package com.yedam.yje;

public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for ( int i=1; i<=100; i++ ) {
//			if (i % 3 == 0 && i % 7 == 0)
//	    	System.out.println("3과7의배수: " + i);
//	    }
		int i = 1;
		while (i <= 100) {
			if (i % 3 == 0 && i % 7 == 0)
				System.out.println("3과7의배수: " + i);
			i++;
		}
	}

}
