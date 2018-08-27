package com.wg.strategy;

/***
 * 策略模式 ：　　一个上下文对象包含一个策略的接口对象。
 * @author Administrator
 *
 */
public class Context {
	   private Strategy strategy;

	   public Context(Strategy strategy){
	      this.strategy = strategy;
	   }

	   public int executeStrategy(int num1, int num2){
	      return strategy.doOperation(num1, num2);
	   }
	}