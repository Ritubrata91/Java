package com.ritubrata.java8.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambdas_Formation_Gradually {

	/**
	 * @param args the command line arguments
	 */
	public static void main(final String[] args) {
		final List<String> names = Arrays.asList("Paul", "Jane", "Michaela", "Sam");
		//way to sort prior to Java 8 lambdas
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(final String a, final String b) {
				return b.compareTo(a);
			}
		});
		//first iteration with lambda
		Collections.sort(names, (final String a, final String b) -> b.compareTo(a));
		//now remove the return statement
		Collections.sort(names, (final String a, final String b) -> b.compareTo(a));

		//now remove the data types and allow the compile to infer the type
		Collections.sort(names, (a, b) -> b.compareTo(a));





	}

}
