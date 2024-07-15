package com.tnsif.polymorphismprgm;

public class Point {
	private float x,y;
	public Point() {
		x=0;
		y=0;
	}
	public Point(float x) {
		this.x=x;
	}
	public Point(float x,float y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
