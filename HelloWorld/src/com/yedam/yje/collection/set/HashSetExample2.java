package com.yedam.yje.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member {
	String name;
	int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// 인스턴스가 동일한 기준으로 정의되려면
	// hashCode(), equals() 재정의되면 됨.
	@Override
	public int hashCode() {

		return this.age;
	}

	@Override
	public boolean equals(Object obj) {
		Member m = (Member) obj;
		return this.name.equals(m.name);
	}

}

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		set.add(new Member("윤재언", 20));
		set.add(new Member("윤재언", 20));
		set.add(new Member("하준원", 20));
		set.add(new Member("홍성우", 20));

		System.out.println(set.size());
		for (Member mem : set) {
			System.out.println(mem.name + "," + mem.age);
		}
		System.out.println("반복자를 통해 for");
		Iterator<Member> iter = set.iterator();
		while (iter.hasNext()) {
			Member m = iter.next();
			System.out.println(m.name + "," + m.age);
		}
	}
}
