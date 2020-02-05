package com.yedam.yje.common;

import com.yedam.yje.classes.Student;

public class StudentExample {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++)
			System.out.println(args[i]);
		Student stn = new Student();
		stn.study();
		Student snt = new Student("name");
		snt.eat();

	}

}
