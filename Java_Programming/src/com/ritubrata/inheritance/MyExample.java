package com.ritubrata.inheritance;

public class MyExample implements DefaultAndStaticMethodInterface {

	@Override
	public void abstractMethod(final String str) {
		System.out.println("Abstract Method in child class " + str);
	}

	@Override
	public void defaultMethod() {
		System.out.println("Default method overridden in child class");
	}

	static void staticMethod() {
		System.out.println("Static method overridden in Class");
	}

	public static void main(final String[] args) {
		final MyExample obj = new MyExample();
		obj.abstractMethod("abc");
		obj.defaultMethod();
		MyExample.staticMethod();
		DefaultAndStaticMethodInterface.staticMethod();
	}
}
