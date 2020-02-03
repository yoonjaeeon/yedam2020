package com.yedam.yje.classes;

public class StudentArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] intAry = {1,2,3};
		Student[] stdAry = new Student[3]; // 참조 타입

		Student sn = new Student("choi", 20, 180, 70);

		Student stnt = new Student();

		stnt.setName("hong");
//		stnt.age = -20;
		stnt.setAge(20);  //setAge라는 메소드를 통해 사용
		stnt.setHeight(170);
		stnt.setWeight(65);
		

		Student snt = new Student();
		snt.setName("park");
//		snt.age = 25;
		snt.setAge(25);
		snt.setHeight(180);
		snt.setWeight(75);

		stdAry[0] = sn;
		stdAry[1] = stnt;
		stdAry[2] = snt;
		
		stdAry[0] = stdAry[1]; // 배열 순서 변경
		stdAry[1] = stdAry[2];
		stdAry[2] = stdAry[0];

		for (int i = 0; i < stdAry.length; i++) {
			if (stdAry[i].getName().equals("choi"))            // 주소값
				System.out.println(stdAry[i].getName() + " " + stdAry[i].getAge());
		}
	}//end of main

}//end of class
