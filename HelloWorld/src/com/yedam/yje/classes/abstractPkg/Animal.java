package com.yedam.yje.classes.abstractPkg;

public abstract class Animal {
	// 필드
	String kind;
	// 기본 생성자 존재.

	// 메소드
	void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	// 추상메소드 // 추상메소드는 정의 되는 부분이 없어야 한다
	abstract void sound();
	abstract void sleep();

}
