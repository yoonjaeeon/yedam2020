package com.yedam.yje.interfaces.model;

import java.util.List;

public interface EmpService { // 기능 정의
	// 저장 기능. (추상 메소드)
	public void addEmp(Employee emp, Employee[] emps);

	// 조회 기능.
	public void searchEmp(int empNo, Employee[] emps);

	// 리스트
	public void empList(Employee[] emps);

	// 삭제
	public void delEmp(int empNo, Employee[] emps);

	// DB 연결 조회 기능
	public void searchEmployees();

	// DB 입력 기능
	public void insertEmployees(Employees emp);

	// ==> collection 디비 처러.
	// 1. 전체데이터조외.
	public List<Employees> getDBEmployees();

	// 2. 한건조회.
	public Employees getDBEmployee();

	// 3.입력
	public void insertDBEmp(Employees emp);

	// 4.수정
	public void updateDBEmp(Employees emp);
}
