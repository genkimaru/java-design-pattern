package com.wg.bridge;

public abstract class Shape {
	/**
	 * 将颜色桥接到 Shape中
	 */
	Color color;

	public Shape(Color color) {
		super();
		this.color = color;
	}

	abstract String draw();

	void show() {
		System.out.println(color.getColor() + " " + draw());
	}

}
