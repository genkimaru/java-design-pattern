package com.wg.state;

/***
 * 上下文对象，hold一个状态对象。
 * 
 * 对于一个需要记录状态的运行对象，我们可以让它继承一个状态接口，然后当它执行某些需要记录状态的操作时，传入一个上下文对象。
 * @author Administrator
 *
 */
public class Context {
	   private State state;

	   public Context(){
	      state = null;
	   }

	   public void setState(State state){
	      this.state = state;		
	   }

	   public State getState(){
	      return state;
	   }
	}