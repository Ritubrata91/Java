package com.ritubrata.collections;

import java.util.HashMap;
import java.util.Map;

public class DetailsOfHashMap {

	public static void findMaxKeyAndValue(final Map<Integer, Integer> map) {
		final Integer maxKey = map.entrySet().stream().max((m1,m2)-> m1.getKey()> m2.getKey()? 1 : -1).get().getKey();
		final Integer maxValue = map.entrySet().stream().max((m1,m2)-> m1.getValue()> m2.getValue() ? 1 : -1).get().getValue();
		System.out.println("Max key is : " + maxKey + " Max value is : " + maxValue);
	}

	public static void findMinKeyAndValue(final Map<Integer, Integer> map) {
		final Integer minKey = map.entrySet().stream().min((m1,m2)-> m1.getKey() > m2.getKey() ? 1 : -1).get().getKey();
		final Integer minValue = map.entrySet().stream().min((m1,m2)-> m1.getValue()  > m2.getValue() ? 1 : -1).get().getValue();
		System.out.println("Min key is : " + minKey + " Min value is : " + minValue);
	}

	public static void printHashMap() {
		final Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 100);
		map.put(10, 50);
		map.put(5, 75);
		map.put(null, 200);
		map.put(3, null);
		map.put(1, 150);
		map.put(null, 300);
		map.put(7, null);
		System.out.println(map);
	}

	public static void main(final String[] args) {
		printHashMap();

		final Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 100);
		map.put(10, 50);
		map.put(5, 75);
		map.put(1, 150);
		findMaxKeyAndValue(map);
		findMinKeyAndValue(map);
	}

}
