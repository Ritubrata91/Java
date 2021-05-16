package com.ritubrata.string;

import java.util.HashMap;

public class CharacterCountInString {
	public static void printOccuranceofEachCharacter(final String s){

		final HashMap<Character, Integer> map = new HashMap<>();
		int i =0;
		while(i< s.length()){
			final Character c = s.charAt(i);
			if(map.containsKey(c)){
				map.put(c , map.get(c)+1);
			} else if(c != ' ') {
				map.put(c,1);
			}
			i++;
		}
		System.out.println(map);
	}

	public static void main(final String[] args) {
		printOccuranceofEachCharacter("ritubrata aa");
	}

}
