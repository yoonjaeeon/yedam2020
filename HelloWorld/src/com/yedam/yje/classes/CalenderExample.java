package com.yedam.yje.classes;

import java.util.Calendar;

public class CalenderExample {
	static void createCal(int year, int mon) {
		
	}
	public static void main(String[] args) {
		int year, month;
		year = 2020;
		month = 3;
		createCal(year,month);
		
		Calendar cal = Calendar.getInstance();
		System.out.println("현재 년도: " + cal.get(Calendar.YEAR)); // 년도
		System.out.println("현재 month: " + cal.get(Calendar.MONTH)); // 월은 결과값0을 1월로 정의
		System.out.println("현재 day: " + cal.get(Calendar.DAY_OF_MONTH)); // 일
		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK)); // 요일
		
		cal.set(2020, 0, 1);
		System.out.println("현재 년도 : " + cal.get(Calendar.YEAR)); // 년도
		System.out.println("현재 month : " + cal.get(Calendar.MONTH)); // 월은 결과값0을 1월로 정의
		System.out.println("현재 day : " + cal.get(Calendar.DAY_OF_MONTH)); // 월
		System.out.println("요일 : " + cal.get(Calendar.DAY_OF_WEEK)); // 요일
		System.out.println("전체 일수 : " + cal.getActualMaximum(Calendar.DAY_OF_MONTH)); //월의 마지막 값
	}
}
