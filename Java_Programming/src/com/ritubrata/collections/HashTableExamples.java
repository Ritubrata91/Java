package com.ritubrata.collections;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableExamples {

	public static void main(final String[] args) {
		final Hashtable<Integer, Integer> hashTable = new Hashtable<>();
		hashTable.put(1, 100);
		hashTable.put(100, 1);
		hashTable.put(5, 10);
		hashTable.put(10, 5);

		final Iterator<Integer> itr = hashTable.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(hashTable.get(itr.next()));
		}
	}
}
