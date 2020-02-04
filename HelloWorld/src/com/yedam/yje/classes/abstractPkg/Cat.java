package com.yedam.yje.classes.abstractPkg;

public class Cat extends Animal {
	Cat() {
		kind = "포유류";
	}

	@Override
	void sound() {
		System.out.println(kind + "야옹");
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		System.out.println("고양이가 잔다.");
		
	}
}
