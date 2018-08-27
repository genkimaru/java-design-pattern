package com.wg.proxy;

public class ProxyImage implements Image {
	
	String fileName;
	private RealImage realImage;
	
	public ProxyImage(String fileName) {
		super();
		this.fileName = fileName;
	}


	@Override
	public void display() {
		if(realImage == null){
			this.realImage = new RealImage(this.fileName);
		}
		realImage.display();

	}

}
