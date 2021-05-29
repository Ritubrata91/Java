package com.ritubrata.arrays;

import java.util.HashSet;

public class DuplicateElementsFinder {
	public static void main(final String[] args){
		final String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
		byForLoops(strArray);
		byHashSet(strArray);
	}

	private static void byForLoops(final String[] strArray) {
		for (int i = 0; i < strArray.length; i++){
			for (int j = i+1; j < strArray.length; j++){
				if( strArray[i].equals(strArray[j]) && i != j ){
					System.out.println("Duplicate Element is : "+strArray[j]);
				}
			}
		}
	}

	private static void byHashSet(final String[] strArray) {
		final HashSet<String> set = new HashSet<String>();
		for (final String arrayElement : strArray){
			if(!set.add(arrayElement)){
				System.out.println("Duplicate Element is : "+arrayElement);
			}
		}
	}

}
