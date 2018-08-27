package com.wg.listener;

public class ListenerPatternDemo {
	public static void main(String[] args) {
		
		Host host = new Host();
		Bicycle bicycle = new Bicycle(new Ring());
		host.ride(bicycle);
		
		Thief thief = new Thief();
		thief.ride(bicycle);
	}

}
