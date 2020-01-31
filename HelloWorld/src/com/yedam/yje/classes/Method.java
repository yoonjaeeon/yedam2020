package com.yedam.yje.classes;

public class Method {
//	public static void main(String[] args) {
//		int i = sum(1, 2); // return값 반환 메소드
//		System.out.println(i);
//		int num1 = 10, num2 = 15;
//		int result = sum(num1,num2) * minus(num1,num2); //num1,num2의 값을 sum 과  miuns의 결과값 return 값이 있는 메소드
//		System.out.println("결과값은: "+result);
	int leftField;
	int rightField;

//	}  //end of main                                            
//	public static void sum(int a, int b) { // return 값이 없는 메소드
//		System.out.println(a + b);
//	}
	public int getLeftField() {
		return leftField;
	}

	public void setLeftField(int leftField) {
		this.leftField = leftField;
	}

	public int getRightField() {
		return rightField;
	}

	public void setRightField(int rightField) {
		this.rightField = rightField;
	}

	public int thisSum() { 
		return leftField + rightField; //반환
	}

	public int thisMinus() { 
		return leftField - rightField; //반환
	}

	public int sum(int a, int b) {
		int result = 0;
		result = a + b; // 결과를 반환
		return result;
	}

	public int minus(int a, int b) {
		return a - b; // 결과를 반환
	}

}
