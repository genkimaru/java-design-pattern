package com.design.pattern.memento;

import java.util.HashMap;
/***
 *  ��������Ҫ������¼���࣬��Ҫ����������Ҫ������״̬���� �� ��״̬�� ���ݡ�
 * @author Administrator
 *
 */
public class Originator {
	// Originator������״̬
	enum State {
		START , RUNNING , STOP
	}
	// ״̬����
	private State state;
	private HashMap<String, String> data;

	public HashMap<String, String> getData() {
		return data;
	}

	public void setData(HashMap<String, String> data) {
		this.data = data;
	}



	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	// ��״̬��stateΪ���ƴ������Memento��
	public Memento saveStateToMemento() {
		return new Memento(state, (HashMap<String, String>) data.clone());
	}

	public void getStateFromMemento(Memento memento) {
		this.state = memento.getState();
		this.data = memento.getData();

	}
	
	@Override
	public String toString() {
		return "Originator [state=" + state + ", data=" + data.keySet()+  data.values() + "]";
	}

}