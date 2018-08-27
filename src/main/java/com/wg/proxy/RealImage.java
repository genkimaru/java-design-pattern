package com.wg.proxy;

public class RealImage implements Image {

	
	String fileName;
	
	public RealImage(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void display() {
		 System.out.println("Displaying " + fileName);
		
	}

}
