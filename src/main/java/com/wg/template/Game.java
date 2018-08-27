package com.wg.template;

/**
 * Ä£°åÀà£¬·â×°¶¥²ãÂß¼­
 * @author Administrator
 *
 */
public abstract class Game { 
	
	void play(){
		init();
		start();
		end();
		
	}

	abstract void init() ;
	abstract void start() ;
	abstract void end() ;
	

}
