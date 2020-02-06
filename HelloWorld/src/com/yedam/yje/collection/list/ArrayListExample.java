package com.yedam.yje.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//EmpService --> EmpServiceImpl
public class ArrayListExample {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("윤재언");
		strList.add("언재"); // strAry[0] = "hello"
		strList.add("재언");
//		System.out.println(strList.get(0));

		strList.add(1, "하준원");
//		System.out.println(strList.get(1));
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		strList.remove(3);
		System.out.println("remove(3) 이후.");
		for (String str : strList) {
			System.out.println(str);
		}
		List<Integer> intList = new LinkedList<>();
	}
}
