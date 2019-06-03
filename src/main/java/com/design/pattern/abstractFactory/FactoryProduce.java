package com.design.pattern.abstractFactory;

public class FactoryProduce {

	AbstractFactory produce(String name) {
		if (name.equalsIgnoreCase("car")) {
			return new CarFactory();
		} else {
			return new ProfessionFactory();
		}

	}

}
