package com.wg.mediator;

/***
 * 中介者设计模式 ：　当多个对象之间联系复杂时候，可以提取一个中介类，用于封装对象之间的通讯和联系。
 * @author Administrator
 *
 */
public class MediatorPatternDemo {
	   public static void main(String[] args) {
	      User robert = new User("Robert");
	      User john = new User("John");

	      robert.sendMessage(john,"Hi! John!");
	      john.sendMessage(robert,"Hello! Robert!");
	   }
	}