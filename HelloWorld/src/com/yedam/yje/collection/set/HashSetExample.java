package com.yedam.yje.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> strSet = new HashSet<>();
		strSet.add("java");
		strSet.add("Oracle");
		strSet.add("Program");
		strSet.add("java");
		System.out.println(strSet.size());

		for (String str : strSet) {
			System.out.println(str);
		}
	}

}
