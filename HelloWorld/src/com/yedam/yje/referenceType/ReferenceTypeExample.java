package com.yedam.yje.referenceType;
class Strong {
	int f1;
	String str;

	void print() {
		System.out.println(f1 + "==" + str);
	}
}

public class ReferenceTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		byte by1 = 10;
		by1 = (byte) num1;

		String str1 = new String("Hello");
		String str2 = new String("Hello");
		str1 = null;

//		Strong str = new Strong();
//		str.f1 = 10;
//		str.str = "first";
//
//		Strong str2 = new Strong();
//		str2.f1 = 10;
//		str2.str = "second";

		System.out.println(str1.toString());
	}

}
