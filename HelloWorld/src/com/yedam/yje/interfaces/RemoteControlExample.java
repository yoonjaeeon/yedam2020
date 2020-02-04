package com.yedam.yje.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null; // Television 과 Audio를 실행
		rc = new Television(); // 인스턴스
		rc.turnOn();
		rc.turnOff();

		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		Television t1 = new Television(); // 구현 객체
		Audio a1 = new Audio();
		rc = t1;
		rc = a1;
	}

}
