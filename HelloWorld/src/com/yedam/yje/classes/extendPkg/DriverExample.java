package com.yedam.yje.classes.extendPkg;

public class DriverExample {
	public static void main(String[] args) {
		Driver d1 = new Driver();
		Vehicle vehicle = new Vehicle();
		d1.drive(vehicle);// 실행
		vehicle = new Bus(); // Promotion
		d1.drive(vehicle);// 실행
		vehicle = new Truck();// Promotion
		d1.drive(vehicle);// 실행
	}
}
