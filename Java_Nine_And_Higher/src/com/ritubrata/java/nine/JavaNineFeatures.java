package com.ritubrata.java.nine;

import java.util.List;

public class JavaNineFeatures {

	public static void ofMethodExampled() {
		final List<String> list = List.of("red", "green", "blue");
		System.out.println("After using List.of method : " +list);
		list.add("violet"); // throws UnsupportedOperationException

		final List<String> list_two = List.of("red", "green", null); // throws NullPointerException
		System.out.println(list_two);
	}


	public static void main(final String[] args) {
		ofMethodExampled();
	}
}
