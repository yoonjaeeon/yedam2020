package com.yedam.yje.classes.extendPkg;

public class Tire {
	public int maxRotation; // 최대회전수.
	public int accumulateRotation; // 누적회전수.
	public String location;

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		accumulateRotation++;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "Tire수명: " + (maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "Tire펑크***");
			return false;
		}
	}

}
