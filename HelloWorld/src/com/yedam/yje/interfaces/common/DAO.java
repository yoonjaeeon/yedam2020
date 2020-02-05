package com.yedam.yje.interfaces.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
   public static void main(String[] args) {
      getConnect();
   }
   public static Connection getConnect() {
      Connection conn = null;
      String user = "hr";
      String passwd = "hr";
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver"); //이 부분이 에러가 발생하면 (try catch)통해 e.print를 실행하라.
         conn = DriverManager.getConnection(url,user,passwd);
         System.out.println("연결 성공");
      } catch (ClassNotFoundException | SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      return conn;
   }
   
   public static void close (Connection conn) {
      try {
         conn.close();
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
   
}