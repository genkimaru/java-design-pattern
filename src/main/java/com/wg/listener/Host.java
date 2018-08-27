package com.wg.listener;

public class Host implements Person {

	@Override
	public void ride(Bicycle bicycle) {
		bicycle.ride(this);

	}

}
