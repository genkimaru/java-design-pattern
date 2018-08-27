package com.wg.memento;

import java.util.HashMap;

import com.wg.memento.Originator.State;
/***
 * 
 * @author Administrator
 *
 */
public class Memento {
	private State state;
	private HashMap<String, String> data;

	/***
	 * 
	 * @param state ״̬������
	 * @param data  ��״̬���е�����
	 */
	public Memento(State state, HashMap<String, String> data) {
		this.state = state;
		this.data = data;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public HashMap<String, String> getData() {
		return data;
	}

	public void setData(HashMap<String, String> data) {
		this.data = data;
	}

}