package com.yedam.yje.classes;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createCal(6);

	}// end of main

	static void createCal(int mon) {
		int month = mon;
		String[] day = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		int days = getMonthDay(month);
		int firstDay = getFirstDay(month);
		System.out.println(month + "월은 " + getMonthDay(month));
		// 요일 출력
		for (int i = 0; i < day.length; i++) {
			System.out.print(" " + day[i]);
		}
		System.out.println();
		// 월의 첫쨰날의 시작위치 지정
		for (int i = 0; i < firstDay - 1; i++) {
			System.out.print("    "); // 공란만큼 날짜를 밀어주는 문
		}
		// 7일씩 잘라서 출력
		for (int i = 1; i <= days; i++) {
			System.out.printf("%4d", i);
			if ((firstDay - 1 + i) % 7 == 0)
				System.out.println();
		}

	}// end of createCal
		// 2020년 1,2,3,4,5,6월에 해당하는 첫째날의 요일
		// 일=1,월=2,화=3,수=4,목=5,금=6,토=7

	static int getFirstDay(int month) {
		if (month == 1) { // 1월달은 수요일
			return 4;
		} else if (month == 2) { // 2월달은 토요일
			return 7;
		} else if (month == 3) { // 3월달은 일요일
			return 1;
		} else if (month == 4) { // 4월달은 수요일
			return 4;
		} else if (month == 5) { // 5월달은 금요일
			return 6;
		} else if (month == 6) { // 6월달은 월요일
			return 2;
		} else { // 그외의 달은 없다
			return 0;
		}
	}

	// 월 입력 (매개값) 해당월의 날짜를 반환해주는 메소드
	// 1월->31, 2월-> 28, 3월->31, 4월->30, 5월->31, 6월->30,
	// 7월->31, 8월->31, 9월->30, 10월->31, 11월->30, 12월->31
	static int getMonthDay(int month) {
		int days = 0;
		if (month <= 7 && month % 2 == 1) {
			days = 31;
		} else if (month > 7 && month % 2 == 0) {
			days = 31;
		} else if (month == 2) {
			days = 28;
		} else {
			days = 30;
		}
		return days;
	}
}
