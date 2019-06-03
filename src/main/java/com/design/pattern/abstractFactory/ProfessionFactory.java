package com.design.pattern.abstractFactory;

public class ProfessionFactory extends AbstractFactory {

	@Override
	Car getCar(String name) {
return null;
	}

	@Override
	Profession getProfession(String name) {
		if (name.equalsIgnoreCase("programmer")) {
			return new Programmer();
		}else{
			return new Manager();
		}
	}


}
