package com.yedam.yje.api;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.name = "park";
		m1.age = 10;
		Member m2 = new Member();
		m2.name = "park";
		m2.age = 10;

		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2));

		System.out.println(m1.equals(m2));
		System.out.println(m1.hashCode());
	}
}