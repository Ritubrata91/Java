package com.ritubrata.exceptions;

public class CustomException extends Exception {
	int num;

	public CustomException(final int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return Integer.toString(num);
	}

}
