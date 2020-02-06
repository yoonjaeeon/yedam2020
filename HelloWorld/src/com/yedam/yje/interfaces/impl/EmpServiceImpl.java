package com.yedam.yje.interfaces.impl;

import java.util.List;

import com.yedam.yje.interfaces.model.EmpService;
import com.yedam.yje.interfaces.model.Employee;
import com.yedam.yje.interfaces.model.Employees;

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

	@Override
	public void searchEmployees() {
		System.out.println("DB 조회");
		EmpDAO dao = new EmpDAO();
		Employees[] empArray = dao.getEmployees();
		for (Employees emp : empArray) {
			if (emp != null) {
				System.out.println(emp);
			}
		}
//		for (int i = 0; i < empArray.length; i++) {
//			Employees emp = empArray[i];
//			if (emp != null) {
//				System.out.println(emp);
//			}                   
//		}
	}

	@Override
	public void insertEmployees(Employees emp) {
		System.out.println("DB 입력 기능");
		EmpDAO dao = new EmpDAO();
		dao.insertEmployees(emp);

	}

	@Override
	public List<Employees> getDBEmployees() {
		EmpDAO dao = new EmpDAO();
		List<Employees> list = dao.getEmpList();
		return list;
	}

	@Override
	public Employees getDBEmployee() {
		return null;
	}

	@Override
	public void insertDBEmp(Employees emp) {
	}

	@Override
	public void updateDBEmp(Employees emp) {
	}

}
