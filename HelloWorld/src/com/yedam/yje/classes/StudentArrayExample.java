package com.yedam.yje.classes;

public class StudentArrayExample {
	static Student[] stdAry = new Student[3];

	public static Student getStudent(String name) {
		Student st1 = null;
		for (int i = 0; i < stdAry.length; i++) {
			if (stdAry[i].getName().equals(name))
				st1 = stdAry[i];
		}
		return st1;
	}

	public static void main(String[] args) {

		Student sn = new Student("choi", 20, 180, 70);
		Student stnt = new Student();
		stnt.setName("hong");
		stnt.setAge(20);
		stnt.setHeight(170);
		stnt.setWeight(65);
		Student snt = new Student();
		snt.setName("park");
		snt.setAge(25);
		snt.setHeight(180);
		snt.setWeight(76);
		stdAry[0] = sn;
		stdAry[1] = snt;
		stdAry[2] = stnt;

//		for (int i = 0; i < stdAry.length; i++) {
//			if (stdAry[i].getName().equals("choi"))
//				System.out.println(stdAry[i].getName() + " " + stdAry[i].getAge());
//		}
		Student s1 = getStudent("choi");
		System.out.println(s1);
	}// end of main

}// end of class
