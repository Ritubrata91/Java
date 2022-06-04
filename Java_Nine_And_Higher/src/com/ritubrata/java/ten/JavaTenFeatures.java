package com.ritubrata.java.ten;

import java.util.Arrays;
import java.util.List;

public class JavaTenFeatures {

	public static void copyOfAndOfMethod() {
		final List<String> list = List.copyOf(Arrays.asList("red", "green", "blue"));
		System.out.println("After using List.copyOf method : "+list);
		list.add("violet");// throws UnsupportedOperationException

		final List<String> list_two = List.copyOf(Arrays.asList("red", "green", null)); // throws NullPointerException
		System.out.println(list_two);
	}

	public static void main(final String[] args) {
		copyOfAndOfMethod();
	}
}
