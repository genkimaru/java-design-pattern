package com.wg.memento;

import java.util.HashMap;

import com.wg.memento.Originator.State;

/***
 * 
 * @author Administrator
 *����¼���ģʽ �� �����ж���Originator��״̬�����ݴ��뵽Memento�У����memento��������CareTaker�С�
 */
public class MementoPatternDemo {
   public static void main(String[] args) {
	   CareTaker careTaker = new CareTaker();
      Originator originator = new Originator();
      originator.setData(new HashMap<String,String>(){{put("1","a");put("2","b");}});
      originator.setState(State.START);
      careTaker.add(originator.saveStateToMemento());
      originator.setState(State.STOP);
      originator.getData().put("2", "b+");
      careTaker.add(originator.saveStateToMemento());

      System.out.println("Current State: " + originator.getState());		
      originator.getStateFromMemento(careTaker.get(0));
      System.out.println("First saved State: " + originator);
      originator.getStateFromMemento(careTaker.get(1));
      System.out.println("Second saved State: " + originator);
   }
}