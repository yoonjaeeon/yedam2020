package com.yedam.yje.classes.extendPkg;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);

	}

	@Override
	public boolean roll() {
		accumulateRotation++;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "KumhoTire수명: " + (maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "KumhoTire펑크***");
			return false;
		}
	}
}
