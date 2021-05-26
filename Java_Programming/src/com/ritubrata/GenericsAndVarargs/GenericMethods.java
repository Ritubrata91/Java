package com.ritubrata.GenericsAndVarargs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author bethan
 */
public class GenericMethods {

	static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
	static Integer[] intArray = {1, 2, 3, 4, 5};
	static Boolean[] boolArray = {true, false, true};

	public static <T> List<T> arrayToList(final T[] array, final List<T> list) {
		Collections.addAll(list, array);
		return list;
	}

	public static void main(final String[] args) {
		arrayToList(charArray, new ArrayList<>());
		arrayToList(boolArray, new ArrayList<>());
		final List<Integer> intList = arrayToList(intArray, new ArrayList<>());
		System.out.println(intList.get(0));
	}

}
