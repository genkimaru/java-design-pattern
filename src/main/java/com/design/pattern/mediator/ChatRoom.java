package com.design.pattern.mediator;

import java.util.Date;

public class ChatRoom {
   public static void showMessage(User user, User user2,String message){
      System.out.println(new Date().toString()
         + " [" + user.getName() +"] : @ "+user2.getName() +"  "+ message);
   }
}
