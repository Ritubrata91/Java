package com.ritubrata.collections;

public class KeyObject {

	public KeyObject(final int id, final String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(final int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 1;
	}


	@Override
	public boolean equals(final Object obj) {
		return false;
	}


	int id;
	String name;
}
