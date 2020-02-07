package com.yedam.yje.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.yje.interfaces.model.Employees;

public class ServiceProc {
	List<Employees> list = new ArrayList<>(); // 배열 저장 할때
	Service service = new ServiceImpl();
	Scanner scn = new Scanner(System.in);

	// 한건 입력, 전체 조회, 한건 조회, 수정, 삭제
	public void execute() {
		System.out.println("프로그램 시작");
		while(true) {
		System.out.println("================================");
		System.out.println("1.한건 입력2전체 조회3.한건 조회4.수정5.삭제");
		System.out.println("================================");
		int menu = scn.nextInt();
		if(menu==1) {
			System.out.println("id 입력: ");
			System.out.println("firstName 입력: ");
			Employees emp = new Employees();
			emp.setEmloyeeId(employeeId);
			emp.setFirstName(firstName);
		service.addMember(emp, list);
		}else if(menu==2) {
		List<Employees> list = service.getMemberList(list);
		}else if(menu==3) {
		service.getMember(memberId, list);
		}else if(menu==4) {
		service.updateMember(emp, list);
		}else if(menu==5) {
			break;
		}
	}//end of while

}// end of execute
