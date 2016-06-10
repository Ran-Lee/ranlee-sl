package com.orilore.lr.test1;

import java.util.HashSet;

public class Hushset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();

		set.add("java");

		set.add("Hello");

		set.add("world");

		set.add("hi");

		System.out.println(set);

		for (Object x : set) {

			System.out.println(x);

		}

		String a1 = "Hello";

		set.add(a1);

		set.add(a1);

		System.out.println(a1.hashCode());

		System.out.println(set.size());

	}

}
