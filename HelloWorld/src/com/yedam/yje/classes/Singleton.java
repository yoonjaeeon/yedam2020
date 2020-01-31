package com.yedam.yje.classes;

public class Singleton {
	// 필드
	private static Singleton s1 = new Singleton(); // 생성자 ,외부 접근 불가

	private Singleton() {
	}

	// 메소드
	static Singleton getInstance() {
		return s1; // 반환값

	}

}
