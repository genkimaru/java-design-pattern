package com.wg.abstractFactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		
		
		FactoryProduce produce = new FactoryProduce();
		AbstractFactory factory = produce.produce("car");
		Car car = factory.getCar("benz");
		car.run();
	}
}
