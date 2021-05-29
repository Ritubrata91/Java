package com.ritubrata.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class CountOccurrenceOfElements {
	static void arrayElementCount(final int inputArray[]){
		final HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
		if(inputArray.length == 0) {
			System.out.println("Array Is Empty");
		}else {
			for (final int i : inputArray){
				if(elementCountMap.containsKey(i)){
					elementCountMap.put(i, elementCountMap.get(i)+1);
				}else {
					elementCountMap.put(i, 1);
				}
			}
			System.out.println("Input Array : "+Arrays.toString(inputArray));
			System.out.println("Element Count : "+elementCountMap);
			System.out.println("=======================================");
		}
	}

	public static void main(final String[] args){
		arrayElementCount(new int[]{4, 5, 4, 5, 4, 6});
		arrayElementCount(new int[]{12, 9, 12, 9, 10, 9, 10, 11});
		arrayElementCount(new int[]{891, 187, 891, 187, 891, 476, 555, 741});
		arrayElementCount(new int[]{});
	}
}
