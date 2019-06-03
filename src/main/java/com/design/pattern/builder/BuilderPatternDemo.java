package com.design.pattern.builder;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		HouseBuilder builder = new HouseBuilder();
		House house = builder.buildBase("base").buildBody("body")
				.buildDecoration("decoration").buildRoof("roof").getHouse();
		System.out.println(house);
	}

}
