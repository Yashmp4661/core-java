//Overloading
package com.tnsif.polymorphism;

public class Point {
	private float x,y;
	
	

	public Point() {
		
		super();
		x=0.0f;
		y=0.0f;
	}



	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}



	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	

}
