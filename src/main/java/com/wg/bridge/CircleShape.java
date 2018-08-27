package com.wg.bridge;

public class CircleShape extends Shape {

	public CircleShape(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	String shape;
	@Override
	public String draw() {
		return  "ELLIPSE";

	}

}
