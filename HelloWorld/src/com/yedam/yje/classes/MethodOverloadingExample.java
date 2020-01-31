package com.yedam.yje.classes;

//메소드 오버로딩: 동일한 메소드 이름을 사용(매개값 갯수가 다르거나 타입이 다르면 됨)
public class MethodOverloadingExample {
   public static void main(String[] args) {

      Student s1 = new Student();
      System.out.println(s1);

      int num1 = 10, num2 = 20;
      double d1 = 1.5, d2 = 2.3;
      sum(d1, d2);
      print(sum(d1, d2)); // double타입을 받아서 실행할 수 있도록 메소드가 정의되어 있어야함.
      print(sum(num1, num2)); // int타입을 받아서 실행할 수 있도록 메소드가 정의되어 있어야함.
      print();
   }

   static void print() {
      System.out.println();
   }

   static void print(String str) {
      System.out.println(str);
   }

   static void print(int str) {
      System.out.println(str);
   }

   static void print(double str) {
      System.out.println(str);
   }

   static int sum(int a, int b) {
      return a + b;
   }

   static int sum(int c, int d, int a) {
      return c + d + a;
   }

   static double sum(double a, double b) {
      return (double) (a + b);
   }
}