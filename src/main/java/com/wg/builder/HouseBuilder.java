package com.wg.builder;

public class HouseBuilder {
	
	private House house = new House();
	
	public HouseBuilder buildRoof(String roof){
		this.house.setRoof(roof);
		return this;
	}
	
	public HouseBuilder buildBase(String base){
		this.house.setBase(base);
		return this;
	}
	
	public HouseBuilder buildDecoration(String decoration){
		this.house.setDecoration(decoration);
		return this;
	}
	
	public HouseBuilder buildBody(String body){
		this.house.setBody(body);
		return this;
	}
	
	public House getHouse(){
		return this.house;
	}
}
