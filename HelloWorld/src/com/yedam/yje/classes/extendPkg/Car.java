package com.yedam.yje.classes.extendPkg;

public class Car {
//	Tire frontLeft = new Tire("앞왼쪽", 6);
//	Tire frontRight = new Tire("앞오른쪽", 8);
//	Tire backLeft = new Tire("뒤왼쪽", 4);
//	Tire backRight = new Tire("뒤오른쪽", 10);
	Tire[] tires = { new Tire("앞왼쪽", 6), new Tire("앞오른쪽", 8), new Tire("뒤왼쪽", 4), new Tire("뒤오른쪽", 10) };

	int run() {
		for (int i = 0; i < tires.length; i++) {
			if (tires[i].roll() == false) {
				stop();
				return i + 1;
			}
		}
		return 0;
	}

	void stop() {
		System.out.println("자동차가 멈춤니다.");
	}
}
