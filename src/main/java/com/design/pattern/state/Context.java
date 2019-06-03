package com.design.pattern.state;

/***
 * �����Ķ���holdһ��״̬����
 * 
 * ����һ����Ҫ��¼״̬�����ж������ǿ��������̳�һ��״̬�ӿڣ�Ȼ����ִ��ĳЩ��Ҫ��¼״̬�Ĳ���ʱ������һ�������Ķ���
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