package com.design.pattern.template;

/**
 * ģ���࣬��װ�����߼�
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
