package com.ritubrata.string;

public class CountCharacterOccurence {
	public static void main(final String[] args){
		final String s = "Java is java again java again";
		final int count = s.length() - s.replace("a", "").length();
		System.out.println("Number of occurances of 'a' in "+s+" = "+count);
	}
}
