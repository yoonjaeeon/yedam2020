package com.yedam.yje.interfaces.model;

public interface EmpService { // 기능 정의
	// 저장 기능. (추상 메소드)
	public void addEmp(Employee emp, Employee[] emps);

	// 조회 기능.
	public void searchEmp(int empNo, Employee[] emps);

	// 리스트
	public void empList(Employee[] emps);

	// 삭제
	public void delEmp(int empNo, Employee[] emps);

}
