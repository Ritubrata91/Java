package com.ritubrata.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UsageOfFlatMap {
	public static void main(final String[] args){
		final List<String> list = Arrays.asList("Geeks", "GFG",
				"GeeksforGeeks", "gfg");
		list.stream().flatMap(str ->
		Stream.of(str.charAt(2))).
		forEach(System.out::println);
	}
}
