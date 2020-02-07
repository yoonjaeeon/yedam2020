package com.yedam.yje.interfaces.control;

import java.util.List;
import java.util.Scanner;

import com.yedam.yje.interfaces.impl.EmpServiceImpl;
import com.yedam.yje.interfaces.model.EmpService;
import com.yedam.yje.interfaces.model.Employee;
import com.yedam.yje.interfaces.model.Employees;

public class EmpProc {
   Employee[] employees = new Employee[10];
   Scanner scn = new Scanner(System.in);
   EmpService service = new EmpServiceImpl();

   public void execute() {
      System.out.println("프로그램 시작");
      while (true) {
         System.out.println("==================================================================");
         System.out.println("1.추가기능|2.조회|3.리스트|4.삭제|5.종료|6.DB조회|7.DB입력|8.DB수정|9.DB삭제");
         System.out.println("==================================================================");
         System.out.print("선택> ");
         int menu = scn.nextInt();
         scn.nextLine();
         if (menu == 1) {
            System.out.print("이름: ");
            String name = scn.nextLine();
            System.out.print("사원번호: ");
            int empNo = scn.nextInt();
            System.out.print("급여: ");
            int salary = scn.nextInt();
            Employee emp = new Employee(name, empNo, salary);
            service.addEmp(emp, employees);

         } else if (menu == 2) {
            System.out.print("사원번호 입력: ");
            int no = scn.nextInt();
//            service.searchEmp(no, employees);
            Employees emp = service.getDBEmployee(no);
            System.out.println(emp);

         } else if (menu == 3) {
            service.empList(employees);

         } else if (menu == 4) {
            System.out.println("삭제하고자 하는 사원번호을 입력하세요: ");
            int empNo = scn.nextInt();
            service.delEmp(empNo, employees);

         } else if (menu == 5) {
            break;
         } else if (menu == 6) {
            // service.searchEmployees();

            List<Employees> list = service.getDBEmployees();
            for (Employees emp : list) {
               System.out.println(emp);
            }
         } else if (menu == 7) {
            System.out.println("Last Name 입력");
            String lastName = scn.nextLine();
            System.out.println("이메일 입력");
            String email = scn.nextLine();
            System.out.println("업무 입력");
            String jobId = scn.nextLine();
            Employees emp = new Employees();
            emp.setLastName(lastName);
            emp.setEmail(email);
            emp.setJobId(jobId);
            service.insertEmployees(emp);
         } else if (menu == 8) {
            System.out.println("조회할 사원번호를 입력하세요.");
            int empId = scn.nextInt();
            scn.nextLine();
            System.out.println("급여 인상분 입력하세요. (없으면 Enter 키)");
            String salNum = scn.nextLine();
//            System.out.println(salNum);
            int sal = 0;
            if (salNum != null && !salNum.equals("")) {
               sal = Integer.parseInt(salNum);
            }
            System.out.println("변경할 이메일을 입력하세요.(없으면 Enter 키)");
            String email = scn.nextLine();

            Employees emp = new Employees();
            emp.setSalary(sal);
            emp.setEmail(email);
            emp.setEmployeeId(empId);

            service.updateDBEmp(emp);
         } else if (menu == 9) {
            System.out.println("삭제할 사원번호를 입력하세요.");
            int empId = scn.nextInt();
            service.delDBEmp(empId);
         }
      } // while 문의 끝
      System.out.println("프로그램 종료.");
   } // execute 메소드의 끝
} // 클래스의 끝