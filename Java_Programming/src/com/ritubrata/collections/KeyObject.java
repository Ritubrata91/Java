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
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(final Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || !(obj instanceof KeyObject)) {
			return false;
		}
		final KeyObject object = (KeyObject) obj;
		return object.getId() == this.getId() && object.getName() == this.getName();
	}


	int id;
	String name;
}
