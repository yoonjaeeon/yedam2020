package com.yedam.yje.interfaces.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.yje.interfaces.common.DAO;
import com.yedam.yje.interfaces.model.Employees;

public class EmpDAO {
   Connection conn = null;
   PreparedStatement pstmt = null;
   ResultSet rs = null;

   // 1. DB 전체 조회
   public List<Employees> getEmpList() {
      conn = DAO.getConnect();
      String sql = "select * from emp_temp";
      List<Employees> list = new ArrayList<>();
      try {
         pstmt = conn.prepareStatement(sql);
         rs = pstmt.executeQuery();
         while (rs.next()) {
            Employees emp = new Employees();
            emp.setEmployeeId(rs.getInt("employee_id"));
            emp.setFirstName(rs.getString("first_name"));
            emp.setLastName(rs.getString("last_name"));
            emp.setEmail(rs.getString("email"));
            emp.setPhoneNumber(rs.getString("phone_number"));
            emp.setHireDate(rs.getString("hire_date"));
            emp.setJobId(rs.getString("job_id"));
            emp.setSalary(rs.getInt("salary"));
            list.add(emp);
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         DAO.close(conn);
      }
      return list;
   }

   // 2. DB 한 건 조회
   public Employees getEmployee(int emps) {
      conn = DAO.getConnect();
      String sql = "select * from emp_temp " + "where employee_id = ?";
      Employees emp = new Employees();
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, emps);
         rs = pstmt.executeQuery();
         if (rs.next()) {
            emp.setEmployeeId(rs.getInt("employee_id"));
            emp.setFirstName(rs.getString("first_name"));
            emp.setLastName(rs.getString("last_name"));
            emp.setEmail(rs.getString("email"));
            emp.setPhoneNumber(rs.getString("phone_number"));
            emp.setHireDate(rs.getString("hire_date"));
            emp.setJobId(rs.getString("job_id"));
            emp.setSalary(rs.getInt("salary"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         DAO.close(conn);
      }
      return emp;
   }
   // 3. DB 입력

   // 4. DB 수정
   public void updateEmployees(Employees emp) {
      conn = DAO.getConnect();
      String sql = "update emp_temp " + "set first_name = first_name ";
      if (emp.getSalary() != 0)
         sql = sql + ", salary = salary + ? ";
      if (emp.getEmail() != null && !emp.getEmail().equals(""))
         sql = sql + ", email = ? ";
      sql = sql + "where employee_id = ?";
      try {
         int cnt = 0;
         pstmt = conn.prepareStatement(sql);
         if (emp.getSalary() != 0)
            pstmt.setInt(++cnt, emp.getSalary());
         if (emp.getEmail() != null && !emp.getEmail().equals(""))
            pstmt.setString(++cnt, emp.getEmail());
         pstmt.setInt(++cnt, emp.getEmployeeId());
         int r = pstmt.executeUpdate();
         System.out.println(r + "건이 변경되었습니다.");
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         DAO.close(conn);
      }
   }

   // 5. DB 삭제
   public void delEmployees(int emp) {
      conn = DAO.getConnect();
      String sql = "Delete from emp_temp where employee_id = ?";
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, emp);
         pstmt.executeUpdate();
         System.out.println("삭제완료");
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         DAO.close(conn);
      }
   }

   public void insertEmployees(Employees emp) {
      conn = DAO.getConnect();
      String sql = "insert into emp_temp (employee_id, last_name, email, hire_date, job_id)\r\n"
            + "values (employees_seq.nextval, ?, ?, sysdate, ?)";
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, emp.getLastName());
         pstmt.setString(2, emp.getEmail());
         pstmt.setString(3, emp.getJobId());
         int cnt = pstmt.executeUpdate();
         System.out.println(cnt + "건 입력되었습니다.");
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         try {
            conn.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
   }

   public Employees[] getEmployees() {
      conn = DAO.getConnect();
      String sql = "Select * From emp_temp";
      Employees[] emps = new Employees[100];
      int cnt = 0;
      try {
         pstmt = conn.prepareStatement(sql);
         rs = pstmt.executeQuery();
         while (rs.next()) {
            Employees emp = new Employees();
            emp.setEmployeeId(rs.getInt("employee_id"));
            emp.setFirstName(rs.getString("first_name"));
            emp.setLastName(rs.getString("last_name"));
            emp.setEmail(rs.getString("email"));
            emp.setPhoneNumber(rs.getString("phone_number"));
            emp.setHireDate(rs.getString("hire_date"));
            emp.setJobId(rs.getString("job_id"));
            emp.setSalary(rs.getInt("salary"));
            emps[cnt++] = emp;
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         try {
            conn.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      } // try ~ catch문의 끝
      return emps;
   }// getEmployees 메소드의 끝
}// 클래스의 끝