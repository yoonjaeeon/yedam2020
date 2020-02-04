package com.yedam.yje.classes;

public class StudentExample {
	public static void main(String[] args) {
		Student.major = "english";

		Student sn = new Student("choi", 20, 180, 70);

		Student stnt = new Student(); // Student 인스턴스
		stnt.study();
		stnt.eat();
		System.out.println(stnt.getAge());

		Student snt = new Student();
		snt.study();
		System.out.println(snt.getAge());
	}
}