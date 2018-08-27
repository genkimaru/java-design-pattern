package com.wg.memento;

import java.util.HashMap;
/***
 *  该类是需要做备忘录的类，需要包含两个重要参数，状态名称 和 该状态的 数据。
 * @author Administrator
 *
 */
public class Originator {
	// Originator的运行状态
	enum State {
		START , RUNNING , STOP
	}
	// 状态名称
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

	// 把状态以state为名称存入对象Memento中
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