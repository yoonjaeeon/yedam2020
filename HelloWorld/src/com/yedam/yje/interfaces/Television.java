package com.yedam.yje.interfaces;

public class Television implements RemoteControl { // 인터페이스에 구현
	//필드
	private int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");

	}

}
