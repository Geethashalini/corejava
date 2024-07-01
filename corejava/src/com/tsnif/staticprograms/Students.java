package com.tsnif.staticprograms;

public class Students {
	private String name;//instance variable
	private int id;
	
	static String collegeName="DBIT";

	public Students(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", id=" + id + "]";
	}

}
