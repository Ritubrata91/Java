package com.ritubrata.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapUsingObjectAsKey {

	public static void main(final String[] args) {
		final Map<KeyObject, String> map = new HashMap<>();

		final KeyObject keyOne = new KeyObject(1);
		final KeyObject keyTwo = new KeyObject(2);

		keyOne.setName("This is first entry");
		keyTwo.setName("This is second entry");

		map.put(keyOne, keyOne.getName());
		map.put(keyTwo, keyTwo.getName());

		keyOne.setName("first");
		keyTwo.setName("second");

		System.out.println(map.get(keyOne));
		System.out.println(map.get(keyTwo));

		final KeyObject keyThree = new KeyObject(1);
		keyThree.setName("This is third entry");

		System.out.println(map.get(keyThree));
	}

}
