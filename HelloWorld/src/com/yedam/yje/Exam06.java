package com.yedam.yje;

import java.util.Scanner;

public class Exam06 {
	static Student[] stdAry = new Student[10];

	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------");
			System.out.println("1.등록|2.조회|3.리스트|4.수정|5.처리");
			System.out.println("-------------------------");
			System.out.print("선택>");
			int selectNo = scn.nextInt();
			scn.nextLine();
			if (selectNo == 1) {
				System.out.print("이름 등록: ");
				String name = scn.nextLine();
				System.out.println("학번 등록: ");
				String no = scn.nextLine();
				System.out.println("영어점수 등록: ");
				int eScore = scn.nextInt();
				System.out.println("수학점수 등록: ");
				int mScore = scn.nextInt();
				Student std = new Student(name, no, eScore, mScore);
			} else if (selectNo == 2) {
				System.out.println("이름 입력: ");
				String stdName = scn.nextLine();
				Student std = findStudent(stdName);
				System.out.println("학번 입력: ");
				String stdNo = scn.nextLine();
				Student std1 = findStudent(stdNo);
				System.out.println(std);

			} else if (selectNo == 3) {
				for (int i = 0; i < stdAry.length; i++) {
					if (stdAry[i] != null)
						System.out.println(stdAry[i]);
				}
			} else if (selectNo == 4) {

			} else if (selectNo == 5) {
				run = false;
			}
		} // end of while
		System.out.println("프로그램 종료.");
	}
	

//	public static Student findStudent(String stdName,) {
//
//		return std;
//	}

