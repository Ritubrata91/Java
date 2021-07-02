package com.ritubrata.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapUsingObjectAsKey {

	public static void main(final String[] args) {
		final KeyObject object = new KeyObject(24,"rajeev");
		final KeyObject object1 = new KeyObject(25,"rajeev");
		final KeyObject object2 = new KeyObject(24,"rajeev");

		final HashSet<KeyObject> objects = new HashSet<KeyObject>();
		objects.add(object);
		objects.add(object1);
		System.out.println(objects.contains(object2));
		System.out.println("object.hashCode():  " + object.hashCode()
		+ "  object2.hashCode():" + object2.hashCode());

		final Map<KeyObject, String> map = new HashMap<>();
		map.put(object, "zero");
		System.out.println(map.containsKey(object2));
	}

}
