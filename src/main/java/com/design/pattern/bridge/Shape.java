package com.design.pattern.bridge;

public abstract class Shape {
	/**
	 * ����ɫ�Žӵ� Shape��
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
