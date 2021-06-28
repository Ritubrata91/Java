package com.ritubrata.collections;

public class KeyObject {

	public KeyObject(final int id) {
		this.id = id;
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

	//Depends only on id
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	//Compare only id
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		final KeyObject other = (KeyObject) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}

	int id;
	String name;
}
