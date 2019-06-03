package com.design.pattern.bridge;

public class EllipseShape extends Shape {

	public EllipseShape(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	 String draw() {
		return "CIRCLE";

	}

}
