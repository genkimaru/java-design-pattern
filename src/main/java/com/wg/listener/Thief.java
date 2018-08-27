package com.wg.listener;

public class Thief implements Person {

	@Override
	public void ride(Bicycle bicycle) {
		bicycle.ride(this);

	}

}
