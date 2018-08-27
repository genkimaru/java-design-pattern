package com.wg.builder;

public class House {
	
	private String roof;
	
	private String base;
	
	
	private String body;
	
	private String decoration;

	public String getRoof() {
		return roof;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getDecoration() {
		return decoration;
	}

	public void setDecoration(String decoration) {
		this.decoration = decoration;
	}

	@Override
	public String toString() {
		return "House [roof=" + roof + ", base=" + base + ", body=" + body
				+ ", decoration=" + decoration + "]";
	}
	
	

}
