package com.wg.abstractFactory;

public class FactoryProduce {

	AbstractFactory produce(String name) {
		if (name.equalsIgnoreCase("car")) {
			return new CarFactory();
		} else {
			return new ProfessionFactory();
		}

	}

}
