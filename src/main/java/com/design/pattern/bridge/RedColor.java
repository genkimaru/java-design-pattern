package com.design.pattern.bridge;

public class RedColor implements Color {

	String color;

	public  RedColor() {
		
		this.color = "RED";
	}
	@Override
	public String getColor() {
		return this.color;
	}

}
