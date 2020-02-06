package com.yedam.yje.collection;

public class Person implements Comparable<Person> {
	// 필드
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
//		return this.name.compareTo(o.name); //리턴되는 값에 따라 비교
		return this.name.length() - o.name.length();
	}
}
