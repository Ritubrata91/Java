package com.ritubrata.inheritance;

public interface MultiplicationTwo {
	default void result() {
		final int x =9;
		final int y = 10;
		System.out.println("Result is : "+ x*y);
	}
}
