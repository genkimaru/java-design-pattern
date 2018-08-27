package com.wg.listener;

public class Bicycle {
	
	public Bicycle(Ring ring) {
		super();
		this.ring = ring;
	}

	private Ring ring;
	
	public void ride(Person p){
		if( p instanceof Host){
			System.out.println("run...");
		}else if(p instanceof Thief){
			
			ring.ring(new Event("ÄãÊÇÐ¡Íµ"));
		}
		
	}

}
