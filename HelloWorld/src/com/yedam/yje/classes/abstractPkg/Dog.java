package com.yedam.yje.classes.abstractPkg;

public class Dog extends Animal {
	Dog() {
		kind = "포유류";
	}

	@Override
	void sound() {
		System.out.println(kind + "멍멍");
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		System.out.println("개가 잔다.");
		
	}
}
