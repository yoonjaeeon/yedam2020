package com.yedam.yje.interfaces;

public interface RemoteControl {
	// (상수)필드
	// 정적 필드 (값이 정해지면 바꿀수 없다.)
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0; // 위에 포함
	// 생성자는 없다.
	// (추상)메소드
	public abstract void turnOn(); // 인터페이스 안에서는 전부 추상 메소드
	public void turnOff();

}
