package com.wg.bridge;

public class BlueColor implements Color {

	String color;

	public  BlueColor() {
		
		this.color = "BLUE";
	}


	@Override
	public String getColor() {
		return this.color;
		
	}

}
