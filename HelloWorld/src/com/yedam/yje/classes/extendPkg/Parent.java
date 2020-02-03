package com.yedam.yje.classes.extendPkg;

public class Parent {
   String field1;
   void method1() {
      System.out.println("부모클래스의 메소드1");
   }
   @Override
   public String toString() {
      return "Parent [field1=" + field1 + "]";
   }
   
}