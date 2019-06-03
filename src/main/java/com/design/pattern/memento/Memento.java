package com.design.pattern.memento;

import java.util.HashMap;

/***
 * 
 * @author Administrator
 *
 */
public class Memento {
	private Originator.State state;
	private HashMap<String, String> data;

	/***
	 * 
	 * @param state ״̬������
	 * @param data  ��״̬���е�����
	 */
	public Memento(Originator.State state, HashMap<String, String> data) {
		this.state = state;
		this.data = data;
	}

	public Originator.State getState() {
		return state;
	}

	public void setState(Originator.State state) {
		this.state = state;
	}

	public HashMap<String, String> getData() {
		return data;
	}

	public void setData(HashMap<String, String> data) {
		this.data = data;
	}

}