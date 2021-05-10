package com.ritubrata.arrays;

import java.util.Arrays;

public class RemoveDuplicateElements {

	static void removeDuplicates(final int[] arrayWithDuplicates){
		System.out.println("Array With Duplicates : "+Arrays.toString(arrayWithDuplicates));
		int noOfUniqueElements = arrayWithDuplicates.length;
		for (int i = 0; i < noOfUniqueElements; i++){
			for (int j = i+1; j < noOfUniqueElements; j++){
				if(arrayWithDuplicates[i] == arrayWithDuplicates[j]){
					arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements-1];
					noOfUniqueElements--;
					j--;
				}
			}
		}
		final int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);
		System.out.println("Array Without Duplicates : "+Arrays.toString(arrayWithoutDuplicates));
		System.out.println("==============================");
	}

	public static void main(final String[] args){
		removeDuplicates(new int[] {4, 3, 2, 4, 9, 2});
		removeDuplicates(new int[] {1, 2, 1, 2, 1, 2});
		removeDuplicates(new int[] {15, 21, 11, 21, 51, 21, 11});
		removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});
	}
}
