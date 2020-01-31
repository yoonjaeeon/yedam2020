package com.yedam.yje.classes;

public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method m = new Method(); //인스턴스 생성 m-> leftField,right
		m.setLeftField(30); //메소드 m.leftField -> 30
		m.setRightField(4);	//메소드 m.rightField -> 4
		int result = m.thisSum() + m.thisMinus(); //연산 필드에 있는 값을 받고 매개값이 없다 sum=30+4 minus=30-4
		int result2 = m.sum(20, 10) * m.minus(30, 25); //연산 필드랑 상관없이 매개값을 받는다
		//출력
		System.out.println("1필드의 계산결과: "+result);
		System.out.println("1두매개값의 계산결과: "+result2);
		
		m.setLeftField(100);//메소드 m.leftField -> 100
		m.setRightField(50);//메소드 m.rightField -> 50
		result = m.thisSum() + m.thisMinus(); // 필드에 있는 값을 받고 매개값이 없다
		System.out.println("2필드의 계산결과: "+result);
		
		m = null; // 위의 값이 null로 변경
 		System.out.println(m.getLeftField());
	}
}
