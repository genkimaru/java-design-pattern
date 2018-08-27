package com.wg.template;

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
