package com.ritubrata.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapUsingObjectAsKey {

	public static void main(final String[] args) {
		final KeyObject object = new KeyObject(1,"abc");
		final KeyObject object1 = new KeyObject(2,"def");
		final KeyObject object2 = new KeyObject(3,"ijk");

		final Map<KeyObject, Integer> map = new HashMap<>();
		map.put(object, 0);
		map.put(object1, 1);
		map.put(object2, 2);

		System.out.println(map.get(object));
		System.out.println(map.get(object1));

		System.out.println(map.size());
	}

}
