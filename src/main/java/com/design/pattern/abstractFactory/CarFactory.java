package com.design.pattern.abstractFactory;

public class CarFactory extends AbstractFactory {

	@Override
	Car getCar(String name) {
		if (name.equalsIgnoreCase("benz")) {
			return new Benz();
		} else {
			return new Toyota();
		}
	}

	@Override
	Profession getProfession(String name) {
		return null;
	}

}
