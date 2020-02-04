package com.yedam.yje.interfaces.impl;

import com.yedam.yje.interfaces.model.EmpService;
import com.yedam.yje.interfaces.model.Employee;

//구현 클래스
public class EmpServiceImpl implements EmpService {

	@Override
	public void addEmp(Employee emp, Employee[] emps) {
//		System.out.println("추가 기능");
		for (int i = 0; i < emps.length; i++) {
			if (emps[i] == null) {
				emps[i] = emp;
				break;
			}
		}
		System.out.println("입력완료");
	}

	@Override
	public void searchEmp(int empNo, Employee[] emps) {
//		System.out.println("조회 기능");
		for (Employee emp : emps) {
			if (emp != null && emp.getEmpNo() == empNo) {
				System.out.println(emp);
			}
		}
		System.out.println("조회가 되지 않습니다.");
	}

	@Override
	public void empList(Employee[] emps) {
//		System.out.println("리스트 기능");
		for (Employee emp : emps) {
			if (emp != null) {
				System.out.println(emp);
			}
		}
	}

	@Override
	public void delEmp(int empNo, Employee[] emps) {
//		System.out.println("삭제 기능");
		for (int i = 0; i < emps.length; i++) {
			if (emps[i] != null && emps[i].getEmpNo() == empNo) {
				emps[i] = null;
			}
		}
	}

}
