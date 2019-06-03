package com.design.pattern.mediator;

/***
 * �н������ģʽ �������������֮����ϵ����ʱ�򣬿�����ȡһ���н��࣬���ڷ�װ����֮���ͨѶ����ϵ��
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